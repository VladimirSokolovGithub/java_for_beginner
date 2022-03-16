package Lessons.Les_18_array;

public class HwLes18_1 {
    public static int[] sortArray(int[] array){
        int a;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i+1; j < array.length ; j++) {
                if (array[j] < min){
                    min = array[j];
                    index = j;
                }
            }
            if (i != index){
                a = array[i];
                array[i] = min;
                array[index] = a;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {5,8,1,-3,0,8,2,2};
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
        sortArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }


}
