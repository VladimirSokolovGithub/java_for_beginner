package Lessons.Les_28_Exception_and_errors_part_two;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExampleNumber_4 {

    static StringBuilder abc() {
        StringBuilder a = new StringBuilder("Привет");
        try {
            File f = new File("C:\\Users\\Dell\\IdeaProjects\\java for beginner\\src\\Lessons\\Les_27_Exception_and_errors_part_one\\test.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("An exception was caught");
            System.out.println("Variable a in the catch block = " + a);
            return a;
        } finally {
            a.append("!!! ");
            System.out.println("This is finally block");
            System.out.println("Variable a in the finally block = " + a);
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(abc());

    }

}
