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
                    System.out.println();

                    System.out.println("Task2");
                    Arrays.sort(mass);
                    System.out.println(Arrays.toString(mass));
                    System.out.println("Min: "+mass[0]+", Max: "+mass[mass.length-1]);

                    System.out.println("Task3");
                    int indexMax=0;
                    int indexMin=0;
                    for (int i=1; i<mass.length; i++){
                        if (mass[i]>mass[indexMax])
                            indexMax=i;
                        else if (mass[i]<mass[indexMin])
                            indexMin=i;
                    }
                    System.out.println("Индекс мин. элемента: "+indexMin+", индекс макс. элемента: "+indexMax);

                    System.out.println("Task4");
                    int k=0;
                    for (int i=0; i<mass.length; i++){
                        if (mass[i]==0)
                            k++;
                    }
                    if (k!=0)
                        System.out.println("Кол-во нулевых элементов: "+k);
                    else System.out.println("Нулевых элементов нет");

                    System.out.println("Task5");
                    System.out.println("Текущий массив: "+Arrays.toString(mass));
                    for (int i=0, i1=mass.length-1; i<mass.length/2; i++){
                        int d=mass[i];
                        mass[i]=mass[i1];
                        mass[i1]=d;
                        i1--;
                    }
                    System.out.println("Массив после замены: "+Arrays.toString(mass));

                    System.out.println("Task6");
                    int f=0;
                    for (int i=0; i<mass.length-1; i++){
                        if (mass[i+1]>mass[i])
                            f++;
                    }
                    if (f==mass.length-1)
                    System.out.println("Данный массив ЯВЛЯЕТСЯ возрастающей последовательностью");
                    else System.out.println("Данный массив НЕ является возрастающей последовательностью");


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
