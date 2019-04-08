package pl.tomaszmalinowski.udemy.methods;

public class Methods {

    public static void main(String[] args) {
        sayHi();
        sayHi();
        hi("Remek");
        hi("Krzychu", "Piotr");
        hi("remek", "krzychu", "piotr");

        System.out.println(addition(9, addition(4, 3, 2)));

        System.out.println(checkBy3(4));
        // foo();
        System.out.println(factorial(25));

    }

    //metoda bezparametrowa
    private static void sayHi() {
        System.out.println("Hi Tomek");
    }
/*
//metoda parametrowa
    private static void hi (String name) {
        System.out.println("Hi " + name);
    }

    private static void hi (String name, String name2) {
        System.out.println("Hi " + name + ", " + name2);
    }
*/

    private static void hi(String... names) {
        String resoult = "";
        for (String s : names) {
            resoult = resoult + s + ",";
        }
        System.out.println("Hi " + resoult);

    }

    private static int addition(int... a) {
        int resoult = 0;
        for (int i : a) {
            resoult += i;
        }
        return resoult;
    }

    private static boolean checkBy3(int a) {
/*
        if (a % 3 == 0) {
            return true;
        } else {
            return false;
        }
UPROSZCZENIE
*/
        return a % 3 == 0;
    }
// Pętla nieskończona
    private static void foo () {
        System.out.println("foo");
        foo();
    }

// SILNIA  n!  5!  = 1*2*3*4*5
    private static long factorial (long n) {
        if (n==1)
            return 1;
        else
            return (n*factorial(n-1));

    }


}
