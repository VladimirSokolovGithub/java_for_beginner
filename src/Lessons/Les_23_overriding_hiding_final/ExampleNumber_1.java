package Lessons.Les_23_overriding_hiding_final;

public class ExampleNumber_1 {

    //Типы ссылочных переменных и объектов
    public Object abc(){
        return new Doctor(); //мы можем написать так потому что возвращаемый тим у
                                // нас Object а любой объект в java это Object
    }

    public static void main(String[] args) {
        Doctor d = new Doctor(); //Переменная определенного типа может ссылаться на объект того же типа
        Teacher t = new Teacher();
        Driver dr = new Driver();
        Employee e = new Employee();

        Employee emp1 = new Doctor(); //Переменная типа Employee(типа родительского Класса) может
                                      // ссылаться на объект child класса (sub class-a).
                                      // Переменная суперкласса может ссылаться на любой объект сабкласса

        //теперь рассмотрим какие переменные и методы мы можем вызвать у объекта emp1
        System.out.println(emp1.salary);
        System.out.println(emp1.name);
        System.out.println(emp1.age);
        System.out.println(emp1.experience);
        emp1.eat();
        emp1.sleep();
//        emp1.toHeal(); //Хотя реальный объект на который ссылается переменная emp1 это new Doctor(), но
                       // компилятор проверяет тип данных самой reference переменной и видит что
                       // она типа Employee, а у Employee метода toHeal() нет.


        Employee emp2 = new Teacher();
        Employee emp3 = new Driver();

        Surgeon s = new Surgeon();
        Doctor doc = new Surgeon();//у объекта doc есть все методы и переменные класса Doctor и класса Employee
        //переменную scalpel и метод operation() класса Surgeon мы вызвать не сможем
        System.out.println(doc.salary);
        System.out.println(doc.name);
        System.out.println(doc.age);
        System.out.println(doc.experience);
        doc.eat();
        doc.sleep();
        doc.toHeal();

        Employee emp4 = new Surgeon();//Зачем нужно такое написание такой синтаксис мы узнаем на уроке полиморфизма

    }
}

class Employee {
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;

    void eat(){
        System.out.println("кушать");
    }

    void sleep(){
        System.out.println("спать");
    }
}

class Doctor extends Employee {
    void toHeal(){ //лечить
        System.out.println("лечить");
    }
}
class Surgeon extends Doctor { //класс хирург
    String scalpel;
    void operation(){
    }
}


class Teacher extends Employee {
    int numberOfStudents;
    void teaching(){ //лечить
        System.out.println("учить");
    }
}

class Driver extends Employee {
    void drive(){ //лечить
        System.out.println("водить");
    }
}
