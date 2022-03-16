package Lessons.Les_29_Date_and_Time;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class HomeWorkLes_29 {
    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.of(2016, Month.JANUARY, 1, 9, 00,0);
        LocalDateTime ldt2 = LocalDateTime.of(2016, Month.FEBRUARY, 3, 9, 00);
        Period period = Period.ofDays(1);
        Duration duration = Duration.ofDays(2);
        workingShift(ldt1, ldt2, period, duration);

    }

    static DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
    static DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");

    //метод рабочая смена
    public static void workingShift(LocalDateTime start, LocalDateTime end, Period period, Duration duration){
//        LocalDateTime ldt = start;
        while (start.isBefore(end)){
            System.out.print("Работаем с: " + start.format(formatter1));
            start = start.plus(period);
            System.out.println(" До: " + start.format(formatter1));

            System.out.print("Отдыхаем с: " + start.format(formatter2));
            start = start.plus(duration);
            System.out.println("До: " + start.format(formatter2) + "\n");
        }
    }
}
