package Lessons.Les_24_abstract_default_and_static_methods_interface.HwLes24;

public class HwLes24 {
    public static void main(String[] args) {
        Mechenosec m = new Mechenosec("Karl");
        System.out.println(m.name);
        m.eat();
        m.swim();
        m.sleep();
        Speakable s1 = new Penguin("Kovalski");
        s1.speak();
        Animal a = new Lion("Leva1");
        System.out.println(a.name);
        a.eat();
        a.sleep();
        Mammal mammal = new Lion("Leva2");
        System.out.println(mammal.name);
        mammal.eat();
        mammal.run();
        mammal.speak();
        mammal.sleep();
    }
}

abstract class Animal{
    String name;
    Animal(String name){
        this.name = name;
    }

    abstract void eat();
    abstract void sleep();
}

abstract class Fish extends Animal{
    Fish(String name){
        super(name);
        this.name = name;
    }

    public void sleep(){
        System.out.println("Всегда интересно наблюдать как спят рыбы");
    }

    abstract void swim();
}

abstract class Bird extends Animal implements Speakable{
    Bird(String name){
        super(name);
        this.name = name;
    }
    abstract void fly();

    public void speak(){
        System.out.println(name + " sings");
    }
}
abstract class Mammal extends Animal implements Speakable{ //Млекопетающие
    Mammal(String name){
        super(name);
        this.name = name;
    }
    abstract void run();
}

interface Speakable{
    default void speak(){
        System.out.println("Somebody speaks");
    }
}

class Mechenosec extends Fish{
    Mechenosec(String name){
        super(name);
        this.name = name;
    }
    public void swim(){
        System.out.println("Меченосец красивая рыб, которая быстро плавает");
    }
    public void eat(){
        System.out.println("Меченосец не хищная рыба, ест обычный корм");
    }
}

class Penguin extends Bird{
    Penguin(String name){
        super(name);
        this.name = name;
    }
    public void eat(){
        System.out.println("Пингвин любит есть рыбу");
    }
    public void sleep(){
        System.out.println("Пингвины спят прижавшись друг к другу");
    }
    public void fly(){
        System.out.println("Пингвин не умеет летать");
    }
    public void speak(){
        System.out.println("Пингвины не умеют петь как соловьи");
    }
}

class Lion extends Mammal{
    Lion(String name){
        super(name);
        this.name = name;
    }
    public void eat(){
        System.out.println("Лев любит мясо");
    }
    public void sleep(){
        System.out.println("Большую часть дня лев спит");
    }
    public void run(){
        System.out.println("Лев это не самая быстрая кошка");
    }
}