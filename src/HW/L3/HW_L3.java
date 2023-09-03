package HW.L3;

import java.util.Scanner;
public class HW_L3 {
    public static void main(String[] args) {

        System.out.println("Task1. enter your number:");
        Scanner enterNumber=new Scanner(System.in);
        int a= enterNumber.nextInt();
        System.out.println(a);
        if (a%2==0)
            System.out.println("Число чётное");
        else System.out.println("Число нечётное");


        System.out.println("Task2. enter temperature:");
        Scanner temperature=new Scanner(System.in);
        int t=temperature.nextInt();
        if (t>-5)
            System.out.println("Warm");
        else if (t<=-20)
            System.out.println("Cold");
        else
            System.out.println("Normal");

        System.out.println("Task3");
        for (int i=10; i<21; i++)
        {
            System.out.println(i*i);
        }



    }
}
