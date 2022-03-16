package Lessons.Les_30_LambdaExpressions;

public class ExampleNumber_4_Lambda_examples {
    static void def(Test5 t){
        System.out.println(t.abc("Hello"));
    }

    static void def2(Test6 t){
        System.out.println(t.abc());
    }

    static void def(Test7 t){
        System.out.println(t.abc("Hello", "goodbye"));
    }




    public static void main(String[] args) {
        //пример 1
        def(x -> x.length());
        def(x -> {x = "ok"; return x.length();});
        //пример 2
        def2(() -> 5);
        //пример 3
        def((x,y) -> x.length());
        def((String x,String y) -> x.length());

    }
}

interface Test5{
    int abc(String s);
}

interface Test6{
    int abc();
}

interface Test7{
    int abc(String s1, String s2);
}

//01-08-28