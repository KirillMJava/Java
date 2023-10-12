package Lessons.L12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class L12_Test2 {

    public static void main(String[] args) {

        FileOutputStream fileOutputStream=null;
        String str = "Hot";

        try {
            fileOutputStream=new FileOutputStream("W:/example.txt");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
