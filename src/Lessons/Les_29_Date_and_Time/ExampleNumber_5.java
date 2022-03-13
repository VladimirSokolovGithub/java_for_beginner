package Lessons.Les_29_Date_and_Time;
import java.time.*;
public class ExampleNumber_5 {
    public static void main(String[] args) {
        LocalDate begining = LocalDate.of(2016, Month.SEPTEMBER, 1);
        LocalTime lt = LocalTime.of(10,30);
        Duration d = Duration.ofMinutes(3); //Duration не может работать с объектами LocalDate,
                                        // может только LocalTime or LocalDateTime
//        System.out.println(begining.plus(d));
        System.out.println(lt.plus(d));

        LocalDateTime ldt = LocalDateTime.of(2016, Month.SEPTEMBER, 1, 16,40);
        Duration d1 = Duration.ofMinutes(3);
        Period p = Period.ofMonths(3);
        System.out.println(ldt.plus(d1).plus(p));
    }
}
