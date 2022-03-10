package Lessons.Les_28_Exception_and_errors_part_two;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExampleNumber_5 {
    void abc() throws FileNotFoundException {
        try {
            File f = new File("C:\\Users\\Dell\\IdeaProjects\\java for beginner\\src\\Lessons\\Les_27_Exception_and_errors_part_one\\test.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("An exception was caught");
            throw e;
        } finally {
            System.out.println("This is finally block");
        }
    }

    void method(){
        try{
            abc();
        }catch (FileNotFoundException e) {
            System.out.println("An exception was caught and processed");
        }
    }

}
