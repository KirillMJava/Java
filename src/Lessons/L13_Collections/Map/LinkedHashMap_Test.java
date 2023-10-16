package Lessons.L13_Collections.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_Test {
    public static void main(String[] args) {

        Map<String, Integer> fruits = new LinkedHashMap<>();
        fruits.putIfAbsent("Apple", 5);
        fruits.putIfAbsent("Banana", 6);
        fruits.putIfAbsent("Grape", 5);
        fruits.putIfAbsent("Apple", 4);
        System.out.println(fruits);

    }
}
