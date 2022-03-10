package Lessons.Les_28_Exception_and_errors_part_two;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExampleNumber_6 {
    FileInputStream fis1, fis2;

    public void abc() {
        try {
            fis1 = new FileInputStream("C:\\Users\\Dell\\IdeaProjects\\java for beginner\\src\\Lessons\\Les_27_Exception_and_errors_part_one\\test.txt");
            try {
                fis1 = new FileInputStream("C:\\Users\\Dell\\IdeaProjects\\java for beginner\\src\\Lessons\\Les_27_Exception_and_errors_part_one\\test2.txt");
            } catch (FileNotFoundException e) {
                System.out.println("File test2 not found");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File test not found");
        } finally {
            System.out.println("This is an external financial block");
            try {
                fis1.close();
                fis2.close();
            } catch (IOException e) {
                System.out.println("An exception was found in the finally block");
            }
        }
    }

    public static void main(String[] args) {
        ExampleNumber_6 ex1 = new ExampleNumber_6();
        ex1.abc();
    }
}
