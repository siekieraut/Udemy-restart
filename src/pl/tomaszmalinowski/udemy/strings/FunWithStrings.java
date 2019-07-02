package pl.tomaszmalinowski.udemy.strings;

import pl.tomaszmalinowski.udemy.Zadanie6.Customer;

public class FunWithStrings {

    public static void main(String[] args) {

        Customer customer89 = new Customer("Tomaasz", "Malinowski", "5862959085", "test@wp.pl", "LAS");

        String text = "a".concat("b");
        String text2 = "a" + "b";

        System.out.println(text);
        System.out.println(text2);

/*
        if (text == text2) {
            System.out.println("equals");
        }
        nie używamy takiego porównania do obiektów
*/
        if (text.equals(text2)) {
            System.out.println("equals");
        }

        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

        String s = "a,b,c,d,e,f,g,h,i,j";
        String[] strings = s.split(",");

        System.out.println(strings[2] + "," + strings[9]);

        String results = "";
        for (String str : strings) {
            results = results + str + ", ";
        }
        System.out.println(results);

    }
}
