package Lessons.string_les_16;

public class Car {

    String color;
    String engine;

    Car(String color, String engine){
        this.color = color;
        this.engine = engine;
    }

    final static int a = 5;

    public Car abc(String color){
        Car c10 = new Car(color, "V4");
        return c10;
    }

    public static void main(String[] args) {
        //a = 10; //так как переменная "a" final , то  мы не можем изменить её значение

        Car c = new Car("red", "V6");
        Car c2 = c.abc("black"); //объект "c" остался с цветом "red" и не изменился
        System.out.println(c.color);
    }

}

class TestCar {
    final static Car car = new Car("red", "V8");

    public static void main(String[] args) {
        //car = new Car("red", "V10"); //так как переменная "car" final , то мы не можем ей присвоить ссылку на новый объект
        car.color = "black"; //но поменять её значения внутри этого объекта мы можем
    }
}
