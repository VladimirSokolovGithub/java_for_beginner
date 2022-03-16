package Lessons.Les_15_whileAndDoWhile;

public class Test7 {
    public static void main(String[] args) {

        //при балансе равном 0 цикл do while использовать не логично
        int money = 100;

        do{
            System.out.println("Делайте ставку");
            System.out.println("Вы проиграли");
            money -= 10;
        } while (money > 50);

    }
}
