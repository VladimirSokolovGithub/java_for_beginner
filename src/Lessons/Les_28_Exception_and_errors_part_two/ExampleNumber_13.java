package Lessons.Les_28_Exception_and_errors_part_two;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExampleNumber_13 {
    public static void main(String[] args) {
//        Animal2 a2 = new Mouse2();
    }
}

class Animal2 {
    Animal2() throws FileNotFoundException {

    }
}

class Mouse2 extends Animal2 {
    Mouse2() throws IOException {
        super();
    }
}

class Human {
    String name;
    int age;

    Human(String name, int age) throws Exception {
        if (age < 0) {
            throw new Exception("Некорректный возраст");
        }
        this.name = name;
        this.age = age;
    }
}
