package Lessons.Les_26_methods_equals_toString_wrapperClasses;

public class ExampleNumber_6_Non_Static_And_Static_Initializers {

 //1
    int a = 3;

 //3
    public ExampleNumber_6_Non_Static_And_Static_Initializers(){
        a = 4;
    }

 //2
    {
        a = 5;
    }

//    public static void main(String[] args) {
//        ExampleNumber_6_Non_Static_And_Static_Initializers ex1 = new ExampleNumber_6_Non_Static_And_Static_Initializers();
//        System.out.println(ex1.a);
//    }
}

class A{
    //1
    static final int b;

    int a = 5;
    //2
    //в статических инициализаторах нельзя обращаться к нестатическим переменным
    //Статический инициализатор срабатывает во время загрузки класса, а не вовремя создания объекта
    static
    {
        b = 10;
//        a = 10;
    }
}

class B{
    static int c;
    static final int d;
    static final int e = 1;
    static final int f;

    static
    {
        c = 5;
        d = 3;
//        e = 2;
        f = 0;
    }

}
//1-18-07