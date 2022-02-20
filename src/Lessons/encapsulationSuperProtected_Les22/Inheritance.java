package Lessons.encapsulationSuperProtected_Les22;


//Наследование - Inheritance
//Extends - переводится как расширять
public class Inheritance {
    //метод увеличения зарплаты
    public void salaryIncrease(Employee employee){ //сюда можно подставить любой child class
        employee.salary = employee.salary+100;
    }

    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.name = "Ivan";
        doc.age = 50;
        doc.experience = 25;
        doc.specialization = "surgeon"; //хирург
        doc.eat();
        doc.sleep();
        doc.toHeal();
    }
}

class Employee extends java.lang.Object { //extends java.lang.Object компилятор добавляет автоматически
    double salary;
    String name;
    int age;
    int experience;

    void eat(){
        System.out.println("кушать");
    }

    void sleep(){
        System.out.println("спать");
    }
}

class Doctor extends Employee{
//    String name;
//    int age;
//    int experience;
    String specialization;

//    void eat(){
//        System.out.println("кушать");
//    }
//
//    void sleep(){
//        System.out.println("спать");
//    }

    void toHeal(){ //лечить
        System.out.println("лечить");
    }
}


class Surgeon extends Doctor{ //класс хирург
    String scalpel;
    void operation(){

    }
}

class Dentist extends Doctor{

}




class Teacher extends Employee{
//    String name;
//    int age;
//    int experience;
    int numberOfStudents;

//    void eat(){
//        System.out.println("кушать");
//    }
//
//    void sleep(){
//        System.out.println("спать");
//    }

    void teaching(){ //лечить
        System.out.println("учить");
    }
}

class Driver extends Employee{
//    String name;
//    int age;
//    int experience;
    String carName;

//    void eat(){
//        System.out.println("кушать");
//    }
//
//    void sleep(){
//        System.out.println("спать");
//    }

    void drive(){ //лечить
        System.out.println("водит");
    }
}

//00-33-32