package Lessons.L8.Task1;

import java.net.HttpURLConnection;

public class Main {
    public static void main(String[] args) {
        Build house1=new House();
        Build garage1=new Garage();
        System.out.println(house1.getType());
        System.out.println(garage1.getType());
    }

}
