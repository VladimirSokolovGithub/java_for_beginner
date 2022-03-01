package Lessons.Les_25_PolymorphismAnd_instanceof;

public class ExampleNumber_2_Polymorphism {
    public static void main(String[] args) {
        Employee2 emp4 = new Teacher2();
        Employee2 emp5 = new Driver2();
        Employee2 emp6 = new Doctor2();

        String s1 = null;
        System.out.println(s1 instanceof String); //false

        Employee2[] arrays = {emp4, emp5, emp6};
        for (Employee2 emp : arrays) {
            emp.work();
        }

        System.out.println(arrays instanceof Object); //true

        System.out.println(emp4 instanceof Employee2); //true
        System.out.println(emp4 instanceof Teacher2); //true
        System.out.println(emp4 instanceof Driver2); //false
        System.out.println(emp4 instanceof Helpable2); //true


    }
}

abstract class Employee2 {
    void sleep() {
        System.out.println("Employee sleep");
    }

    abstract void work();
}

class Teacher2 extends Employee2 implements Helpable2 {
    @Override
    void work() {
        System.out.println("Teacher works");
    }

    @Override
    public void help() {
        System.out.println("Teacher helps");
    }
}

class Driver2 extends Employee2 implements Helpable2 {
    @Override
    void work() {
        System.out.println("Driver works");
    }

    @Override
    public void help() {
        System.out.println("Driver helps");
    }
}

class Doctor2 extends Employee2 implements Helpable2 {
    @Override
    void work() {
        System.out.println("Doctor works");
    }

    @Override
    public void help() {
        System.out.println("Doctor helps");
    }
}

interface Helpable2 {
    void help();
}
