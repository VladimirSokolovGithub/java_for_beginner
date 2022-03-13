package Lessons.Les_29_Date_and_Time;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class ExampleNumber_4 {
    //метод не совершенен
//    static void changeDutyMan(LocalDate begin, LocalDate end){ //смена дежурного
//        LocalDate date = begin;
//        while (date.isBefore(end)){
//            System.out.println("наступила дата " + date + ". Пора менять дежурного");
//            date = date.plusMonths(1);
//        }
//    }

    //доводим метод до совершенства
    static void changeDutyMan(LocalDate begin, LocalDate end, Period p) { //смена дежурного
        LocalDate date = begin;
        while (date.isBefore(end)){
            System.out.println("наступила дата " + date + ". Пора менять дежурного");
            date = date.plus(p);
        }
    }

    public static void main(String[] args) {
        LocalDate begin = LocalDate.of(2016, Month.SEPTEMBER, 1);
        LocalDate end = LocalDate.of(2020, Month.MAY, 31);
        Period p = Period.ofMonths(1);
        //у класса Period есть несколько методов
        Period p1 = Period.ofDays(100);
        Period p2 = Period.of(1, 3, 15);
        changeDutyMan(begin, end, p);
    }
}
//00-53-27
