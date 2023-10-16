package Lessons.L13_Collections.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Test {
    public static void main(String[] args) {

        Map<String, Integer> fruits = new TreeMap<>();
        fruits.putIfAbsent("Banana", 6);
        fruits.putIfAbsent("Grape", 5);
        fruits.putIfAbsent("Apple", 4);
        System.out.println(fruits);

    }
}
