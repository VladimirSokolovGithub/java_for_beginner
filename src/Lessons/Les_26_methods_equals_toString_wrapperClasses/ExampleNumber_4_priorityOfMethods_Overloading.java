package Lessons.Les_26_methods_equals_toString_wrapperClasses;

public class ExampleNumber_4_priorityOfMethods_Overloading {
    //1
    void abc(int i){
        System.out.println("int");
    }
    void abc(byte i){
        System.out.println("byte");
    }
    void abc(long i){
        System.out.println("long");
    }

    //2
    void def(Object o){
        System.out.println("Object");
    }
    void def(String s){
        System.out.println("String");
    }

    //3
    void ghi(int a, int b){
        System.out.println("Hello 1");
    }
    void ghi(long a, long b){
        System.out.println("Hello 2");
    }
    void ghi(Integer a, Integer b){
        System.out.println("Hello 3");
    }
    void ghi(int ... a){
        System.out.println("Hello 4");
    }

    public static void main(String[] args) {
        ExampleNumber_4_priorityOfMethods_Overloading ex1 = new ExampleNumber_4_priorityOfMethods_Overloading();
        //вызовется метод int потому что 5 by defolt это int
        //если метод int закомментировать то вызовется метод long
        //что бы сконвертировать в меньший тип мы должны применить casting
        ex1.abc((byte) 5);

        ex1.def("Hello");

        ex1.ghi(1, 2); //в первую очередь java ищет наиболее точное совпадение метода и это int


    }
}


