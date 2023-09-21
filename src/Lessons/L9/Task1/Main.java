package Lessons.L9.Task1;

public class Main {
    public static void main(String[] args) {
        Shape circle=new Circle();
        Shape square=new Square();
        Shape triangle=new Triangle();
        circle.draw();
        circle.erase();
        square.draw();
        square.erase();
        triangle.draw();
        triangle.erase();
    }
}
