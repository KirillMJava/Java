package HW.L10;

import java.util.Arrays;
import java.util.Scanner;

public class HW_L10_Task2 {
    public static void main(String[] args) {
        Scanner scan1=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);
        System.out.println("Enter number of Strings");
        if (scan2.hasNextInt()) { //Делаем защиту от неверно введённых данных
            int index= scan2.nextInt();
            //Создаём массив строк в количестве, заданном в консоли, например 3:

            String[] massString = new String[index];
            for (int i = 0; i < index; i++) {
                System.out.println("Enter string "+(i+1)+":");
                massString[i] = scan1.nextLine();
            }
            //Упорядочиваем и выводим строки в порядке возрастания их длин:

            for (int i=0; i<index; i++){
                String a="";
                for (int j=0; j<index-1; j++){
                    if (massString[j].length()>massString[j+1].length()){
                        a=massString[j];
                        massString[j]=massString[j+1];
                        massString[j+1]=a;
                    }
                }
            }
            System.out.println("Sorted strings by length value:");
            for(int i=0; i<index; i++){
                System.out.println(massString[i]);
            }

        } else System.out.println("Invalid data type, please enter integer next time");
    }
}
