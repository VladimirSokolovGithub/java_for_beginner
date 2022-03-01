package Lessons.Les_24_abstract_default_and_static_methods_interface;

public class ExampleNumber_2_AbstractClassAndMethods {
    public static void main(String[] args) {
        Shape shape1 = new Square(); //можно создать reference variable класса Shape и присвоить ей ссылку
                                     // на объект дочернего класса
        //Но с помощью этой переменной shape1 мы можем обращаться только к элементам дочернего класса
        System.out.println(shape1.numberOfSides);
        shape1.area(); //runtime binding

    }
}

// Невозможно создать объект(instance - экземпляр) абстрактного класса
// Абстрактный класс может и не содержать абстрактных методов
// Дочерний класс должен переопределить(overriding) все абстрактные методы
// Абстрактный класс не может быть final, так как он должен наследоваться
// Переменные не могут быть abstract, только классы или методы
// У абстрактного класса есть конструктор
abstract class Shape {//фигура
//    Shape(int numberOfSides){
//        this.numberOfSides = numberOfSides;
//    }

    int numberOfSides = 0;

    abstract void perimeter();

    abstract void area();//площадь

    //в абстрактном классе могут быть и обычные методы
    void showInfo(){
        System.out.println("Thi is shape");
    }

}

//В классах ниже нужно будет переопределять методы и hide(хайдить) переменную
class Square extends Shape {//Квадрат
//    Square(int numberOfSides){
//        super(numberOfSides);
//        this.numberOfSides = numberOfSides;
//    }

    int numberOfSides = 4;
    int side = 10;
    public void perimeter(){
        System.out.println("Периметр квадрата = " + 4 * side);
    }

    public void area(){
        System.out.println("Площадь квадрата = " + side * side);
    }
}

class Rectangle extends Shape {//Прямоугольник
    int numberOfSides = 4;
    int side1 = 8;
    int side2 = 5;
    public void perimeter(){
        System.out.println("Периметр прямоугольника = " + 2 * (side1 + side2));
    }

    public void area(){
        System.out.println("Площадь прямоугольника = " + side1 * side2);
    }

}

//Клас наследуемый от наследника абстрактного класса не обязан переопределять методы абстрактного класса
// так как они уже переопределены в наследнике
class Parallelipiped extends Rectangle{

}

class Circle extends Shape {//Окружность
    int numberOfSides = 0;
    int radius = 3;
    public void perimeter(){
        System.out.println("Периметр окружности = " + (2 * 3.14 * radius));
    }

    public void area(){
        System.out.println("Площадь окружности = " + 3.14 * radius * radius);
    }
}

abstract class Quadrangle extends Shape{
    void def(){
        System.out.println("Это четырёхугольник");
    }

}