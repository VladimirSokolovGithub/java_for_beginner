package Lessons.Les_22_encapsulationSuperProtected.lesson22.p1;
import Lessons.Les_22_encapsulationSuperProtected.Encapsulation;

//импорт и обращение к классу Encapsulation из другого класса другого пакета и работа с его переменными
//через методы set и get
public class TestClass {
    public static void main(String[] args) {
        Encapsulation en = new Encapsulation("male");
        en.setName("Kolya");
        en.setWeight(50);
        en.setAge(15);

        System.out.println(en.getName());
        System.out.println(en.getAge());
        System.out.println(en.getWeight());


    }
}
