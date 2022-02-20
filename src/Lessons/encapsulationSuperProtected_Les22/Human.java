package Lessons.encapsulationSuperProtected_Les22;

public class Human {
//    public Human(String name){
//        this.name = name;
//    }

//    public String name = "Kolya";
    private String name = "Kolya";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    public static int salary = 150;
    private static int salary = 150;

//    public void work(){
//        System.out.println("Work");
//    }

    private void work(){
        System.out.println("Work");
    }

//    public static void rest(){
//        System.out.println("Rest");
//    }

    private static void rest(){
        System.out.println("Rest");
    }
}

class Student extends Human {
    public static void main(String[] args) {
        Student s = new Student();
//        System.out.println(s.name);
        System.out.println(s.getName());
//        System.out.println(Student.salary);
//        s.work();
//        Student.rest();
    }
}