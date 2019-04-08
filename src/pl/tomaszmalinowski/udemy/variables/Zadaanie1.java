package pl.tomaszmalinowski.udemy.variables;

public class Zadaanie1 {

    public static void main(String[] args) {
        int[] ints;
        ints = new int [3];

        ints[0] = 15;
        ints[1] = 3;
        ints[2] = 21;

        int suma = ints[0] + ints[1] + ints[2];
        int iloczyn = ints[0]*ints[2]*ints[2];
        System.out.println(suma);
        System.out.println(iloczyn);
    }
}
