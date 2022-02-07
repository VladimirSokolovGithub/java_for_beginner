package Lessons.whileAndDoWhile_Les15;

public class NestedLoop {
    public static void main(String[] args) {

        int hour = 0;

        OUTER:
        do {
            int minute = 0;

            INNER:
            while (minute < 60) {
                System.out.println(hour + ":" + minute);
                minute++;
            }

            hour++;
        } while (hour < 24);
    }
}
