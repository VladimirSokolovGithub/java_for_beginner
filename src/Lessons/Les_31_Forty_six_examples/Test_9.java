package Lessons.Les_31_Forty_six_examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test_9 {
    public static void main(String[] args) {
        int a = abc();
        System.out.println(a);
    }

    static int abc(){
        try {
            FileInputStream fis = new FileInputStream("file_kotorogo_net.txt");
        } catch (FileNotFoundException e){
            System.out.println("File ne nayden");
            return 17;
        } finally {
            System.out.println("Eto finally block");
        }
        System.out.println("Programma prodoljaetsya");
        return 18;
    }
}
//00-32-40
//00-51-37
