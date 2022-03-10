package Lessons.Les_27_Exception_and_errors_part_one;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExampleNumber_5_throws_try_catch_finally {

    void abc() throws FileNotFoundException {
        File f = new File("C:\\Users\\Dell\\IdeaProjects\\java for beginner\\src\\Lessons\\Les_27_Exception_and_errors_part_one\\test.txt");

//        try {
            FileOutputStream fis = new FileOutputStream(f);
            System.out.println("Have a nice day to everyone");
//        }
//        catch (FileNotFoundException e){
//            System.out.println("An exception was catch:  " + e);
//        }

    }
    //    void def() throws IOException {
    void def() throws FileNotFoundException{
        System.out.println("Hello");
//        try {
            abc();
//        }
//        catch (FileNotFoundException e){
//            System.out.println("An exception was catch:  " + e);
//        }

    }

    public static void main(String[] args) {
        ExampleNumber_5_throws_try_catch_finally ex1 = new ExampleNumber_5_throws_try_catch_finally();
        try {
            ex1.def();
        }
        catch (FileNotFoundException e){
            System.out.println("An exception was catch:  " + e);
        }
//        catch (IOException e){
//            System.out.println("An exception was catch:  " + e);
//        }
    }
}
//01-36-26