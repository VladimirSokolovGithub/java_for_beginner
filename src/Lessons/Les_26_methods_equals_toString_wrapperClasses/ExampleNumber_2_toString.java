package Lessons.Les_26_methods_equals_toString_wrapperClasses;

import java.util.ArrayList;

public class ExampleNumber_2_toString {
    public static void main(String[] args) {
        Car2 c1 = new Car2("Red", "V4");
        Car2 c2 = new Car2("Red", "V4");
        Car2 c3 = new Car2("Black", "V8");
        Car2 c4 = new Car2("Black", "V8");

        ArrayList<Car2> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        System.out.println(list.contains(c4));//если бы мы использовали перегруженный(overloaded) метод,
        // то было бы false, но если переопределенный(overriding),
        // то true

        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));

        System.out.println(c3);
    }

}

class Car2 {
    String color;
    String engine;

    public Car2(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car2) {
            Car2 c2 = (Car2) obj;
            return (color.equals(c2.color) && engine.equals(c2.engine));
        } else {
            return false;
        }
    }

    public String toString(){
        return "machine color " + color + " with engine " + engine;
    }

}

//00-24-17
