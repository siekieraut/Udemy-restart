package pl.tomaszmalinowski.udemy.conditionalstatments;

public class Zadanie3 {

    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {
            if (i == 987) {
                System.out.print(i);
            } else if (i % 3 == 0 && i % 7 == 0) {
                System.out.print(i + ", ");
            }

        }
    }
}
