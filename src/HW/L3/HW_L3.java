package HW.L3;

import java.util.Scanner;
public class HW_L3 {
    public static void main(String[] args) {

        System.out.println("Task1");
        Scanner vvodChisla=new Scanner(System.in);
        int a= vvodChisla.nextInt();
        System.out.println(a);
        if (a%2==0)
            System.out.println("Число чётное");
        else System.out.println("Число нечётное");
        vvodChisla.close();



    }
}
