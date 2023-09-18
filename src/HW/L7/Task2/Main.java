package HW.L7.Task2;

import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
    Figure rect1=new Rectangle();
    Figure circ1=new Circle();
    Figure triang1=new Triangle();
    Figure rect2=new Rectangle();
    rect2.width=4;
    rect2.length=4;
    Figure rect3=new Rectangle();
    rect3.length=3;
    rect3.width=3;

        rect1.Perimeter();
        rect1.Square();
        circ1.Perimeter();
        circ1.Square();
        triang1.Square();
        triang1.Perimeter();
        rect2.Perimeter();
        rect3.Perimeter();

        System.out.println(rect1.square);
        System.out.println((rect1.perimeter));
        System.out.println(circ1.perimeter);
        System.out.println(circ1.square);
        System.out.println(triang1.perimeter);
        System.out.println(triang1.square);

        Figure[] figures=new Figure[5];
        figures[0]=rect1;
        figures[1]=rect2;
        figures[2]=rect3;
        figures[3]=circ1;
        figures[4]=triang1;
        double s=0;
        for (int i = 0; i < figures.length; i++) {
            s=s+figures[i].perimeter;
        }
        System.out.println(s);

    }
}
