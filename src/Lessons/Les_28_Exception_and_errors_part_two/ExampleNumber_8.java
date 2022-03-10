package Lessons.Les_28_Exception_and_errors_part_two;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExampleNumber_8 {
    static FileInputStream fis1, fis2;

    public static void main(String[] args) {
        try {
            fis1 = new FileInputStream("C:\\Users\\Dell\\IdeaProjects\\java for beginner\\src\\Lessons\\Les_27_Exception_and_errors_part_one\\test.txt");
            System.out.println("Файл test.txt существует в системе и найден");
            try {
                fis2.close();
            } catch (IOException e) {
                System.out.println("Проблемы со стримом fis2");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл test2.txt в системе не найден");
        } catch (NullPointerException e) {
            System.out.println("Сработал NullPointerException");
        }
    }
}
