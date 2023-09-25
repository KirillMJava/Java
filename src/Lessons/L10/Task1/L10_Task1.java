package Lessons.L10.Task1;

import java.util.Arrays;

public class L10_Task1 {
    public static void main(String[] args) {

        //Task1.1
        String s1="Hello";
        String s2="Java";
        String s3=s1+s2;
        String s4=s1.concat(s2).concat(s3);
        String s5=String.join(" ", s1, s2);
        System.out.println(s5);

        //Task1.2
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        //Task1.3
        String abc="ABCDEFGHIJK";
        System.out.println(abc.substring(2));

        //Task1.4
        System.out.println(abc.length());

        //Task1.5
        System.out.println(abc.indexOf('C'));

        //Task1.6
        s3+=true;
        System.out.println(s3);

        //Task1.7
        System.out.println(s3.toUpperCase());

        //Task1.8
        String sReplace="1111Asdasd!!!!11111";
        System.out.println(sReplace.replace('1', '%'));

        //Task1.9
        String sTrim="   Get over there    ";
        System.out.println(sTrim.trim());

        //Task1.10
        String sEmpty="";
        System.out.println(sEmpty.isEmpty());

        //Task1.11
        String sDelimeter="123212321232123";
        System.out.println(Arrays.toString(sDelimeter.split("1")));




    }
}
