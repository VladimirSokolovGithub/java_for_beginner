//Пример присваивания значений переменным ссылочных типов данных
package Lessons.constructorAndMethods_Les5;

public class Human {
    String name;
    Car5 car;
    BankAccount ba;

    void info(){
        System.out.println("Имя: " + name + " цвет машины: " + car.color + " Баланс банковского счёта: " + ba.balance);
    }
}

class HumanTest {
    public static void main(String[] args) {
        Human human = new Human();
        human.name = "David";
        human.car = new Car5("red", "V8");
        human.ba = new BankAccount(18, 200.5);
        human.info();
    }
}

class Car5 {
    Car5(String c, String e){
        color = c;
        engine = e;
    }

    String color;
    String engine;
}

class BankAccount {
    BankAccount(int id2, double balance2){
        id = id2;
        balance = balance2;
    }
    int id;
    double balance;
}