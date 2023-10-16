package Lessons.L13_Collections.List;

import java.util.List;

    class ArrayList_Test {
    public static void main(String[] args) {
        List<String> fruits=new java.util.ArrayList<>();
        fruits.add("apple");
        fruits.add("grapefruit");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add(2,"apple");
        System.out.println(fruits);


    }

}
