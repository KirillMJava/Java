package Lessons.L15_Optional_and_StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class L15_Test {
    public static void main(String[] args) {
        List<String> comp=new ArrayList<>();



        List<String> list=comp.stream().filter(x->x.length()>5).toList();

    }
}
