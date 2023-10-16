package Lessons.L13_Collections.List;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

    class LinkedList_Test {
    public static void main(String[] args) {
        List<String> fruits=new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Watermelon");
        fruits.add("Lemon");
        fruits.add(3, "apple");
        System.out.println(fruits);
    }
}
