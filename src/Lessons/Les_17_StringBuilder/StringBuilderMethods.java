package Lessons.Les_17_StringBuilder;

public class StringBuilderMethods {
    //Создание объектов StringBuilder

    public static void main(String[] args) {

        //констркуторы StringBuilder
        StringBuilder sb1 = new StringBuilder(); //создается объект без значения(пустой) (по by default
                                                // первоначальная вместимость 16 символов,
                                                //которые автоматически увеличиваются при необходимости)
//sb1 может содержать в себе массив где есть 16 мест для символов, если мест недостаточно то создаётся новый массив,
// все элементы старого массива копиуются в новый и добавляются новые места для наших char-ов и так до бесконечности.

        StringBuilder sb2 = new StringBuilder("Good day!!!"); //создается объект со значением String
        //выделяется capacity длиной значения String в нашем случае 11 + 16 дополнительных мест

        StringBuilder sb3 = new StringBuilder(50); //создается объект без значения(пустой) вместимостью 50 символов

        StringBuilder sb4 = new StringBuilder(sb2); //создаётся объект StringBuilder используя значение другого объекта StringBuilder

        // Изучить данный конструктор - StringBuilder sb5 = new StringBuilder(); //char sequence (последовательность символов)


        //методы StringBuilder:

        // 1. length() -> int - определяет длину StringBuilder
        System.out.println(sb2.length());
        System.out.println(sb3.length());

        // 2. charAt(int index) -> char - возвращает char по индексу
        System.out.println(sb2.charAt(4)); //вывод пробел

        // 3. indexOf(String s) -> int
        //    indexOf(String s, int fromIndex) -> int
        System.out.println(sb2.indexOf(" "));//индекс пробела - 4
        System.out.println(sb2.indexOf("!!!"));//индекс - 8, так как с 8-го символа начинаются 3 воскл.знака
        System.out.println(sb2.indexOf("o", 2));// какой индекс у "o" со второго символа

        // 4. substring(int beginIndex) -> String
        //    substring(int beginIndex, int endIndex) -> String
        String s = sb2.substring(5);
        System.out.println(s);
        String s2 = sb2.substring(5, 8); //элемент с конечным индексом не включается
        System.out.println(s2);

        // 5. subsequence(int start, int end) -> CharSequence - отрывок последовательности символов,
                                                              // возвращает последовательность char-ов

        System.out.println(sb2.subSequence(5, 8)); // метод работает так жже как и substring, только в output у него Char

        // 6. append(dataType dt) -> StringBuilder //добавляет в конец нашего StringBuilder какое то
                                                    // дополнительное значение и возвращает StringBuilder - меняет его
                                                    //изменяет сам текущий объект на новый
                                                    // В параметре могут стоять различные типы данных и примитивы и reference

        sb2.append(22);
        System.out.println(sb2);
        sb2.append(true);
        System.out.println(sb2);
        sb2.append(sb2);
        System.out.println(sb2);
        sb2.append("Hello");
        System.out.println(sb2);

        // 6. insert(int toIndex, dataType dt) -> StringBuilder - вставляет на определенную позицию, какое то значение

        System.out.println(sb2.insert(4, 55)); //на 4-ю позицию где сейчас пробел вставим 55
        System.out.println(sb2.insert(sb2.length(), "255Hello"));

        // 7. delete(int start, int end) -> StringBuilder //удаляет символы с определенного индекса включая его
                                                            // и заканчивая определенным индексом не включая его

        StringBuilder sb10 = new StringBuilder("Hello World");
        sb10.delete(3, 6);
        System.out.println(sb10);

        // 8. deleteCharAt(int index) -> StringBuilder //Удаляет конкретный символ с конкретным индексом
        StringBuilder sb11 = new StringBuilder("Hello World");
        sb11.deleteCharAt(6);
        System.out.println(sb11);

        // 9. reverse() -> StringBuilder //переворачивает StringBuilder в обратную сторону

        sb11.reverse();
        System.out.println(sb11);

        //10. replace(int start, int end, String s) -> StringBuilder
        //меняет отрезок начиная с какой то позиции и заканчивая нужной позицией не включая её на определенный String

        StringBuilder sb12 = new StringBuilder("Vsem privet");
        sb12.replace(0, 5, "Pete ");
        System.out.println(sb12);

        //11. capacity() -> int
        System.out.println(sb12.capacity());

        // 12. При цепочке методов (method chaining), методы выполняются слева на право как и в string

        //******************************

        //test

        StringBuilder sb13 = new StringBuilder("123");
        StringBuilder sb14 = sb13.append("45");
        sb14 = sb14.append("6").append("7");
        System.out.println("ab13 = " + sb13);
        System.out.println("ab14 = " + sb14);

        // 13. метод append
        StringBuilder sb15 = new StringBuilder("ok");
        char[] array = new char[]{'h', 'e', 'l', 'l', 'o'};
        sb15.append(array, 2, 3);//добавляет в объект sb15 элементы из массива чаров array,
                                           // начиная с элемента под индексом 2 в количестве трёх элементов
        System.out.println(sb15);

        // 14. метод insert
        StringBuilder sb16 = new StringBuilder("privet");
        char[] array1 = {'h', 'e', 'l', 'l', 'o'};
        sb16.insert(1, array1, 2,3);//будем insert в объект sb16 на место эллемента под индексом 1
                                                    // элементы из массива чаров array, начиная с элемента
                                                    // под индексом 2 в количестве трёх элементов
        System.out.println(sb16);


    }
}
