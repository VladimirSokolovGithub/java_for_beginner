package Lessons.Les_29_Date_and_Time;

public class ExampleNumber_0_WorkWithPrivateConstructor {
//    Car car = new Car(); //Ошибка компиляции
    Car car = Car.createCar();
}

class Car{
    private Car(){}
    static Car createCar(){ //Метод заменяет в других классах конструктор класса Car
                            // для возможности создания объектов
        return new Car();
    }
}
//00-14-06