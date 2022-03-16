package Lessons.Les_18_array;

public class ArraysWork {
    //работа с массивами
    public static void main(String[] args) {
        //массив это объект
        int[] array1; //объявление массива типа int, при таком объявлении массив ссылается на null
        String[] array2;
        double[][] array3;
        int [][] array10;
        double[] array7;

        array1 = new int[8]; //создание массива в памяти с указанием его размера,
                             // при этом ячейки массива заполняются дефолтными значениями типа данных,
                             // если int то нолями. Если reference тип то null.
        array2 = new String[3];
        array3 = new double[4][2]; //4 одномерных массива по 2 элемента (то есть длиной 2)
        array10 = new int[3][]; //3 одномерных массива неизвестной длины(или разной длинны)(так же называют зубчатыми массивами)
        array7 = new double[2];

        //длинна массива
        System.out.println(array2.length); //у массива длина это не метод как в String, а это переменная и
                                           // поэтому круглые скобки не указываются


//Инициализация массива бывает //Статическая и Динамическая

//Инициализация массива Статическим методом:
        array2[0] = "hi";
        array2[1] = "good buy";
        array2[2] = "ok";

        array3[0][0] = 3.14;
        array3[2][1] = 3.14;

        double[] array5;
        array5 = new double[2];
        array5[0] = 2.5;
        array5[1] = 3.5;
        array7 = array5; //в данном случае array7 будет ссылаться на тот же объект что и array5

        array3[1] = array5; //если длины масива одинаковы, то мы можем один массив поместить в другой
        System.out.println(array3[1][0] + " : " + array3[1][1]);


//Инициализация массива Динамическим методом:
        String[] array11;
        int[][] array12;

        array11 = new String[3];
        array12 = new int[3][];

        for (int i = 0; i < array11.length; i++) {
            array11[i] = "hi " + i;
            System.out.println(array11[i]);
        }

        array12[0] = new int[5];
        array12[1] = new int[2];
        array12[2] = new int[7];

        for (int i = 0; i < array12.length; i++) {
            for (int j = 0; j < array12[i].length; j++) {
                array12[i][j] = i+j;
                System.out.println(array12[i][j]);
            }
        }

//Смешанные варианты создания массива

        int[] array13 = new int[7];

        int[] array14 = {1,2,3};

        int[] array15;
        array15 = new int[]{1,2,3};

        int[] array16 = new int[]{1,2,3};

        //0:58
        int [] array17[];
        int []a, b; //здесь обяевлено два массива a и b
        int c[], d; //здесь объявлен массив c и переменная типа int d
        d = 5;

        //0.15.34

    }
}
