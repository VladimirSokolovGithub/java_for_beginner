package Lessons.Les_23_overriding_hiding_final;

public class ExampleNumber_8_OverridingAndBinding {
}
//Полиморфизм это способность метода делать разные вещи в зависимости от того каким объектом был вызван
// этот метод

class Animal3{
    static String showName() {
        return "Some Animal";
    }

    void showInfoAboutAnimal(){
        System.out.println("Name of animal: " + showName());
    }
}

class Mouse3 extends Animal3{
//    Это Hiding метод так как метод static
    static  String showName() {
        return "Jerry";
    }

    void showInfoAboutMouse(){
        System.out.println("Name of mouse: " + showName());
    }

    public static void main(String[] args) {

        Mouse3 mouse3 = new Mouse3();
        mouse3.showInfoAboutAnimal();
        mouse3.showInfoAboutMouse();
    }
}