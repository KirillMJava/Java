package HW.L12;

import java.io.FileInputStream;
import java.io.IOException;

public class HW_L12_Task1 {
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
