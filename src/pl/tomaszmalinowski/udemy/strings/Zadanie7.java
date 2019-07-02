package pl.tomaszmalinowski.udemy.strings;

import java.util.SplittableRandom;

public class Zadanie7 {

    public static void main(String[] args) {

        encrypt("test");
        String x = encrypt("test");
        decrypt(x);
        String y = decrypt(x);

        System.out.println("in enc: " + "test");
        System.out.println("out enc: " + x);

        System.out.println("in dec: " + x);
        System.out.println("out dec: " + y);


    }

    public static String encrypt(String in) {
        String encrypted = "";
        String encryting0 = in.replace("t", "1");
        String encryting1 = encryting0.replace("e", "2");
        String encryting2 = encryting1.replace("s", "3");
        String encryting3 = encryting2.replace("t", "4");

        return encrypted = encryting3;


    }


    public static String decrypt(String out) {
        String decrypted = "";
        String decripting0 = out.replace("1","t");
        String decripting1 = decripting0.replace("2","e");
        String decrtpting2 = decripting1.replace("3", "s");

        return decrypted = decrtpting2;


    }
}
