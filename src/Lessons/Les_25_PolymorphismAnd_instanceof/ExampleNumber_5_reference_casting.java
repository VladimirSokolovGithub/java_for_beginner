package Lessons.Les_25_PolymorphismAnd_instanceof;

public class ExampleNumber_5_reference_casting {
    public static void main(String[] args) {
        Helpable3 h3 = new Doctor3();
        h3.help();
        System.out.println(((Doctor3)h3).specialization);
        ((Doctor3)h3).toHeal();

        Employee3 emp1 = new Doctor3();
        Employee3 emp2 = new Teacher3();
        Employee3 emp3 = new Driver3();
        Employee3 emp4 = new Employee3();

        ((Doctor3)emp1).toHeal();

//        Doctor3 doctor3 = (Doctor3) emp1;
//        System.out.println(doctor3.specialization);
//        doctor3.toHeal();

        System.out.println(((Doctor3)emp1).specialization);
        ((Doctor3)emp1).toHeal();

//        Driver3 d3 = (Driver3) emp2; //здесь будет Exception так как emp2 это Teacher3

        ExampleNumber_5_reference_casting ex5 = new ExampleNumber_5_reference_casting();
        Employee3 e3 = new Employee3();
        System.out.println(e3 == emp1); //так писать можно но будет false
//        System.out.println(e3 == ex5); //так написать нельзя так как отсутствует связь is-a, компилятор не пропускает
        System.out.println(e3.equals(ex5)); //так писать можно, так как equals у нас может быть переопределен
                                            // и компилятор пропускает, но будет false

        Employee3[] arrays3 = {emp1, emp2, emp3, emp4};
        for (Employee3 e : arrays3){
            if (e instanceof Driver3){
                System.out.println(((Driver3)e).nameOfCar);
                ((Driver3)e).drive();
            }
        }
    }
}

class Employee3 {
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

class Doctor3 extends Employee3 implements Helpable3 {
    String specialization = "Хирург";

    @Override
    public void help() {
        System.out.println("Доктор оказывает помощь");
    }

    void toHeal() {
        System.out.println("лечить");
    }
}

class Teacher3 extends Employee3 {
    int numberOfStudents;

    void teaching() {
        System.out.println("учить");
    }
}

class Driver3 extends Employee3 {
    String nameOfCar = "Mercedes";
    void drive() {
        System.out.println("водить");
    }
}

interface Helpable3{
    void help();
}

//00-45-09