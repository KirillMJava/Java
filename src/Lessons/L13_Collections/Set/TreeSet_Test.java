package Lessons.L13_Collections.Set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Test {

    public static void main(String[] args) {
        Set<String> fruits = new TreeSet<>();
        fruits.add("apple");
        fruits.add("grapefruit");
        fruits.add("banana");
        System.out.println(fruits);
    }

}
