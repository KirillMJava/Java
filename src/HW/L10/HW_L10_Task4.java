package HW.L10;

import java.util.Arrays;
import java.util.Scanner;

public class HW_L10_Task4 {
    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);

        String[] massString = new String[3];

        //Скорее всего здесь нужно решать через многомерные массивы, но я реально out of time, so:


        //Создаём массив строк в количестве 3:
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter string " + (i+1) + ":");
            massString[i] = scan1.nextLine();
        }
        //Для справки, мне реально стыдно за этот код

        int a=massString[0].length();
        int b=massString[1].length();
        int c=massString[2].length();

        char[] massChars1=new char[a];
        char[] massChars2=new char[b];
        char[] massChars3=new char[c];

        massChars1=massString[0].toCharArray();
        massChars2=massString[1].toCharArray();
        massChars3=massString[2].toCharArray();

        boolean counter=false;
        for (int i=0; i<massChars1.length-1; i++) {
            for (int j=1; j<i; j++)
            {
                if (massChars1[i] == massChars1[i - 1]) {
                    counter=false;
                } else {
                System.out.println("Строка состоящая ТОЛЬКО из разных символов: " + Arrays.toString(massChars1));
                counter = true;
                break;
                }
            }
        }
        for (int i=1; i<massChars2.length && !counter; i++) {
            if (massChars2[i] == massChars2[i - 1]) {
                counter=false;
            } else {
                System.out.println("Строка состоящая ТОЛЬКО из разных символов: "+Arrays.toString(massChars2));
                counter=true;
                break;
            }
        }

        for (int i=1; i<massChars3.length && !counter; i++) {
            if (massChars3[i] == massChars3[i - 1]) {
                counter=false;
            } else {
                System.out.println("Строка состоящая ТОЛЬКО из разных символов: "+Arrays.toString(massChars3));
                counter=true;
                break;
            }
        }



    }
}