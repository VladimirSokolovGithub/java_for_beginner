//Lesson 5
package Lessons.constructorAndMethods_Les5;

public class Car {
    // constructor with parameter

    Car(String cvet, String motor){
    color = cvet;
    engine = motor;
    }

    String color;
    String engine;
}

class Car2{
    //constructor without parameters

    Car2(){
        System.out.println("Object is created");
    }
}

class Car3{
    //constructor without parameters с инициализацией полей

    Car3(){
        color = "blue";
        engine = "V12";
    }

    String color;
    String engine;
}

class Car4 {
    // constructor with parameter и реализацией дополнительного кода при инициализации объекта

    Car4(String cvet, String motor){
        color = cvet;
        engine = motor;
        System.out.println("Цвет машины: " + color + " мотор машины: " + engine);
    }

    String color;
    String engine;
}

class CarTest {
    public static void main(String[] args) {
        // constructor with parameter
        Car car1 = new Car("yellow", "V4");
        System.out.println(car1.color);
        System.out.println(car1.engine);

        //constructor without parameters
        Car2 car2 = new Car2();

        //constructor without parameters с инициализацией полей
        Car3 car3 = new Car3();
        System.out.println(car3.color);
        System.out.println(car3.engine);

        Car3 carOther = new Car3();
        System.out.println(carOther.color);
        System.out.println(carOther.engine);

        Car3 carOther2 = new Car3();
        carOther2.color = "red";
        carOther2.engine = "V5";
        System.out.println(carOther2.color);
        System.out.println(carOther2.engine);

        // constructor with parameter и реализацией дополнительного кода при инициализации объекта
        Car4 car4 = new Car4("black", "V8");
        Car4 carOther4 = new Car4("white", "V6");
    }
}

//Lesson 5 - time 01-09-12