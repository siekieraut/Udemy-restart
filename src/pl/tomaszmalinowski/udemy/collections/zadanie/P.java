package pl.tomaszmalinowski.udemy.collections.zadanie;

import java.util.Map;
import java.util.TreeMap;

public class P {

    public static void main(String[] args) {

        Map<Integer, Integer> treeMap = new TreeMap<>();

        treeMap.put (1,1);
        treeMap.put (2,3);
        treeMap.put (3,3);
        treeMap.put (4,4);
        treeMap.put (5,4);
        treeMap.put (0,0);

        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }

    }

}
