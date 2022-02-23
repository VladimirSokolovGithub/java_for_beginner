package Lessons.Les_23_overriding_hiding_final;

public class ExampleNumber_5_OverridingAndBinding {
    public static void main(String[] args) {
        Employee4 emp = new Employee4();
        Teacher4 t = new Teacher4();
//        t.sleep();
//        Employee4 emp4 = new Teacher4();
//        emp4.sleep();
        System.out.println(t.salary);

    }
}

class Food3 {}
class Fruits3 extends Food3 {}

class Employee4 {
//    double salary = 100;
    static double salary = 100;

    String name = "Kolya";
    int age;
    int experience;

    protected Food3 eat3() {
        System.out.println("кушает работник");
        Food3 f = new Food3();
        return f;
    }

    //этот static метод sleep() будет унаследован в классе Teacher4, но мы не можем переопределить static метод
    // поэтому если будет вызываться статик метод на объекте наследника, то будет срабатывать метод класса Родителя
    // в нашем случае класса Employee4
    static void sleep() {
        System.out.println("Employee sleep");
    }
}

class Teacher4 extends Employee4 {

    //variable hiding - это всё примеры hiding переменных в том числе может быть и другой тип например String
//    double salary = 200;
//    static double salary = 200;
    String salary = "двести";

    @Override
    public Food3 eat3() {
        System.out.println("кушает учитель");
        Fruits3 f = new Fruits3();
        return f;
    }

    int numberOfStudents;

    void teaching() { //лечить
        System.out.println("учить");
    }

    //В данном случае мы имеем метод hiding. То есть метод sleep() из класса Employee4 был закрыт
    // этим методом с другим телом.
    static void sleep() {
        System.out.println("Teacher sleep");
    }
}
