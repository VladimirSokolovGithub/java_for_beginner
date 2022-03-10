package Lessons.Les_26_methods_equals_toString_wrapperClasses;

public class ExampleNumber_5_Non_Static_And_Static_Initializers {

    {
        System.out.println("Это блок инициализации 3");
    }

    public ExampleNumber_5_Non_Static_And_Static_Initializers(){
        System.out.println("Это конструктор1");
    }

    public ExampleNumber_5_Non_Static_And_Static_Initializers(int a){
        this(); //внутри себя конструктор вызывает свой overloaded конструктор
        System.out.println("Это конструктор 2");
    }

    // 1. Блок инициализации используется для выполнения какого-либо кода при создании объекта
    // независимо от конструктора
    // 2. Используется в анонимных классов - в данном примере не рассматривается
    String s;
    {
        System.out.println("Это блок инициализации 1");
//        System.out.println("Hello");
//        int a = 5;
//        System.out.println(a);
//        s = "ok";
        //внутри блока можно вызывать методы, писать loop-ы,

    }

    static
    {
        System.out.println("Это блок инициализации STATIC 1");
    }

    {
        System.out.println("Это блок инициализации 2");
    }

    static
    {
        System.out.println("Это блок инициализации STATIC 1");
    }
    public static void main(String[] args) {
        ExampleNumber_5_Non_Static_And_Static_Initializers ex1 = new ExampleNumber_5_Non_Static_And_Static_Initializers();
        ExampleNumber_5_Non_Static_And_Static_Initializers ex2 = new ExampleNumber_5_Non_Static_And_Static_Initializers(3);

    }
}


