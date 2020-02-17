package pl.tomaszmalinowski.udemy.exceptions;

public class Zadanie13 {

    public static void main(String[] args) {
        try{
            System.out.println("try");
            System.exit(0);
        } catch (java.lang.Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }
}
