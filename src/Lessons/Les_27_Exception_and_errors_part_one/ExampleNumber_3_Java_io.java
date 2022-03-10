package Lessons.Les_27_Exception_and_errors_part_one;
import java.io.*;
public class ExampleNumber_3_Java_io {
    public static void main(String[] args) throws Exception {
        File f = new File("C:\\Users\\Dell\\IdeaProjects\\java for beginner\\src\\Lessons\\Les_27_Exception_and_errors_part_one\\test.txt");
        FileInputStream fis = new FileInputStream(f);
        fis.read();
        FileOutputStream fos = new FileOutputStream(f);
        fos.write( 100);
    }
}
//00-39-54