package Lessons.Les_14_loop_for_statement_break_continue;

public class DzLes14 {
    //
    public static void time() {

        OUTER:
        for (int hour = 0; hour < 6; hour++) {
            System.out.println("Начало OUTER loopa");

            MIDDLE:
            for (int minute = 0; minute < 60; minute++) {
                System.out.println("Начало MIDDLE loopa");

                if (hour > 1 && minute % 10 == 0) {
                    break OUTER;
                }
                INNER:
                for (int seconds = 0; seconds < 60; seconds++) {
                    System.out.println("Начало INNER loopa");

                    if (seconds * hour > minute){
                        continue MIDDLE;
                    }
                    System.out.println(hour + ":" + minute + ":" + seconds);
                    System.out.println("Конец INNER loopa");
                }

                System.out.println("Конец MIDDLE loopa");
            }


            System.out.println("Конец OUTER loopa");
        }
    }

    public static void main(String[] args) {
        time();
    }

}
