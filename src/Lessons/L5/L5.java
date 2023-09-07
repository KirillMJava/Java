package Lessons.L5;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class L5 {
    public static void main(String[] args) {
        task1();


    }



    public static void task1(){
        System.out.println("Task1");
        int[][] mass2 =new int[4][4];
        Random random=new Random();
        for (int i=0; i< mass2.length; i++){
            for (int j=0; j<mass2[i].length; j++){
                mass2[i][j]= random.nextInt(1,9);
                System.out.print(mass2[i][j]+" ");
            }
            System.out.println();
         }
    }



}