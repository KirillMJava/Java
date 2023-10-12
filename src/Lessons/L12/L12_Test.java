package Lessons.L12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class L12_Test {
    public static void main(String[] args) {
        FileInputStream fis=null;
        int b=0;
        try {
            fis = new FileInputStream("W:/romeo_juliet.txt");
            while ((b=fis.read())!=-1){
                System.out.print((char)b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
