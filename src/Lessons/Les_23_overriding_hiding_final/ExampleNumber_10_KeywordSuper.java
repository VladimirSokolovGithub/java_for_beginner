package Lessons.Les_23_overriding_hiding_final;

public class ExampleNumber_10_KeywordSuper {
    String s1 = "Hello";
    static double d1 = 3.14;

    int summa(int... i) {
        int result = 0;
        for (int a : i) {
            result += a;
        }
        return result;
    }

    static void abc() {
        System.out.println("static method");
    }
}

class B10 extends ExampleNumber_10_KeywordSuper {
    String s2 = super.s1 + ", friend!"; // можно написать и без super
    String s1 = super.s1 + ", friend!"; // но если мы переменную s1 сделали hide то super

    double d1 = super.d1; //но обратиться к статической переменной с помощью super мы можем

    //super в методах
    @Override
    int summa(int... i) {
        int result = super.summa(i);
        System.out.println("Summa: " + result);
        super.abc(); //так же с помощью super можно вызвать статический метод родительского класса
        return result;
    }


    public static void main(String[] args) {
        B10 b = new B10();
        System.out.println(b.s2);
        System.out.println(b.s1);
    }

    //super нельзя использовать в static методах и со static переменными
}
