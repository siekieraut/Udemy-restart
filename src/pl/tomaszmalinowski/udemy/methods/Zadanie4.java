package pl.tomaszmalinowski.udemy.methods;

public class Zadanie4 {
    public static void main(String[] args) {
        System.out.println(checkFirst(11));
    }

    private static boolean checkFirst(long a) {
        boolean isFirst = true;
        long counter = a-1;
        for (; counter>1; counter--) {
            if (a%counter == 0) {
                isFirst = false;

                break;
            }
        }
        return  isFirst;

    }
}
