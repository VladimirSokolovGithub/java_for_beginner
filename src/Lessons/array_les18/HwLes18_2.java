package Lessons.array_les18;

public class HwLes18_2 {
    public static void showArray(String[][] array){
        System.out.println("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("{");
            for (int j = 0; j < array[i].length; j++) {
                if (j != array[i].length-1){
                    System.out.println(array[i][j] +", ");
                } else {
                    System.out.println(array[i][j]);
                }

            }
        }
    }
}
