package Lessons.encapsulationSuperProtected_Les22;

public class Constructors2 {
}

class Human3 {
    public Human3(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String name;
    public String surname;

}

class Student3 extends Human3{
int course;

    Student3(String name, String surname, int course){
        super(name, surname);
        this.course = course;
    }

    public static void main(String[] args) {
        Student3 s = new Student3("Kolya", "Ivanov", 3);
        System.out.println(s.name + " " + s.surname + " " + s.course);
    }
}
