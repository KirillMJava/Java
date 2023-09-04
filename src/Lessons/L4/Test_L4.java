package Lessons.L4;

import java.util.Arrays;
public class Test_L4 {
    public static void main(String[] args) {
        double a=Math.random();
        a=(a*20)-5;
        System.out.println((int)a);

        int[]x=new int[25];
        int[]y={1,2,4};
        System.out.println(y[1]);
        y[1]=4;
        System.out.println(y[1]);

        String[]s=new String[3];
        s[0]="hi";

        int[] mas=new int[5];
        int size = mas.length;

        int[]z=new int[5];
        for (int m : z){
            m=z[0];
        }




    }
}
