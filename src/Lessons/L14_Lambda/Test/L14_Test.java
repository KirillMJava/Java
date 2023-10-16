package Lessons.L14_Lambda.Test;

import java.util.function.Predicate;

public class L14_Test  {
    public static void main(String[] args) {
        Func_Int fint=x -> x*x;
        Predicate<Integer> isEven = x -> x %2 == 0;
        isEven.test(4); // true

    }


}
