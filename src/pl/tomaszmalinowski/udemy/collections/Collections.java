package pl.tomaszmalinowski.udemy.collections;

import java.util.*;
import java.util.stream.IntStream;

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

        treeSet.addAll(list);
        System.out.println(treeSet); //porzadkuje w sposón naturalny dla zmiennej - string, alfabetycznie

        hashSet.addAll(list);
        System.out.println(hashSet); // nie gwarantuje kolejności

        Map<String, String> hashMap = new HashMap<>();
        Map<String, String> treeMap = new TreeMap<>();

        hashMap.put("pierwszy", "first");
        hashMap.put("drugi", "secend");
        treeMap.putAll(hashMap);

        for (String str : hashMap.values()) {

        }

        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            entry.getKey();
            entry.getValue();
        }

        list.stream()
                .filter(s -> s.startsWith("a"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
        IntStream.range(0,10)
                .forEach(System.out::println);

    }
}
