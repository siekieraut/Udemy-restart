package pl.tomaszmalinowski.udemy.utils;

public class StrUtils {
    public static String removeLastSeparator(String text, String separator) {
        return text.substring(0, text.lastIndexOf(separator));
        /*
        metoda usuwająca ostatni znak podziału
        static dzieki temu nie musimy tworzyć obiektu metody
         */
    }
}
