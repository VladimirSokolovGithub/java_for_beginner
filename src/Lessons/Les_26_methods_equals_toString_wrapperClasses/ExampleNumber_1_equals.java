package Lessons.Les_26_methods_equals_toString_wrapperClasses;

import java.util.ArrayList;

public class ExampleNumber_1_equals {
    public static void main(String[] args) {
        Car c1 = new Car("Red", "V4");
        Car c2 = new Car("Red", "V4");
        Car c3 = new Car("Black", "V8");
        Car c4 = new Car("Black", "V8");

        ArrayList<Car> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        System.out.println(list.contains(c4));//если бы мы использовали перегруженный(overloaded) метод,
                                                // то было бы false, но если переопределенный(overriding),
                                                // то true

        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));
    }

}

class Car {
    String color;
    String engine;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }
//    public boolean equals(Object obj){ // Так выглядит метод equals в классе Object
//        return (this == obj);
//    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car c2 = (Car) obj;
            return (color.equals(c2.color) && engine.equals(c2.engine));
        } else {
            return false;
        }
    }

//    public boolean equals(Car c) {
//            return (color.equals(c.color) && engine.equals(c.engine));
//    }
}



