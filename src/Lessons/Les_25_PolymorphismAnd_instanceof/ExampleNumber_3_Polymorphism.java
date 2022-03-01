package Lessons.Les_25_PolymorphismAnd_instanceof;

public class ExampleNumber_3_Polymorphism {

}

class Car{
    static int a = 5;

    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.a);
        c=null;
        System.out.println(c.a);
        //Так как переменная "а" - static, то компилятор не проверяет, ссылается ли переменная "с" на объект или нет,
        // главное, что переменная "с" принадлежит классу Car
        //Если переменная "а" - не была static, то будет Exception
    }
}
