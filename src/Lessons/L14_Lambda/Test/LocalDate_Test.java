package Lessons.L14_Lambda.Test;

import java.time.DayOfWeek;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
public class LocalDate_Test {
    public static void main(String[] args) {

        LocalDate ld= LocalDate.now();
        System.out.println(ld);

        System.out.println(LocalDate.of(2023, 10, 12));

        LocalDate tommorow=ld.plusDays(1);
        System.out.println(tommorow);

        LocalDate previousMonthSameDay=ld.minus(1, ChronoUnit.MONTHS);
        System.out.println(previousMonthSameDay);

        DayOfWeek dayOfWeek=LocalDate.parse("2023-10-12").getDayOfWeek();
        System.out.println(dayOfWeek);

        int dayOfMonth = LocalDate.parse("2023-10-12").getDayOfMonth();
        System.out.println(dayOfMonth);

        boolean leapYear= ld.isLeapYear();
        System.out.println(leapYear);

        boolean notBefore = LocalDate.parse("2023-10-12").isBefore(LocalDate.parse("2023-10-11"));
        System.out.println(notBefore);

        boolean isAfter=LocalDate.parse("2023-10-12").isAfter(LocalDate.parse("2023-10-11"));
        System.out.println(isAfter);



    }

}
