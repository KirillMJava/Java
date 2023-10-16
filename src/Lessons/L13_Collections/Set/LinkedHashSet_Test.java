package Lessons.L13_Collections.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

    class LinkedHashSet_Test {
        public static void main(String[] args) {
            Set<String> fruits = new LinkedHashSet<>();
            fruits.add("apple");
            fruits.add("grapefruit");
            fruits.add("banana");
            System.out.println(fruits);
        }

}
