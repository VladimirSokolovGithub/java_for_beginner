package Lessons.Les_20_ArrayListClass;

import java.util.*;

public class MethodsArrayList2 {
    public static void main(String[] args) {

        //Методы ArrayList и связанные с ArrayList

        //1.
        // clone() -> Object //метод создаёт новый ArrayList с такими же элементами клонируемого ArrayList
                             // которые будут ссылаться на те же самые объекты что и клонируемый ArrayList

        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);
        ArrayList <StringBuilder> list3 = list1;
        ArrayList <StringBuilder> list2 = (ArrayList<StringBuilder>) list1.clone();
        System.out.println(list1 == list2);
        System.out.println(list1 == list3);
        System.out.println(list1.get(0) == list2.get(0));
        list1.get(0).append("!!!");
        System.out.println(list2.get(0));
        list1.set(0, new StringBuilder("D"));
        System.out.println(list2.get(0));
        System.out.println(list1.get(0));
        System.out.println();
        System.out.println();

        //2.
        // toArray() - Object[] // метод переводит ArrayList в массив Object[]
        // toArray(DataType [] array) - DataType [] // метод возвращает массив определенного типа указанного в параметрах

        //При работе метода создаётся новый массив, а его эллементы продолжают ссылаться
        // на те же объекты что и эллементы ArrayList. Если конечно мы не поменяем объект внутри ArrayList
        // с помомощью каких либо методов

        StringBuilder sb4 = new StringBuilder("A");
        StringBuilder sb5 = new StringBuilder("B");
        StringBuilder sb6 = new StringBuilder("C");
        ArrayList<StringBuilder> list4 = new ArrayList<>();
        list4.add(sb4);
        list4.add(sb5);
        list4.add(sb6);
        Object[] array = list4.toArray();
        for (Object o : array){
            System.out.println(o);
        }
        System.out.println();

        StringBuilder[] array2 = list4.toArray(new StringBuilder[10]);
        for (StringBuilder sb : array2){
            System.out.println(sb);
        }
        System.out.println();


        //3.
        // Arrays.asList(DataType []) -> List<DataType>
        // метод преобразует массив определенного типа в List
        // Созданный List будет той же длины что и массив, и её нельзя изменить. List полностью связан с массивом
        // если мы будем менять сам объект или изменим внутренность объекта, то у этого List-а моментально
        // отразиться то же самое.

        StringBuilder[] array3 = {sb2, sb3, sb3, sb3};
        List <StringBuilder> list = Arrays.asList(array3);
        System.out.println(list);
        array3[0].append("!!!"); //изменение элемента массива
        System.out.println(list);
        array3[2] = new StringBuilder("newObject");
        System.out.println(list);

        //4.
        // Collections.sort(ArrayList <DataType>) -> void
        // иетод сортирует ArrayList

        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";
        ArrayList<String> list5 = new ArrayList<>();
        list5.add(s3);
        list5.add(s1);
        list5.add(s4);
        list5.add(s2);
        System.out.println(list5);
        Collections.sort(list5);
        System.out.println(list5);

        //5.
        // equals(ArrayList <DataType>) -> boolean
        // метод сравнивает два объекта ArrayList на true или false
        // метод equals в ArrayList переопределен и сравнивает объекты по их внутренностям и кол-ву элементов
        // т.е если они содержат одинаковые элементы то два ArrayList-а равны, порядок элементов в ArrayList
        // так же важен.


        String s5 = "A";
        String s6 = "B";
        String s7 = "C";
        String s8 = "D";
        ArrayList<String> list6 = new ArrayList<>();
        list6.add(s6);
        list6.add(s5);
        list6.add(s8);
        list6.add(s7);
        ArrayList<String> list7 = list6;
        ArrayList<String> list8 = new ArrayList<>();
        list8.add(s6);
        list8.add(s5);
        list8.add(s8);
        list8.add(s7);

        System.out.println(list6.equals(list7));
        System.out.println(list6.equals(list8));



    }
}
