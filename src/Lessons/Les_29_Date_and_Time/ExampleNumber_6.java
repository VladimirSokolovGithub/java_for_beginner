package Lessons.Les_29_Date_and_Time;
import java.time.*;
public class ExampleNumber_6 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2016, Month.SEPTEMBER, 1);
        LocalDateTime ldt = LocalDateTime.of(2016, Month.SEPTEMBER, 1, 16,40);
        LocalTime lt = LocalTime.of(16,40);

        //Методы для получения информации из класса LocalDate and LocalDateTime
        //1
        // getDayOfWeek() -> DayOfWeek
        System.out.println(ld.getDayOfWeek());
        System.out.println(ldt.getDayOfWeek());

        //2
        // getDayOfMonth() -> int
        System.out.println(ld.getDayOfMonth());

        //3
        // getDayOfYear() -> int
        System.out.println(ldt.getDayOfYear());

        //4
        // getMonth() -> Month //Enum
        System.out.println(ldt.getMonth());

        //5
        // getMonthValue() -> int
        System.out.println(ldt.getMonthValue());

        //6
        // getYear() -> int
        System.out.println(ldt.getYear());

        //Методы для получения информации из класса LocalTime and LocalDateTime в части времени
        //1
        // getNano -> int
        System.out.println(lt.getNano());

        //2
        // getSecond -> int
        System.out.println(lt.getSecond());

        //3
        // getMinute -> int
        System.out.println(lt.getMinute());

        //4
        // getHour -> int
        System.out.println(lt.getHour());
    }
}
