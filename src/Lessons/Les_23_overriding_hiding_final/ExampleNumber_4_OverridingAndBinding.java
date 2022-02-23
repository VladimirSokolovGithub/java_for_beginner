package Lessons.Les_23_overriding_hiding_final;

public class ExampleNumber_4_OverridingAndBinding {
    public static void main(String[] args) {
        Employee4 emp = new Employee4();
        Teacher4 t = new Teacher4();
//        emp.sleep(); // метод не виден так как он private и доступен для вызова только в классе Employee3
//        t.sleep(); // метод не виден так как он private, метод не является Overriding
        t.sleep(); // если метод сделать public, то всё заработает и метод станет виден
        Employee4 emp3 = new Teacher4();
//        emp3.sleep(); //казалось бы что должен отработать метод из класса Teacher3, но мы его не видим так как
        // он в родительском классе с модификатором private и соответственно не может быть унаследован
        // классом Teacher3, а тот метод sleep(), который мы создали в классе Teacher3, просто является новым
        // методом sleep(), который не является переопределенным.
    }
}

class Food2{}
class Fruits2 extends Food2 {}

class Employee3 {
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;

    protected Food2 eat3() {
        System.out.println("кушает работник");
        Food2 f = new Food2();
        return f;
    }

    private void sleep() {
        System.out.println("Employee sleep");
    }
}

class Teacher3 extends Employee3 {

    public Food2 eat3() { //класс еда, а возвращаемый тип фрукты
        System.out.println("кушает учитель");
        Fruits2 f = new Fruits2();
        return f;
    }

    int numberOfStudents;

    void teaching() { //лечить
        System.out.println("учить");
    }

//    private void sleep() {
//        System.out.println("Teacher sleep");
//    }

    public void sleep() {
        System.out.println("Teacher sleep");
    }
}
