package HW.L4;

import java.util.Arrays;
public class Test_HW_L4 {
    public static void main(String[] args) {

        int[] array = {1, 4, 6, 3, 8};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int[] array1 = {10, 20, 30, 40};
        int pos1 = Arrays.binarySearch(array1, 20);
        int pos2 = Arrays.binarySearch(array1, 10);
        System.out.println(pos1);
        System.out.println(pos2);

        String[] emails = {"VASYA@gmAil.com", "iGoR@yandex.RU", "netiD@hot.CoM"};
        System.out.println(Arrays.toString(emails));
        for (int i=0; i<emails.length; i++)
        {
            emails[i]=emails[i].toLowerCase();
        }
        System.out.println(Arrays.toString(emails));



    }
}
