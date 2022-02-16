package Lessons.commandLineArguments_varargs_Les19;

public class Varargs {
    /*

    static void summa(int a, int b){
        System.out.println(a + b);
    }

    static void summa(int a, int b, int c){
        System.out.println(a + b + c);
    }

    static void summa(int a, int b, int c, int d){
        System.out.println(a + b + c + d);
    }

     */

    static void summa(double[] a){
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        System.out.println(summa);
    }

    //вместо выше перечисленных перегруженных методов можно использовать метод с параметрами
    // varargs (variable arguments)

    //пример varargs (variable arguments)
    static void summa(int ... a){
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        System.out.println(summa);
    }
    //после компиляции java переводит этот (int ... a) varargs в массив
    //с varargs параметрами можно использовать и другие параметры тоже

    static void summa(String s, int ... a){
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        System.out.println(summa);
        System.out.println(s);
    }

// Правила (тип данных ... a) varargs.
// - три точки пишуться между типом данных и переменной, тип данных может быть какой угодно
// - в листе параметров метода может быть только один varargs "static void summa(String s, int ... a)"
// - в листе параметров метода varargs должен стоять самым последним (String s, int ... a)
// - при вызове метода в листе параметров которого используется varargs, так же можно указать массив
    // например: summa("hello", new int[]{3, 5, 7 , 9});
// в методе main так же можно заменить массив String на varargs - public static void main(String ... args)
    // так как в конечном итоге varargs превращается в массив
// так же в качестве аргументов varargs можно использовать массивы (int[] ... array)

    public void abc(int[] ... array){

}

    public static void main(String[] args) {
        summa(new double[]{3.5, 5.0});

        summa();
        summa(6);
        summa(6,3);
        summa(6, 3,10);

        summa("hello", 3, 5);
        System.out.println();
        summa("hello", new int[]{3, 5, 7 , 9});


    }
}
