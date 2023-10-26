package HW.L15.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> integers=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(i, i);
        }
        for (int i = 10, a=0; i < 20; i++, a++) {
            integers.add(i, a);
        }
        System.out.println("Изначальный список: "+integers);

        Optional<Integer> result=integers.stream()
                .distinct()
                .filter(i -> i % 2 == 0 && i!=0)
                .reduce();

        System.out.println("Сумма эл-тов коллекции просле всех операций: "+result);


    }
}
