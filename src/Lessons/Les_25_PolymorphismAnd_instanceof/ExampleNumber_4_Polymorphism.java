package Lessons.Les_25_PolymorphismAnd_instanceof;

public class ExampleNumber_4_Polymorphism {
    public static void main(String[] args) {
        Jumpable j = new Man();
        Man m = new Man();
        Student s = new Student();

        if (j instanceof Jumpable){
            System.out.println("j is Jumpable");
        }
        if (m instanceof Human){
            System.out.println("m is Human");
        }
//        if (s instanceof Human){
//            System.out.println("s is Human");
//        }

        if (s instanceof Jumpable){
            System.out.println("s is Human");
        }
    }

}

interface Jumpable{}
class Human implements Jumpable{}
class Man extends Human{}
class Student{}
