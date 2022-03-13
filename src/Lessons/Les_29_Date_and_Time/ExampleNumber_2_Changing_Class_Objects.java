package Lessons.Les_29_Date_and_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ExampleNumber_2_Changing_Class_Objects {
    public static void main(String[] args) {

        //Методы LocalDate - являются Immutable

        //1
        //plusDays(long кол-во дней) -> LocalDate - возвращает новый объект LocalDate
        LocalDate ld1 = LocalDate.of(2014,5,15);
        System.out.println(ld1);
//        ld1.plusDays(5); // так значение ld1 не изменится так как объект Immutable
        LocalDate ld2 = ld1.plusDays(5);
        System.out.println(ld2);
        //или
        ld1 = ld1.plusDays(5);
        System.out.println(ld1);

        //2
        //minusDays(long кол-во дней) -> LocalDate - возвращает новый объект LocalDate
        LocalDate ld3 = LocalDate.of(2014,5,15);
        System.out.println(ld3);
        ld3 = ld3.minusDays(5);
        System.out.println(ld3);

        //3
        //plusWeeks(long кол-во недель) -> LocalDate - возвращает новый объект LocalDate
        LocalDate ld4 = LocalDate.of(2014,5,15);
        System.out.println(ld4);
        ld4 = ld4.plusWeeks(3);
        System.out.println(ld4);

        //4
        //minusWeeks(long кол-во недель) -> LocalDate - возвращает новый объект LocalDate
        LocalDate ld5 = LocalDate.of(2014,5,15);
        System.out.println(ld5);
        ld5 = ld5.minusWeeks(2);
        System.out.println(ld5);

        //5
        //plusMonths(long кол-во месяцев) -> LocalDate - возвращает новый объект LocalDate
        LocalDate ld6 = LocalDate.of(2014,5,31);
        System.out.println(ld6);
        ld6 = ld6.plusMonths(2);
        System.out.println(ld6);

        //6
        //minusMonths(long кол-во месяцев) -> LocalDate - возвращает новый объект LocalDate
        LocalDate ld7 = LocalDate.of(2014,5,31);
        System.out.println(ld7);
        ld7 = ld7.minusMonths(2);
        System.out.println(ld7);

        //7
        //plusYears(long кол-во лет) -> LocalDate - возвращает новый объект LocalDate

        //8
        //minusYears(long кол-во лет) -> LocalDate - возвращает новый объект LocalDate



        //Методы LocalTime - являются Immutable

        //1
        //plusHours(long кол-во часов) -> LocalTime

        LocalTime lt1 = LocalTime.of(15,30);
        System.out.println(lt1);
        lt1 = lt1.plusHours(1);
        lt1 = lt1.minusMinutes(10);
        lt1 = lt1.plusSeconds(18);
        lt1 = lt1.minusNanos(5); //пять миллиардных секунды
        System.out.println(lt1);
        //либо запись через methods chaining
        LocalTime lt2 = LocalTime.of(15,30);
        lt2 = lt1.plusHours(1).minusMinutes(10).plusSeconds(18).minusNanos(5);
        System.out.println(lt2);

        //2
        //minusHours(long кол-во часов) -> LocalTime

        //3
        //plusMinutes(long кол-во минут) -> LocalTime

        //4
        //minusMinutes(long кол-во минут) -> LocalTime

        //5
        //plusSeconds(long кол-во секунд) -> LocalTime

        //6
        //minusSeconds(long кол-во секунд) -> LocalTime

        //7
        //plusNanos(long кол-во Наносекунд) -> LocalTime

        //8
        //minusNanos(long кол-во Наносекунд) -> LocalTime


        //Методы LocalDateTime - являются Immutable
        //сМетоды LocalDateTime содержат все вышеперечисленные методы

        LocalDateTime ldt1 = LocalDateTime.of(2015,9,10,17,25);
        System.out.println(ldt1);
        ldt1 = ldt1.plusYears(3).minusMonths(2).plusMinutes(3).minusSeconds(30);
        System.out.println(ldt1);

    }
}
