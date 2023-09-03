package Lessons.L3;

import java.util.Scanner;
import java.util.SortedMap;

public class L3 {
    public static void main(String[] args) {


        System.out.println("Task1");
        Scanner sk=new Scanner(System.in);
        String a=sk.next();

        switch (a)
        {
            case "1" :
                System.out.println("January");
                break;
            case "2" :
                System.out.println("February");
                break;
            case "3" :
                System.out.println("March");
                break;
            case "4" :
                System.out.println("April");
                break;
            case "5" :
                System.out.println("May");
                break;
            case "6" :
                System.out.println("June");
                break;
            case "7" :
                System.out.println("July");
                break;
            case "8" :
                System.out.println("August");
                break;
            case "9" :
                System.out.println("September");
                break;
            case "10" :
                System.out.println("October");
                break;
            case "11" :
                System.out.println("November");
                break;
            case "12" :
                System.out.println("December");
                break;
        }


        System.out.println("Task2");
        int b=0;
        while (b<23){
            System.out.print(b++ +" ");
        }

        System.out.println("Task3");
        for (int i=2; i<21; i++ ){
            if(i<=10)
                continue;
            if (i%2!=0)
                continue;
            System.out.println(i);
        }



    }
    }
