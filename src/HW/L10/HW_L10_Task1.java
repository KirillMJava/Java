package HW.L10;

import java.util.Arrays;
import java.util.Scanner;
public class HW_L10_Task1 {
    public static void main(String[] args) {
        Scanner scan1=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);
        System.out.println("Enter number of Strings");
        if (scan2.hasNextInt()) { //Делаем защиту от неверно введённых данных
            int index= scan2.nextInt();
            //Создаём массив строк в количестве, заданном в консоли, и выводим их поочерёдно:

            String[] massString = new String[index];
            for (int i = 0; i < index; i++) {
                System.out.println("Enter string "+(i+1)+":");
                massString[i] = scan1.nextLine();
            }

            //Определяем строки с максимальной и минимальной длиной:

            String stringWithMaxLength = massString[0], stringWithMinLength = massString[0];
            for (int i = 1; i < index; i++) {
                if (massString[i].length() > stringWithMaxLength.length()) {
                    stringWithMaxLength = massString[i];
                }
                if (massString[i].length() < stringWithMinLength.length()) {
                    stringWithMinLength = massString[i];
                }
            }

            //Выводим строки с максимальной и минимальной длиной и их длину:
            System.out.println();
            System.out.println("String with Min length: " + stringWithMinLength+", length: "+stringWithMinLength.length());
            System.out.println("String with Max length: " + stringWithMaxLength+", length: "+stringWithMaxLength.length());

        } else System.out.println("Invalid data type, please enter integer next time");
    }
}
