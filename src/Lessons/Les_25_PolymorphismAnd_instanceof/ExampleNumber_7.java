package Lessons.Les_25_PolymorphismAnd_instanceof;

public class ExampleNumber_7 {

}

class Test10{
    int a = 5;
    void abc(){
        System.out.println("ok1");
    }
}

class Test20 extends Test10{
    int a = 10;
    void abc(){
        System.out.println("ok2");
    }
}

//как из класса Test30 можно вызвать метод abc() класса Test20?
class Test30 extends Test20{
    int a = 15;
    void abc(){
        super.abc(); //так можно вызвать метод abc() класса Test20
//        super.super.abc(); // так написать не можем т.е. не можем вызвать метод abc() из класса Test10
        System.out.println("ok3");
    }

    public static void main(String[] args) {
        Test30 test30 = new Test30();
        System.out.println(((Test10)test30).a);
        ((Test10)test30).abc(); //выведется "ok3" так как в рантайме java увидит что test30
                                // все таки ссылается на объект класса Test30
    }
}

