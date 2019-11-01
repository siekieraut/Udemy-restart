package pl.tomaszmalinowski.udemy.collections;

import java.util.*;

public class Collections {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("axc");
        list.add("text");
        list.add("text");
        list.add("abc");
        System.out.println(list);

        Set<String> treeSet = new TreeSet<>();
        Set<String> hashSet = new HashSet<>(); //set wyświetla elementy listy bez powturek

        hashSet.addAll(list);
        System.out.println(hashSet);

    }
}
