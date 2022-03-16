package Lessons.Les_15_whileAndDoWhile;

public class Test5 {

    public static void main(String[] args) {

        int a = 5;
        while (a == 10){ //false поэтому в тело цикла не заходим
            System.out.println("Hi");
        }

        // минимальная реализация цикла while которая нам ничего не даст если condition false
        int b = 5;
        while (b == 10);

        System.out.println("Hi");

        //но если condition true то получим бесконечный цикл
        int c = 5;
        while (c < 10);

        System.out.println("Hi");

        //бесконечный цикл с телом
        int d = 5;
        while (d < 10){
            System.out.println("Hi");
        }



    }

}
