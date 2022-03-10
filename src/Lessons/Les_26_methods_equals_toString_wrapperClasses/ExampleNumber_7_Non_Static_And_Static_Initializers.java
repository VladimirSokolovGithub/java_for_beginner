package Lessons.Les_26_methods_equals_toString_wrapperClasses;

public class ExampleNumber_7_Non_Static_And_Static_Initializers {
    public static void main(String[] args) {
//        Animal a = new Animal();

        System.out.println(Animal.s1);
        System.out.println(Mammal.s1);
        System.out.println(Lion.s1);
        Lion l = new Lion();
    }
}

class Animal {
static String s1 = "Animal static variable";
String s2 = "Animal non-static variable";

    Animal(){
        System.out.println("Constructor of Animal");
    }

    static
    {
        System.out.println("Static initializer in Animal");
    }

    {
        System.out.println(s2);
        System.out.println("Non-Static initializer in Animal");
    }

}

class Mammal extends Animal{
    static String s1 = "Mammal static variable";
    String s2 = "Mammal non-static variable";
    Mammal(){
        System.out.println("Constructor of Mammal");
    }

    static
    {
        System.out.println("Static initializer in Mammal");
    }

    {
        System.out.println(s2);
        System.out.println("Non-Static initializer in Mammal");
    }

}

class Lion extends Mammal{
    static String s1 = "Lion static variable";
    String s2 = "Lion non-static variable";
    Lion(){
        System.out.println("Constructor of Lion");
    }

    static
    {
        System.out.println("Static initializer in Lion");
    }

    {
        System.out.println(s2);
        System.out.println("Non-Static initializer in Lion");
    }

}