package Lessons.array_les18;

public class MaxMinArray {
    public static void maxMin(double[] array) {
        double max = array[0];
        double min = array[0];
        for (int i = 1; i < array.length; i++) {

            if (array[i] > max){
                max = array[i];
            }

            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("минимальный эллемент массива " + min);
        System.out.println("максимальны эллемент массива " + max);
    }

    public static void main(String[] args) {
        double[] array = {1.05, -3.14, 8.0, 9.19, -3, 0};
        maxMin(array);
        maxMin(new double[]{2.5, -1.3, });
    }
}
