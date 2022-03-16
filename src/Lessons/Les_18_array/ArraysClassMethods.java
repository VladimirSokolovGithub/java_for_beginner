package Lessons.Les_18_array;

import java.util.Arrays;

public class ArraysClassMethods {
    public static void main(String[] args) {

        int [] array1 = {1, 9, 3, -8, 0, 5, 4, 1};

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        // 1. sort(array) - метод сортировки от меньшего значения к большему

        Arrays.sort(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        System.out.println(array1);

        // 2. binarySearch(array, value) - поиск определенного значения в определенном массиве,
                                        // возвращает индекс на котором находится искомый эллемент
                              //данный поиск коррестно будет работать только в отсортированном массиве
                              //если такого эллемента нет то возвращается отрицательный индекс

        int index1 = Arrays.binarySearch(array1, -8);
        System.out.println(index1);


    }
}
