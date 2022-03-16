package Lessons.Les_19_commandLineArguments_varargs;

public class ForeachLoop {
    //Foreach Loop в основном используют для работы с массивами и коллекциями где необходимо поочередно
    // перебирать элементы, вывести на экран, но не изменять их
    //операторы break и continue работают так же как и с обычным for loop
    //после компиляции java преобразует Foreach Loop в обычный for
    public static void main(String[] args) {
        int[] array = {0, 6, 4, 1};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();


        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();


        int[] array2 = {0, 6, 4, 1};
        int sum = 0;
        for (int a : array2) {
            sum += a;
        }
        System.out.println(sum);


        String[] students = {"Ivanov", "Petrov", "Sidorov"};
        String[] exams = {"mat analiz", "filosofia"};
        for (String s1 : students) {
            for (String s2 : exams) {
                System.out.println(s1 + " " + s2);
            }
        }
        System.out.println();


        int[][] array3 = {{3, 7, 8}, {4, 5}, {9, 4, 4, 6, 8, 3}};

        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                System.out.print(array3[i][j] + " ");
            }
        }
        System.out.println();


        for (int[] array4 : array3) {
            for (int a : array4) {
                System.out.print(a + " ");
            }
        }
        System.out.println();


        int[] array5 = {0, 6, 4, 1};

//        for (int i = 0; i < array5.length; i++) {
//            array5[i] = 3; //все эллементы массива становились равным 3
//        }
//        for (int i = 0; i < array5.length; i++) {
//            System.out.print(array5[i] + " ");
//        }
//        System.out.println();
        System.out.println();


        //с помощью Foreach Loop не возможно изменить значение примитивных и объекты ссылочных типов данных
        for (int a : array5) {
            a = 3; //значение элементов в массиве не изменилось, а менялось только значение переменной 'a',
            // которая итерировалась по массиву
            System.out.print(a + " ");
        }
        System.out.println();
        for (int i = 0; i < array5.length; i++) {
            System.out.print(array5[i] + " ");
        }

        System.out.println();
        System.out.println();
        //Рассмотрим теперь на примере ссылочных типов данных

        String[] array6 = {"privet", "poka", "ok"};
        for (String s : array6) {
            s = new String("Hello");
            System.out.print(s + " ");
        }
        System.out.println();
        for (int i = 0; i < array6.length; i++) {
            System.out.print(array6[i] + " ");
        }

        System.out.println();
        System.out.println();


        //Рассмотрим теперь на примере массива StringBuilder
        StringBuilder sb1 = new StringBuilder("privet");
        StringBuilder sb2 = new StringBuilder("poka");
        StringBuilder sb3 = new StringBuilder("ok");

        StringBuilder[] array7 = {sb1, sb2, sb3};
        for (StringBuilder sb : array7) {
            sb = new StringBuilder("Hello");
            System.out.print(sb + " ");
        }
        System.out.println();
        for (int i = 0; i < array7.length; i++) {
            System.out.print(array7[i] + " ");
        }
        System.out.println();
        System.out.println();



        StringBuilder sb4 = new StringBuilder("privet");
        StringBuilder sb5 = new StringBuilder("poka");
        StringBuilder sb6 = new StringBuilder("ok");

        StringBuilder[] array8 = {sb4, sb5, sb6};
        for (StringBuilder sb : array8) {
            sb.append(" Java"); //лиш с помощью методов мы можем менять само значение объекта, но
                                //сам объект изменить у нас не получиться
            System.out.print(sb + " ");
        }
        System.out.println();
        for (int i = 0; i < array8.length; i++) {
            System.out.print(array8[i] + " ");
        }

        //Тем неменее внутри обычного for мы можем менять объекты так как работали непосредственно
        // с самим элементом массива или коллекции или примитивом
    }
}
