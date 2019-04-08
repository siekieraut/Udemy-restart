package pl.tomaszmalinowski.udemy.loops;

import java.beans.beancontext.BeanContextServiceAvailableEvent;

public class Loops {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {//for(int i = 1; i<=10; i++)
            System.out.println("nr# " + i);
        }

//        for(;;) {
//            System.out.println("p");
//        }

        int j = 20;
        for (; j > 10; j--) {
            System.out.println(j);
        }
        //pętla zagnieżdzona
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " - ");
            for (int l = 0; l < 10; l++) {
                System.out.print(l + ", ");
            }
            System.out.println("");
        }


        int[] ints = {4, 3, 125, 3, 90, 15,};

        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

        //foreacha
        //wymagana ilośc powtużeń

        System.out.println("---------------foreach-------------------");

        for (int i : ints) {
            System.out.println(i);
        }

        // while
        //nie musi wiedziec kiedy bedze zakończona

        System.out.println("---------------while-------------------");

//        while(true) {
//            System.out.println(true);
//        }
        int z = 200;

//        while(z>-200) {
//            z--;
//            System.out.println(z);
//        }

        while (z % 3 != 0) {
            z--;
            System.out.println(z);
        }

        // do while
        //

        System.out.println("--------------- do while-------------------");

        do {
            System.out.println(false);
        }
        while (false);


        // LABLES

        System.out.println("--------------- LABLES -------------------");

        LABEL: //label moze zawierać dowolny tekst
        for (int i = 0; i < 10; i++) {
            System.out.println("i= " + i);
            for (int k = 0; k < 100; k++) {
                System.out.println("k= " + k);
                continue LABEL;
                // break LABEL;
            }

        }


    }


}

