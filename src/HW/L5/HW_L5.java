package HW.L5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class HW_L5 {
    public static void main(String[] args) {

        //task1();
        //task2();
        task3();
    }

    public static void task1 (){
        System.out.println("Task1");
        Random rand=new Random();
        Scanner skann=new Scanner(System.in);
        if (skann.hasNextInt()) {
            int s = skann.nextInt();
            int summ=0;
            int[][] mass=new int[4][4];
            System.out.println("Прибавляем число "+s+" к каждому эл-ту массива");
            for (int i=0; i<mass.length; i++){
                for(int j=0; j< mass[i].length; j++){
                    mass[i][j]= rand.nextInt(1,10);
                    mass[i][j]=mass[i][j]+s;
                    summ=summ+mass[i][j];
                    System.out.print(mass[i][j]+" ");
                }
                System.out.println();
            } System.out.println("Сумма всех эл-тов: "+summ);
        } else System.out.println("Вы ввели неверное значение, перезапустите программу");
    }

    public static void task2(){
        System.out.println("Task2");
        String[][] desk=new String[8][8];
        String w="W";
        String b="B";
        for (int i=0; i<desk.length; i=i+2){
            for (int j=0; j<desk[i].length; j=j+2){
                desk[i][j]=w;
                desk[i][j+1]=b;
            }
        }
        for (int i=1; i<desk.length; i=i+2){
            for (int j=0; j<desk[i].length; j=j+2){
                desk[i][j]=b;
                desk[i][j+1]=w;
            }
        }
        for (int i=0; i<desk.length; i++){
            for (int j=0; j<desk[i].length; j++){
                System.out.print(desk[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void task3 (){
        System.out.println("Task*");
        Scanner n=new Scanner(System.in);
        Scanner m=new Scanner(System.in);
        System.out.println("Введите n:");
        if (n.hasNextInt()){
            int a=n.nextInt();
            System.out.println("Введите m:");
            if (m.hasNextInt()){
                int b= m.nextInt();
                int[][] snake=new int[a][b];
                int k=0;
                for (int i=0; i< snake.length; i++) {

                    if (i%2==0) {
                        for (int j = 0; j < snake[i].length; j++) {
                                snake[i][j] = k;
                                k++;
                        }
                    } else {
                            for (int j = snake[i].length - 1; j >= 0; j--) {
                                    snake[i][j] = k;
                                    k++;
                            }
                    }
                }
                for (int i=0; i<snake.length; i++){
                    for (int j=0; j< snake[i].length; j++){
                        if (snake[i][j]<10) {
                            System.out.print(" "+snake[i][j] + " ");
                        } else if (snake[i][j]<100)
                            System.out.print(snake[i][j]+" ");
                        else break;
                    }
                    System.out.println();
                }

            } else System.out.println("Вы ввели неверное значение");
        } else System.out.println("Вы ввели неверное значение");
    }



}


