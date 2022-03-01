package Lessons.Les_24_abstract_default_and_static_methods_interface;

public class ExampleNumber_5_InterfaceDefaultMethods {

}
//default метод в интерфейсе всегда имеет тело и его можно оверрайдить а можно и не оверрайдить и
// использовать с дефолтной реализацией. Все default методы являются public по умолчанию
interface I1{
    void abc();

    public default void ghi(){
        System.out.println("Это дефолтный метод ghi");
    }

    default void def(){
        System.out.println("Это дефолтный метод def");
    }
}

class Z1 implements I1{
    public void abc(){
        System.out.println("Это метод abc");
    }

    public static void main(String[] args) {
        Z1 z = new Z1();
        z.abc();
        z.def();
        z.ghi();
    }

}
