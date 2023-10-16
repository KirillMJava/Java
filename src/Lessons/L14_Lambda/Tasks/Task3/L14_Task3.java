package Lessons.L14_Lambda.Tasks.Task3;

public class L14_Task3 {

    public static void main(String[] args) {

    IShape square;
    square= ((a, b) -> a*b);
    double result = square.getSquare(10,20);
        System.out.println(result);

    IShape triangle;
    triangle=((a, h) -> (0.5*a*h));
    result= triangle.getSquare(10,5);
        System.out.println(result);

    }

}
