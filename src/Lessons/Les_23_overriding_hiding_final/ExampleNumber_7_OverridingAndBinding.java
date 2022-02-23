package Lessons.Les_23_overriding_hiding_final;

public class ExampleNumber_7_OverridingAndBinding {

}
//В этом примере метод showInfo() наследуется классом Mouse2 по умолчанию в классе Mouse2 он не переопределяется,
// а вызывается из класса родителя Animal2, но так как в классе Mouse2 есть переопределенный метод showName(),
// то именно он подтягивается в тело метода showInfo(). runtime binding определяет к классу какого объекта
// будет относиться метод showName().

class Animal2{
    String showName() {
        return "Some Animal";
    }

    void showInfo(){
        System.out.println("Name of animal: " + showName());
    }
}

class Mouse2 extends Animal2{
    @Override
    String showName() {
        return "Mouse";
    }

    public static void main(String[] args) {
        Animal2 animal2 = new Animal2();
        Animal2 animal = new Mouse2();
        animal.showInfo();
    }
}
