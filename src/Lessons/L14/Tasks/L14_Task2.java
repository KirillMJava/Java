package Lessons.L14.Tasks;

import java.time.LocalDate;

public class L14_Task2 {

    public static void main(String[] args) {

        LocalDate dateOfNextTue=LocalDate.now().plusWeeks(1).minusDays(2);
        System.out.println(dateOfNextTue);

    }

}
