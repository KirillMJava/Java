package HW.L4;

import java.util.Arrays;
import java.util.Scanner;
public class HW_L4 {
    public static void main(String[] args) {


        System.out.println("Task0");
        Scanner sk=new Scanner(System.in);
        Scanner sk1=new Scanner(System.in);
        System.out.println("Введите размер массива:");
        if (sk.hasNextInt()) {
            int massDlinna = sk.nextInt();
            System.out.println("Если хотите заполнить массив вручную, введите '1', если желаете сгенерировать заполнение, введите '2':");
            if (sk1.hasNextInt()) {
                int vybor = sk1.nextInt();
                if (vybor == 1) {
                    System.out.println("Заполните массив:");
                    int[] mass = new int[massDlinna];
                    for (int i = 0; i < mass.length; i++) {
                        if (sk.hasNextInt())
                            mass[i] = sk.nextInt();
                        else {
                            System.out.println("Вы ввели неверное значение, перезапустите программу");
                            break;
                        }
                    }
                    System.out.println(Arrays.toString(mass));

                    System.out.println("Task1");
                    for (int j : mass) {
                        System.out.print(j+" ");
                    }
                    System.out.println();
                    for (int i=mass.length-1; i>=0; i--){
                        System.out.print(mass[i]+" ");
                    }

                } else if (vybor == 2) {
                        double[] mass2 = new double[massDlinna];
                        for (int i = 0; i < mass2.length; i++) {
                            mass2[i] = Math.random();
                            mass2[i] = mass2[i] * 20;
                        }
                        System.out.println(Arrays.toString(mass2));
                        System.out.println("Далее работаем с массивом, введённым вручную, запустите программу и выберите вариант ручного ввода");
                } else System.out.println("Вы ввели неверное значение, перезапустите программу");
            } else System.out.println("Вы ввели неверное значение, перезапустите программу");
        } else System.out.println("Вы ввели неверное значение, перезапустите программу");


    }
}
