package Lessons.loop_for_statement_break_continue_les14;

public class Test2 {
    //минимальная реализация loopa for
    public static void main(String[] args) {
        //for(; ; ){}

        //for(; ; );

        //for(; ; ){;}

        /*

        for(; ; ){
            System.out.println("Hi");
        }

         */
    //разновидности for
        //нельзя использовать переменные разных типов
        for (int i = 1, j=2, k=3; i < 11; i++){
            System.out.println(i+j+k);
        }

        int i = 1;
        for (i = 5; i < 11; i++){
            System.out.println(i);
        }

        for (int j = 15, z = 10, x = 20; j < 11 && j > -3 || j > 4; j++, z++, x = x + 20, abc(10)){
            System.out.println(j);
        }

        for (int j = 5; j < 11; ){
            System.out.println(j);
            j++;
        }

        //бесконечный цикл
        for (int j = 5; j < 11; ){
            System.out.println(j);
        }

        //если condition statement отстутствует то всегда будет true
        //бесконечный цикл
        for (int j = 5; ; j++){
            System.out.println(j);
        }

        /*

        for (int j = 2; j<=30 ; j = j+2){
            System.out.println(j);
        }

         */

    }

    static void abc(int n){
        System.out.println(n);
    }
}
