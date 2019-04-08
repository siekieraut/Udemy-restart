package pl.tomaszmalinowski.udemy.loops;

public class Zadanie2 {

    public static void main(String[] args) {

        int[] ints = {5,7,8,9,6,7,8,9};

        for (int i : ints) {
            System.out.print(i+ ", ");

        }
        System.out.println("Suma = " + (ints[0]+ints[1]+ints[2]+ints[3]+ints[4]+ints[5]+ints[6]+ints[7]));


    }
}
