package HW.L7.Task2;

import java.lang.Math;

public class Circle extends Figure{


    @Override
    void Square() {
    square=Math.round(Math.PI*Math.pow(radius, 2));
    }

    @Override
    void Perimeter() {
        perimeter=Math.round(2*Math.PI*radius);
    }
}
