package Lessons.L8.Task2;

public class Main {
    public static void main(String[] args) {

        Person kirill=new Person();
        kirill.name="Kirill";
        kirill.age=25;
        kirill.setGender("Male");
        System.out.println(kirill.name+", "+kirill.age+", "+kirill.getGender());

    }
}
