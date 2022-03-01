package Lessons.Les_25_PolymorphismAnd_instanceof;

public class ExampleNumber_1_Polymorphism {
    public static void main(String[] args) {
        Driver[] array1 = {new Driver(), new Driver()};
        Employee[] array2 = {new Driver(), new Driver(), new Teacher(), new Doctor()};
        Helpable[] array3 = {new Driver(), new Driver(), new Teacher(), new Doctor()};


        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();
        Helpable h = new Teacher();
//        emp1.help();
        h.help();
        emp1.work();
        emp2.work();
        emp3.work();
    }
}

//abstract class Employee implements Helpable{
abstract class Employee {
    void sleep(){
        System.out.println("Employee sleep");
    }
    abstract void work();
}

class Teacher extends Employee implements Helpable {
    @Override
    void work() {
        System.out.println("Teacher works");
    }

    @Override
    public void help(){
        System.out.println("Teacher helps");
    }
}

class Driver extends Employee implements Helpable{
    @Override
    void work() {
        System.out.println("Driver works");
    }
    @Override
    public void help(){
        System.out.println("Driver helps");
    }
}

class Doctor extends Employee implements Helpable{
    @Override
    void work() {
        System.out.println("Doctor works");
    }
    @Override
    public void help(){
        System.out.println("Doctor helps");
    }
}

interface Helpable{
    void help();
}