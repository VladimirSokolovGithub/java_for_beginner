package Lessons.Les_29_Date_and_Time;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class HomeWorkLes_29 {
    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.of(2016, Month.JANUARY, 1, 9, 00);
        LocalDateTime ldt2 = LocalDateTime.of(2016, Month.FEBRUARY, 3, 9, 00);
        Period period = Period.ofDays(1);
        Duration duration = Duration.ofDays(2);
        workingShift(ldt1, ldt2, period, duration);

    }

    static DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
    static DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");

    //метод рабочая смена
    public static void workingShift(LocalDateTime ldt1, LocalDateTime ldt2, Period period, Duration duration){
        while (ldt1.isBefore(ldt2)){
            System.out.println("Работаем с: " + ldt1.format(formatter1));
            ldt1 = ldt1.plus(period);
            System.out.print("До: " + ldt1.format(formatter1) + "\n\n");

            System.out.println("Отдыхаем с: " + ldt1.format(formatter2));
            ldt1 = ldt1.plus(duration);
            System.out.print("До: " + ldt1.format(formatter2) + "\n\n");
        }
    }
}
