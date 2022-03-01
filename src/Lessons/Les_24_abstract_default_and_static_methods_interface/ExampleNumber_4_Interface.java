package Lessons.Les_24_abstract_default_and_static_methods_interface;

public class ExampleNumber_4_Interface {
    Jumpable j1 = new Human();
    Jumpable j2 = new Animal();
}

//Есть два класса они не связаны отношением is-а. Т.е Human это не Animal и наоборот, они связаны только общим предком
// классом Object. Но мы можем сблизить эти классы с помощью имплементации какого то интерфейса. Теперь
// к объектам обоих классов можно обращаться с помощью переменных с типом этого интерфейса.
class Human implements Jumpable {
    public void jump(){
        System.out.println("Human jumps");
    }
}

class Animal implements Jumpable{
    public void jump(){
        System.out.println("Animal jumps");
    }
}

interface Jumpable{
    void jump();
}

interface A2{
    void abc();
}
interface B2 extends A2, Jumpable{ //таким образом в этом интерфейсе будут унаследованы методы из интерфейсов
                                   // A2 и Jumpable + есть свой метод
    void def();
}
