package Lessons.Les_28_Exception_and_errors_part_two;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExampleNumber_12 {
    public static void main(String[] args) {
        Animal a = new Mouse();
        try {
            a.run();
        } catch (IOException e){
            System.out.println("Exception caught");
        }

    }
}

class Animal{
    void run() throws IOException {
        System.out.println("Animal runs");
    }
}

class Mouse extends Animal{
    void run() throws ArrayIndexOutOfBoundsException, NullPointerException {
        System.out.println("Mouse runs");
    }

//    void run() throws FileNotFoundException {
//        System.out.println("Mouse runs");
//    }
}