package Lessons.Les_23_overriding_hiding_final;

// методы private, static и final не могут быть overriding (переопределены)
public class ExampleNumber_2_Overriding {
    public static void main(String[] args) {
        Employee2 emp1 = new Employee2();
        Teacher2 t = new Teacher2();
        emp1.eat2();
        t.eat2();
        Employee2 emp2 = new Teacher2();
        emp2.eat2(); //здесь будет вызван override метод класса Teacher2 несмотря на то,
                     // что emp2 это reference переменная типа Employee2
    }
}
class Food{}
class Fruits extends Food{}

class Employee2 {
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;

//    void eat2() {
//        System.out.println("кушает работник");
//    }

    protected Food eat2() {
        System.out.println("кушает работник");
        Food f = new Food();
        return f;
    }

    void sleep() {
        System.out.println("спать");
    }
}

class Teacher2 extends Employee2 {
      //overriding
//    void eat2() {
//        System.out.println("кушает учитель");
//    }

      //overriding
//    public Fruits eat2() { //Ковариантные типы данных
//        System.out.println("кушает учитель");
//        Fruits f = new Fruits();
//        return f;
//    }

    //или overriding
     public Food eat2() { //класс еда, а возвращаемый тип фрукты
        System.out.println("кушает учитель");
        Fruits f = new Fruits();
        return f;
    }


    int numberOfStudents;

    void teaching() { //лечить
        System.out.println("учить");
    }
}

//00-43-46