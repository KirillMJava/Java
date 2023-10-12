package Lessons.L12;

import java.io.*;

public class L12_Test {
    public static void main(String[] args) {
        FileInputStream fis=null;
        InputStreamReader isr=null;
        int b=0;
        try {
            fis = new FileInputStream("W:/example.txt");
            isr=new InputStreamReader(fis,"UTF-8");
            while ((b=isr.read())!=-1){
                System.out.print((char)b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
