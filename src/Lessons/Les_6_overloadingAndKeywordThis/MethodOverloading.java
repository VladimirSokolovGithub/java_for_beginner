package Lessons.Les_6_overloadingAndKeywordThis;

public class MethodOverloading {

    //Перегрузка метода может быть:
    //1.Перегружаемые методы имеют одинаковые имена и разный спиок параметров
    //а) параметры разные по типам данных
    //б) параметры разные по количеству но можно одинакового типа
    //в) параметры разные по порядку например void show(int i, String s) и void show(String s, int i)

    void show(int i1){
        System.out.println(i1);
        System.out.println("Data type is Int");
    }

    void show(int a, int b){
        System.out.println(a + "" + b);
        System.out.println("Data type is Int");
    }

    void show(boolean b1){
        System.out.println(b1);
        System.out.println("Data type is boolean");
    }

    void show(String s1){
        System.out.println(s1);
        System.out.println("Data type is String");
    }
}

class MethodOverloadingTest{
    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();

        int a = 500;
        mo.show(a);

        boolean b = true;
        mo.show(b);

        String s = "Privet";
        mo.show(s);

    }

}