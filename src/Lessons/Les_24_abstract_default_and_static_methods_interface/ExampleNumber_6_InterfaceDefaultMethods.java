package Lessons.Les_24_abstract_default_and_static_methods_interface;

public class ExampleNumber_6_InterfaceDefaultMethods {

}

interface I2{
    default void abc(){
        System.out.println("Это дефолтный метод abc");
    }
    public static void def(){
        System.out.println("static method");
    }
}

//Интерфейс I3 может не оверрайдить метод abc() и тогда он будет выглядеть точно так же или оверрайдить
// и задать другую реализацию либо сделать этот дефолтный метод абстрактным
interface I3 extends I2{
//    public default void abc(){
//        System.out.println("Это дефолтный метод abc!!!");
//    }
void abc(); //таким образом классы которые будут имплементировать этот интерфейс должны оверайдить этот метод
            // или стать абстрактными
}

abstract class R implements I2{
//    public void abc(){
//        System.out.println("Это override метод abc for abc");
//    }
    // или же можно тоже сделать метод абстрактным
    public abstract void abc();
}

//Статический метод не наследуется из интерфейса в класс и поэтому обращаться к нему с помощью имени класса нельзя
class R2 implements I2{
    public static void main(String[] args) {
//        R2.def(); //так нельзя
        I2.def(); //так можно, с помощью названия интерфейса, даже если мы не имплементим этот интерфейс
                    // роль играет область видимости
    }
}
//01-35-19