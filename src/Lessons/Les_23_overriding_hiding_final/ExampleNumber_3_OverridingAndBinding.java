package Lessons.Les_23_overriding_hiding_final;

public class ExampleNumber_3_OverridingAndBinding {
    //создадим два перегруженных метода
    void abc(Animal animal) {
        System.out.println("A");
    }

    void abc(Mouse mouse) {
        System.out.println("M");
    }

    public static void main(String[] args) {
        // В данном примере переменная an используется в качестве параметра в методе abc()
        // compile time видно, что она типа Animal, поэтому вызывается метод abc(), который принимает
        // в параметре Animal объект и будет выведено на консоль буква "А".
        // Здесь не нужна runtime проверка что на самом деле объект на который ссылается переменная an типа Mouse,
        // потому что она используется в параметре как переменная.

        //Если же на переменной an вызывался бы метод an.getName();, тогда естественно в runtime проверялось бы какой
        // метод getName() стоит вызывать и в нашем случае вызывается метод класса Mouse
        ExampleNumber_3_OverridingAndBinding ex = new ExampleNumber_3_OverridingAndBinding();
        Animal an = new Mouse();
        ex.abc(an);
        an.getName();

    }
}

class Animal {
    void getName() {
        System.out.println("Animal");
    }
}

class Mouse extends Animal {
    void getName() {
        System.out.println("Mouse");
    }
}
