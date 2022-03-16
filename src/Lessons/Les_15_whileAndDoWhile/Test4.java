package Lessons.Les_15_whileAndDoWhile;

public class Test4 {

    public static void main(String[] args) {
        int a = 5;
        while (++a < 10 ){
            a++;
        }
        System.out.println(a);

        int b = 5;
        while (++b > 10 ){
            b++;
        }
        System.out.println(b);

        int c = 5;
        while (c++ < 10){ //сначало сравниваем, потом увеличиваем
            c++;
        }
        System.out.println(c); //вывод c = 12
    }

}
