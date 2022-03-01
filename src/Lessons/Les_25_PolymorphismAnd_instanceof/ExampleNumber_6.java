package Lessons.Les_25_PolymorphismAnd_instanceof;

public class ExampleNumber_6 {
    public static void main(String[] args) {
        String[] array1 = {"hello", "goodbye"};
        Object[] array2 = array1; //любой массив является массивом типа Object
        String[] array3 = (String[]) array2;//не любой массив String[] это Object[]
//        array3[0] = new StringBuilder("ok"); //ошибка компиляции так как array3 это массив String[] и он
                                                // не может содержать объкт StringBuilder
        array2[0] = new StringBuilder("ok"); //здесь компилятор пропустит но d runtime будет Exception
    }
}
