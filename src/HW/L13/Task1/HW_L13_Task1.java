package HW.L13.Task1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class HW_L13_Task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s1= scanner.nextLine();
        s1=s1.trim();
        String[] s2 = s1.split(", ");
        Set<String> setString = new LinkedHashSet<>(Arrays.asList(s2));
        System.out.println(setString);

    }
}
