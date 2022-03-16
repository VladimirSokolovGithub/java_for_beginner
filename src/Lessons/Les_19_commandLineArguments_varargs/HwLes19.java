package Lessons.Les_19_commandLineArguments_varargs;

//программа для запуска из коммандной строки с параметрами args через пробел
public class HwLes19 {
    public static String[] abc(String[]... array1) {
        int lenght = 0;
        for (String[] array2 : array1) {
            lenght += array2.length;
        }
        String[] target = new String[lenght];
        int index = 0;
        for (String[] array2 : array1) {
            for (String s : array2) {
                target[index] = s;
                index++;
            }
        }
        return target;
    }

    public static void main(String[] args) {
        String[] target = abc(new String[]{"ok", "privet", "poka"}, new String[]{"ok", "hello", "by"});
        for (String s : args) {
            for (int i = 0; i < target.length; i++) {
                if (s.equals(target[i])) { //Ели написать наоборот то выйдет NullPointerException
                    target[i] = null;
                }
            }
        }
        for (String s : target) {
            System.out.println(s + " ");
        }
        System.out.println();
    }

}
