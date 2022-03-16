package Lessons.Les_14_loop_for_statement_break_continue;

public class Test {

    public void time(){
//циклам for можно присваивать lable и с помощью них управлять внешними циклами из внутренних
// при помощи операторов break; и continue;
        OUTER: for(int hour = 0; hour <= 23; hour++){

            System.out.println("Начало outer loopa");

            INNER: for (int minute = 0; minute <=59; minute++){

                if (minute == 20){
                    continue OUTER;
                }

//                if (minute == 20){
//                    continue;
//                }

                System.out.println(hour + ":" + minute);

                if (minute == 30){
                    break;
                }

//                if (minute == 30){
//                    break OUTER;
//                }

            }

            System.out.println("Конец outer loopa");
        }
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.time();
    }
}

