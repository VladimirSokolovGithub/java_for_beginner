package Lessons.Les_18_array;

public class ComparingArrays {
    public static void main(String[] args) {

        int [] array1 = {1, 9, 3, -8, 0, 5, 4, 1};
        int [] array2 = {1, 9, 3, -8, 0, 5, 4, 1};
        int [] array3 = array2; // true
            System.out.println(array1 == array2); //false
            System.out.println(array1.equals(array2)); //false

        array1[1] = 0; //можно перезаписывать элементы массива
        array2[5-3] = 3;//можно перезаписывать элементы массива выполняя внутри скобок какое то действие
        array1[array1.length - 1] = 10;




    }
}
