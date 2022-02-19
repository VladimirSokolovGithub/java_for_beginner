package Lessons.ArrayListClass_Les20;
import java.util.ArrayList;
public class MethodsArrayList {
    public static void main(String[] args) {

        //1.
        // add(DataType element) -> boolean (autput метода это boolean и он всегда true) - метод добавляет объект в ArrayList
        // add(int index, DataType element) -> boolean

        ArrayList<String> list = new ArrayList<>();
        list.add("buy buy");
        list.add("hello");
        list.add("ok");
        list.add(1, "paste");
       // list.add(5, "ok");//сдесь выйдет IndexOutOfBoundsException: Index: 5, Size: 4
                                        // так как мы пытаемся вставить элемент в пока ещё не существующий индекс
        for (String s : list){
            System.out.print(s + " ");
        }
        System.out.println();

        //2.
        // get(int index) -> DataType - метод возвращает элемент(объект) ArrayList по его индексу

        System.out.println(list.get(3));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //3.
        // set(int index, DataType element) -> DataType - указывается index и эллемент который помещается
                                                            // на этот индекс, этот элемент заменяет собой старый,
                                                            // старый элемент удаляется

        list.set(1, "!!!");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println();


        //Изменение объектов StringBuilder при помощи ArrayList
        ArrayList<StringBuilder> list1 = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("ok");
        StringBuilder sb3 = new StringBuilder("buy buy");
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);
        for (int i = 0; i < list1.size(); i++) {
            list1.get(i).append("!!!");
        }
        for (StringBuilder sb: list1) {
            System.out.print(sb + " ");
        }
        System.out.println();
        System.out.println();

        //4.
        // remove(Object element) -> boolean //метод удаляет эллемент из Листа
        // remove(int index) -> DataType

        list1.remove(2);

        for (StringBuilder sb: list1) {
            System.out.print(sb + " ");
        }
        System.out.println();


        list1.remove(sb1);

        for (StringBuilder sb: list1) {
            System.out.print(sb + " ");
        }
        System.out.println();

        //5.
        // addAll(ArrayList aL) -> boolean // метод добавляет в конец другой ArrayList
        // addAll(int index, ArrayList aL) -> boolean //метод добавляет другой ArrayList начиная с
                                           // конкретного индекса при этом другие элементы сдвигаются вправо

        ArrayList<String> list0 = new ArrayList<>();
        list0.add("buy buy");
        list0.add("hello");
        list0.add("ok");
        list0.add(1, "paste");

        for (String s : list0){
            System.out.print(s + " ");
        }
        System.out.println();

        ArrayList<String> list4 = new ArrayList<>();
        list4.add("Petrov");
        list4.add("Sidorov");
        list0.addAll(list4);
        for (String s : list0){
            System.out.print(s + " ");
        }
        System.out.println();

        list4.set(1,"Ivanov");
        for (String s : list0){
            System.out.print(s + " ");
        }
        System.out.println();

        for (String s : list4){
            System.out.print(s + " ");
        }
        System.out.println();


        ArrayList<String> list5 = new ArrayList<>();
        list5.add("Sokolov");
        list5.add("Orlov");
        list0.addAll(1, list5);
        for (String s : list0){
            System.out.print(s + " ");
        }


        ArrayList<StringBuilder> list6 = new ArrayList<>();
        list6.add(new StringBuilder("buybuy"));
        list6.add(new StringBuilder("hello"));
        list6.add(new StringBuilder("ok"));

        for (StringBuilder s : list6){
            System.out.print(s + " ");
        }
        System.out.println();

        ArrayList<StringBuilder> list7 = new ArrayList<>();
        list7.add(new StringBuilder("Petrov"));
        list7.add(new StringBuilder ("Sidorov"));
        list6.addAll(list7);
        for (StringBuilder s : list6){
            System.out.print(s + " ");
        }
        System.out.println();

        list7.get(1).append("!!!");
        for (StringBuilder s : list6){
            System.out.print(s + " ");
        }

        //6.
        // clear() -> void //метод позволяет быстро очитить наш ArrayList

        list6.clear();
        System.out.println();
        System.out.println();
        for (StringBuilder s : list6){
            System.out.print(s + " " + "лист очищен"); //элементы не выведутся
        }
        System.out.println();
        System.out.println();

        //7.
        // indexOf(Object element) -> int // метод возвращает индекс самого первого обноруженного элемента element
                                            // даже если есть дальше и другие такие элементы, если объект не найден то -1


        ArrayList<String> list8 = new ArrayList<>();
        list8.add("Sokolov");
        list8.add("hello");
        list8.add("ok");
        list8.add("Orlov");
        list8.add("hello");
        for (String s : list8){
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(list8.indexOf("hello"));
        System.out.println(list8.indexOf(new String("ok")));


        //8.
        // lastIndexOf(Object element) -> int //метод возвращает индекс самого последнего обноруженного элемента
        //                                    // element даже если перед ним есть и другие такие элементы, если объект не найден то -1

        System.out.println(list8.lastIndexOf("hello"));

        //9.
        // size() -> int // метод возвращает размер ArrayList

        System.out.println(list8.size());


        //10.
        // isEmpty() -> boolean // метод проверяет пустой ли ArrayList, возвращает false если лист не пустой
                                // и true если пустой

        System.out.println(list8.isEmpty());

        //11.
        // contains(Object element) -> boolean //

        System.out.println(list8.contains("hello"));

        //12.
        // toString() -> String

        System.out.println(list8.toString());


    }
}
