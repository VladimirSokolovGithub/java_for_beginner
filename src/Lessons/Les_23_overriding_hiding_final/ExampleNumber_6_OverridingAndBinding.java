package Lessons.Les_23_overriding_hiding_final;

public class ExampleNumber_6_OverridingAndBinding {
    public static void main(String[] args) {
        Employee5 emp = new Employee5();
        Teacher5 t = new Teacher5();
//        t.sleep();
//        Employee5 emp5 = new Teacher5();
//        emp5.sleep();
        System.out.println(t.salary);

    }
}

class Food4 {
}

class Fruits4 extends Food4 {
}

class Employee5 {
    static double salary = 100;

    String name = "Kolya";
    int age;
    int experience;

    //final методы нельзя переопределить у наследников
    //но сам метод наследуется и может быть использован у наследников
    final public Food4 eat4() {
        System.out.println("кушает работник");
        Food4 f = new Food4();
        return f;
    }

    //final static метод нельзя сделать hiding у наследников
    //но сам метод наследуется и может быть использован у наследников
    final static void sleep() {
        System.out.println("Employee sleep");
    }
}

class Teacher5 extends Employee5 {

    String salary = "двести";

//    @Override
//    public Food4 eat4() {
//        System.out.println("кушает учитель");
//        Fruits4 f = new Fruits4();
//        return f;
//    }

    int numberOfStudents;

    void teaching() { //лечить
        System.out.println("учить");
    }

    //В данном случае мы имеем метод hiding. То есть метод sleep() из класса Employee4 был закрыт
    // этим методом с другим телом.
//    static void sleep() {
//        System.out.println("Teacher sleep");
//    }
}

final class T{}

//class P extends T{}
