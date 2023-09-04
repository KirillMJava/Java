package HW.L3;

import java.util.Scanner;
public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");

        while (sc.hasNextInt()) {
            if (sc.hasNextInt()) {
                int number = sc.nextInt();
                System.out.println("Спасибо! Вы ввели число " + number);
                break;
            } else {
                System.out.println("Извините, но это явно не число. Попробуйте снова!");
            }

        }
    }
}