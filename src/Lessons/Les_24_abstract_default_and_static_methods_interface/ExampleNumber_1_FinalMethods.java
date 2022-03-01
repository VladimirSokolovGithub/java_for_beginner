package Lessons.Les_24_abstract_default_and_static_methods_interface;

public class ExampleNumber_1_FinalMethods {
//    public final static void main(String[] args) {
//        System.out.println("Hello");
//    }
    //если метод final, то в дочернем классе(subclass) класса ExampleNumber_1_FinalMethods
    // не сможем делать переопределение(overriding) или hiding этого метода
}

class A{
    String s = "Hello";
    void abc(){
        System.out.println("???");
    }
}

class B extends A{
    String s = "goodbye"; //hide variable
    void abc(){ //override method
        System.out.println("!!!");
    }
}

class C extends B{
    public static void main(String[] args) {
        C c = new C();
        c.abc(); //вызывается унаследованный метод из класса "B"
        System.out.println(c.s);//вызывается hide variable из класса "B"

    }
}