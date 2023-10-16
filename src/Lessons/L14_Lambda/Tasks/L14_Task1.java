package Lessons.L14_Lambda.Tasks;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class L14_Task1 {
    public static void main(String[] args) {

        DayOfWeek dayOfWeek=LocalDate.parse("2023-10-12").getDayOfWeek();
        System.out.println(dayOfWeek);
    }

}
