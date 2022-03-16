package Lessons.Les_21_garbageCollector;

public class Constructor {
    Constructor() {
        System.out.println("this is Constructor");
        System.out.println("an object has been created");
    }

    void Constructor() { //если перед конструктором поставить return type то это уже не конструктор а метод
        System.out.println("this is method");
    }

    int Constructor = 5;
    //Constructor Constructor; //это плохая практика называть так же переменные как и класс
}


class A {
    public static void main(String[] args) {
        Constructor constructor = new Constructor();
    }
}
