package Lessons.Les_29_Date_and_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class ExampleNumber_7 {

    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2016, Month.SEPTEMBER, 1);
        LocalDateTime ldt = LocalDateTime.of(2016, Month.SEPTEMBER, 1, 16,40, 9);
        LocalTime lt = LocalTime.of(16,40);

        DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(ld);
        System.out.println(ld.format(d1));

//        DateTimeFormatter d2 = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println(lt);
//        System.out.println(lt.format(d2));
        System.out.println(lt.format(DateTimeFormatter.ISO_DATE_TIME));

        DateTimeFormatter d3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println(ldt);
        System.out.println(ldt.format(d3)); //можно использовать так же форматы d1 and d2

        DateTimeFormatter d4 = DateTimeFormatter.ISO_WEEK_DATE;
        System.out.println(ld);
        System.out.println(ld.format(d4));
//01-16-47

        //method ofLocalizedDate(FormatStyle.SHORT)
        DateTimeFormatter shortFormatDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(ld);
        System.out.println(ld.format(shortFormatDate));

        System.out.println(ldt);
        System.out.println(ldt.format(shortFormatDate));

        DateTimeFormatter shortFormatTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(lt);
        System.out.println(lt.format(shortFormatTime));

        DateTimeFormatter shortFormatDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(ldt);
        System.out.println(ldt.format(shortFormatDateTime));

        DateTimeFormatter shortFormatDateTime1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(ldt);
        System.out.println(ldt.format(shortFormatDateTime1));
        System.out.println(shortFormatDateTime1.format(ldt)); //равнозначные записи

        //method ofPattern() class DateTimeFormatter
        //Значение обозначений Pattern-а "MMMM dd, yyyy, hh:mm" представлены в презентации номер 9
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
        System.out.println(ldt);
        System.out.println(ldt.format(f));

        //method parse
        LocalDate date1 = LocalDate.parse("01 02 2015", f);
        System.out.println(date1);

        LocalDate date2 = LocalDate.parse("2015-01-02");
        System.out.println(date2);
    }
}
