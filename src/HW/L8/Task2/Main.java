package HW.L8.Task2;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Apple apple=new Apple();
        int color1=0;
        System.out.println(color1);
        try{
            Field field = apple.getClass().getDeclaredField("color");
            field.setAccessible(true);
            color1=(int)field.get(apple);
            int i = 8;
            field.setInt(apple, 9);
            System.out.println(color1);
        } catch (NoSuchFieldException | IllegalAccessException e){
            e.printStackTrace();
        }

    }

}
