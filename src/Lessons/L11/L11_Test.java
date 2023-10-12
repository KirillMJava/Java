package Lessons.L11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import static java.lang.System.*;

public class L11_Test {

    public static void main(String[] args)  {
       // File file = new File("N://IntelliJ IDEA Community Edition 2023.2.1/File.txt");
       // FileReader fileReader=new FileReader(file);

       //int[] array ={1,2,3,4};
        // System.out.println(array[4]);

        try {
            int[] array1={1,2};
            out.println(array1[2]);
        }
        catch (IndexOutOfBoundsException e){
            out.println("Исключение: "+e);
        }
        out.println("Вне блока");
    }



}
