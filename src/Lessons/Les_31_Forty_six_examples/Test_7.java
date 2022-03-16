package Lessons.Les_31_Forty_six_examples;

public class Test_7 {
    public static void main(String[] args) {
        int a = 8;
        do{
            while (a++ < 12){
                a += 4;
            }
        } while (a < 4);
        System.out.println(a);
    }
}

