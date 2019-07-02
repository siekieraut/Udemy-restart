package pl.tomaszmalinowski.udemy.strings;

import pl.tomaszmalinowski.udemy.Zadanie6.Customer;
import pl.tomaszmalinowski.udemy.utils.StrUtils;

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
        System.out.println(StrUtils.removeLastSeparator(results, ","));

        String res = "";

        StringBuilder sb = new StringBuilder();
        //StringBuilder kiedy mamy kilka wątków w aplikacji
        for (int i = 0; i <1000000 ; i++) {
            sb.append("a");
        }
        System.out.println(sb.toString());
        // dużo bardziej wydajne 1000 x szybciej dodaje napisy



//        for (int i = 0; i <1000000 ; i++) {
//            res +="a";
//        }
//        System.out.println(res);
//         metoda nie wydajna
    }
}
