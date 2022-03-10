package Lessons.Les_27_Exception_and_errors_part_one;
import java.io.*;
public class ExampleNumber_4_try_catch_finally {
    public static void main(String[] args) {
        //1
        int[] array = {4,8,1};
        System.out.println("We have array");

        try {
            System.out.println(array[5]);
            System.out.println("Have a nice day to everyone");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("An exception was catch:  " + e);
        }
        finally {
            System.out.println("This is finally block");
        }
        System.out.println("This code has nothing to do with exceptions");

        //****************************************************************
        //2
        File f = new File("C:\\Users\\Dell\\IdeaProjects\\java for beginner\\src\\Lessons\\Les_27_Exception_and_errors_part_one\\test.txt");

        try {
            FileOutputStream fis = new FileOutputStream(f);
            System.out.println("Have a nice day to everyone");
        }
        catch (FileNotFoundException e){
            System.out.println("An exception was catch:  " + e);
        }
        catch (NullPointerException e){
            System.out.println("An exception was catch:  " + e);
        }
        finally {
            System.out.println("This is finally block");
        }

        System.out.println("This code has nothing to do with exceptions");

    }
}
//01-15-40