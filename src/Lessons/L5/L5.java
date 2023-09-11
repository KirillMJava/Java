package Lessons.L5;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class L5 {
    public static void main(String[] args) {
        //task1();
        //task1_2();
        //task2();
        //task3();
        //task4();
        task6();
    }


    public static void task1() {
        System.out.println("Task1");
        int[][] mass2 = new int[4][4];
        Random random = new Random();
        for (int i = 0; i < mass2.length; i++) {
            for (int j = 0; j < mass2[i].length; j++) {
                mass2[i][j] = random.nextInt(1, 9);
                System.out.print(mass2[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void task1_2() {
        System.out.println("Task1.2");
        int[][] mass2 = new int[4][4];
        Random random = new Random();
        int max=0;
        for (int i = 0; i < mass2.length; i++) {
            for (int j = 0; j < mass2[i].length; j++) {
                mass2[i][j] = random.nextInt(1, 100);
                System.out.print(mass2[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < mass2.length; i++) {
            for (int j = 1; j < mass2[i].length; j++) {
                if (mass2[i][j-1]>max)
                    max=mass2[i][j-1];
            }
        }
        System.out.println("Max: "+max);
    }

    public static void task2 (){
        System.out.println("Task2");
        int [][]massZ=new int[3][];
        massZ[0]=new int[5];
        massZ[1]=new int[2];
        massZ[2]=new int[6];
        for (int i=0; i< massZ.length; i++){
            for (int j=0; j< massZ[i].length; j++){
                System.out.print(massZ[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void task3 (){
        System.out.println("Task3");
        int[][] mass2 = new int[4][4];
        Random random = new Random();
        int a=0;
        for (int i = 0; i < mass2.length; i++) {
            for (int j = 0; j < mass2[i].length; j++) {
                mass2[i][j] = random.nextInt(1, 9);
                System.out.print(mass2[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < mass2.length; i++) {
            for (int j = 0; j < mass2[i].length; j++) {
               if (i==j)
                a=a+mass2[i][j];
            }
        }
        System.out.println(a);
    }

    public static void task4 (){
        int [][]x=new int[3][4];
        int i=0;
        for (int m = 0; m < x.length; m++) {
            for (int n = 0; n < x[m].length; n++) {
                x[m][n]=i+1;
                i++;
                System.out.print(x[m][n]+" ");
            }
            System.out.println();
            }
        for (int m = 0; m < x.length; m++) {
            for (int n = 0, n1=x[m].length-1; n < x[m].length/2; n++) {
                i=x[m][n];
                x[m][n]=x[m][n1];
                x[m][n1]=i;
                n1--;
            }
        }
        System.out.println();
        for (int m = 0; m < x.length; m++) {
            for (int n = 0; n < x[m].length; n++) {
                System.out.print(x[m][n]+" ");
            }
            System.out.println();
        }
    }

    public static void task6 (){
        String[] s=new String[8];
        s[0]="c";
        s[1]=" ";
        s[2]="a";
        s[3]=" ";
        String a=null, b=null;
        System.out.println(Arrays.toString(s));
        for (int i=0; i<s.length; i++){
            if (s[i]==" "){
                if (s[i+1]!=null & s[i]!=" "){
                a=s[i+1];
                s[i+3]=a;
                }
                if (s[i+2]!=null & s[i]!=" "){
                    b=s[i+2];
                    s[i+4]=b;
                }
                s[i]="%";
                s[i+1]="2";
                s[i+2]="0";
            }
        }
        System.out.println(Arrays.toString(s));




    }


}