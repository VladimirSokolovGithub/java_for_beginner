package Lessons.Les_8_modifiersFinalAndStatic;

public class Car {

    String color = "blue";
    String engine = "V6";

}

class Human {

    String name = "Ivan";
    final Car car = new Car(); //если переменная ссылочного

    public static void main(String[] args) {
        Human h1 = new Human();
//        h1.car = new Car();
//        h1.car = new Car();
        h1.car.engine = "V8";

    }

}