package HW.L10;

import java.util.Arrays;
import java.util.Scanner;

public class HW_L10_Task3 {
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
            //Вычисляем среднее значение длин строк и выводим строки чьи длины меньше среднего
            double avarage=0;
            for (int i=0; i<index; i++){
                avarage+=massString[i].length();
            }
            avarage/=index;
            System.out.println("Avarage value of strings length: "+avarage);
            for (int i=0; i<index; i++){
                if (massString[i].length()<avarage)
                    System.out.println(massString[i]);
            }


        } else System.out.println("Invalid data type, please enter integer next time");
    }
}
