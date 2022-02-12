package Lessons.string_les_16;

public class StringLes16 {
//презентация
    public static void main(String[] args) {

        //Объявление и создание объектов String
        String s1 = new String("Good day"); //всегда создается новый объект в памяти

        String s2 = "Hello"; // создается объект String в пуле строк (String pool)
                             // если такого объекта еще там нет

        System.out.println("Hello");// это тоже создается объект String в String pool
                                    // если такого объекта еще там нет (в
                                    // нашем случае новый объект не создается)


        //String is immutable - значение String не может быть изменено потому что
        //1. String хранит своё значение в private массиве и массив имеет фиксированную длину
        //2. String хранит своё значение в final массиве, следовательно его инициализация может быть только 1 раз
        //3. Ни один из методов класса String не изменяет индивидуальные элементы массива типа char


        // 4. дополнительные конструкторы String
        StringBuilder sb1 = new StringBuilder("Hello");
        String s11 = new String(sb1);

        //5.
        StringBuffer sb2 = new StringBuffer("Hello");
        String s12 = new String(sb2);

        //6. Ещё один конструктор класса String
        char[] array = new char[]{'h', 'e', 'l', 'l', 'o'};
        String s = new String(array); //можно в качестве параметра String использовать массив типа char

        //пример
        char[] array1 = new char[]{'h', 'e', 'l', 'l', 'o'};
        String string = new String(array1);
        System.out.println(string);

    }

}
