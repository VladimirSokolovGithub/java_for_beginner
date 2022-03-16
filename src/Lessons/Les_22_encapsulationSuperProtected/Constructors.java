package Lessons.Les_22_encapsulationSuperProtected;

//конструкторы не наследуются
public class Constructors {

}

class Human2 {
//    Human2(){super();}

    Human2(String name){
        this(name, null);
    }

    public Human2(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String name;
    public String surname;

}

class Student2 extends Human2{
//    Student2(){ //конструктор по умолчанию
//        super(); //если у нас в классе наследнике вызывается конструктор по умолчанию,
//                // то и в классе родителе будет вызван конструктор по умолчанию
//    }

    Student2(){
        this(5);
        System.out.println("Hello");
    }

    Student2(int i){
        super("Petya");
    }

    public static void main(String[] args) {
        Student2 s = new Student2();
    }
}