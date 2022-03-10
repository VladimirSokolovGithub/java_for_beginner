package Lessons.Les_28_Exception_and_errors_part_two;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExampleNumber_2 {
    static int abc() {
        try {
            File f = new File("C:\\Users\\Dell\\IdeaProjects\\java for beginner\\src\\Lessons\\Les_27_Exception_and_errors_part_one\\test1.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("An exception was caught");
            return 6;
        } finally {
            System.out.println("This is finally block");
            return 7;
        }
    }

    public static void main(String[] args) {
        System.out.println(abc());

    }
}
