package HW.L3;

import java.util.Scanner;
public class HW_L3 {
    public static void main(String[] args) {

        System.out.println("Task1. enter your number:");
        Scanner enterNumber=new Scanner(System.in);
        int a= enterNumber.nextInt();

        if (a%2==0)
            System.out.println("Число чётное");
        else System.out.println("Число нечётное");
        System.out.println();

        System.out.println("Task2. enter temperature:");
        Scanner temperature=new Scanner(System.in);
        int t=temperature.nextInt();
        if (t>-5)
            System.out.println("Warm");
        else if (t<=-20)
            System.out.println("Cold");
        else
            System.out.println("Normal");
        System.out.println();

        System.out.println("Task3");
        for (int i=10; i<21; i++)
        {
            System.out.print(i*i +" ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Task4");
        int c=7;
        while (c<99){
            System.out.print(c +" ");
            c+=7;
        }
        System.out.println();
        System.out.println();



        System.out.println("Task*");
        Scanner vvodChisla=new Scanner(System.in);
        System.out.println("Введите ваше число:");
        if (vvodChisla.hasNextInt()) {
            int d = vvodChisla.nextInt();

            while (d <= 0) {
                System.out.println("Введите положительное число");
                d = vvodChisla.nextInt();
                if (d > 0) {
                    System.out.println("Суммирую числа от 1 до "+d+":");
                    for (int i=1; i<d; i++)
                    {
                        System.out.print(i+"+");
                    }
                    System.out.println(d);
                    break;
                }
            }
            vvodChisla.close();
        }
        else {
            System.out.println("Вы ввели не число, попробуйте запустить программу ещё раз");
        }
    }
}
