package HW.L3;

import java.util.Scanner;
public class Test {

    public static void main(String[] args) {

    Scanner sk=new Scanner(System.in);
    String a=sk.next();


      switch(a)
    {
        case "A" :
            System.out.println("Отлично!");
            break;
        case "B" :
        case "C" :
            System.out.println("Отлично выполнено");
            break;
        case "D" :
            System.out.println("Вы прошли");
        case "E" :
            System.out.println("Лучше попробуйте снова");
            break;
        default :
            System.out.println("Неверная оценка");
    }
      System.out.println("Ваша оценка "+a);
}
}

