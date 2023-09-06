package Lessons.L4;

import java.util.Arrays;
import java.util.Scanner;
public class L4 {
    public static void main(String[] args) {

        System.out.println("Task1");
        for(int i=0; i<5; i++){
            double rand=Math.random();
            rand=rand*20;
            double vozv=Math.pow(((int)rand),2);
            System.out.print((int)vozv+" ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Task2");
        String[]fruits=new String[]{"Apple","Lemon","Banana","Orange"};
        System.out.println(fruits[1] +" "+ fruits[3]);
        System.out.println("Длинна массива fruits: "+fruits.length);
        fruits[2]="Pineapple";
        System.out.println(fruits[2]);
        System.out.println();

        System.out.println("Task3");
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int l=sc.nextInt();
        double[]massDouble=new double[l];
        for (int i=0; i<massDouble.length; i++){
           massDouble[i]=Math.random();
           massDouble[i]=massDouble[i]*10;
           System.out.print("Элемент "+i+": "+(int)massDouble[i]+"; ");
           if (((int)massDouble[i])%2==0) {
               massDouble[i]=Math.pow((int)massDouble[i], 2);
           }
           System.out.println((int)massDouble[i]+" ");
        }
        System.out.println();
        for (int i=0; i< massDouble.length; i++){
            System.out.print((int)massDouble[i]+" ");
        }
        System.out.println();
        for (int i= massDouble.length-1; i>=0; i--){
            System.out.print((int)massDouble[i]+" ");
        }





    }
}
