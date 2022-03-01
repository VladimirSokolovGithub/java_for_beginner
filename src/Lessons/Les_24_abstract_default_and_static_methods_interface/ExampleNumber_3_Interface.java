package Lessons.Les_24_abstract_default_and_static_methods_interface;

public class ExampleNumber_3_Interface {
    public static void main(String[] args) {
        HelpAble h = new Driver();
        SwimAble s = new Driver();
        Employee e = new Driver();
        System.out.println(s.a);
        h.help();
        h.extinguishTheFire("Water");
        //с помощью объекта "h" мы можем вызвать только те переменные и те методы которые есть в типе интерфейса,
        //имплементирующем класс Driver. Методы и переменный которые он экстендит от класса Employee мы обратиться
        //и вызвать не сможем
        s.swim();
    }

}

interface HelpAble {
    public abstract void help();//интерфейс может содержать только публичные абстрактные методы

    void extinguishTheFire(String thing);// thing - вещь //мы можем не писать слово public abstract так компилятор подставит
    // их автоматически
    //Но при их реализации в классе мы обязательно должны ставить access modifier - public
    //Изменив в интерфейсе сигнатуру метода мы должны изменить сигнатуру в классах имплементирующих этот интерфейс
    //У интерфейсов нет конструктора
}

//умеющий плавать
abstract interface SwimAble {
    void swim();

    public final static int a = 10; //В интерфейсе могут быть только константы - public final static
    // подставляется компилятором автоматически
    //Все интерфейсы абстрактные и компилятор подставляет модификатор abstract автоматически и его можно не писать
}

class Employee {
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;

    void eat() {
        System.out.println("кушать");
    }

    void sleep() {
        System.out.println("спать");
    }
}

class Teacher extends Employee implements HelpAble {
    public void help() {
        System.out.println("Учитель оказывает помощь");
    }

    public void extinguishTheFire(String s) {
        System.out.println("Учитель тушит пожар с помощью " + s);
    }

    int numberOfStudents;

    void teaching() { //лечить
        System.out.println("учить");
    }
}


class Driver extends Employee implements HelpAble, SwimAble {
    void drive() { //лечить
        System.out.println("водить");
    }

    public void help() {
        System.out.println("Водитель оказывает помощь");
    }

    public void extinguishTheFire(String s) {
        System.out.println("Водитель тушит пожар с помощью " + s);
    }

    public void swim() {
        System.out.println("Водитель умеет плавать");

    }
}
//00-54-51

//Пример с модификатором abstract
abstract class Y implements SwimAble {
}

abstract class X extends Y {
}

class Z extends X {
    public void swim() {

    }
}