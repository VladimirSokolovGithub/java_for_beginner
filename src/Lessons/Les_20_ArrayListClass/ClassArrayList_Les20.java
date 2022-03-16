package Lessons.Les_20_ArrayListClass;
import java.util.ArrayList;
import java.util.List;
public class ClassArrayList_Les20 {

    //Синтаксис ArrayList

    //нельзя создать ArrayList примитивных типов данных - только wrapper class-ы

    //ArrayList<DataType> list1 = new ArrayList<DataType>();
    //или то же самое без <DataType> в конце

    //ArrayList<DataType> list1 = new ArrayList<>();
    //по умолчанию с конструктором без параметров capacity массива в ArrayList - 10 эллементов

    //ArrayList<DataType> list1 = new ArrayList<>(30); При использовании этого конструктора создаться
    // ArrayList с capacity 30 элементов

    //ArrayList<DataType> list1 = new ArrayList<>(list3); Ещё один конструктор когда в параметр передаём другой
    // ArrayList, будет создан такой же list3, но переменные list1 и list3 будут ссылаться на разные объекты



    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("privet");
        Car c = new Car();
        list.add(c);
        Student s = new Student();
        list.add(s);
        list.add(new StringBuilder("ok"));
        //таким образом я добавил в ArrayList 4 объекта с разными типами данных
        //так уже никогда не делают и все работают с ArrayList-ом определенного типа данных

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Hello");

        //следующие две записи так же корректны
        ArrayList<StringBuilder> list3 = new ArrayList<>(30);
        List<StringBuilder> list4 = new ArrayList<>();
        list4.add(new StringBuilder("hello"));

        //Ещё один конструктор когда в параметр передаём другой ArrayList, будет создан такой же list5, но
        //переменные list1 и list5 будут ссылаться на разные объекты
        ArrayList<String> list1 = new ArrayList<>(30);
        ArrayList<String> list5 = new ArrayList<>(list1);
        System.out.println(list2==list5);//false


    }

}

class Car{}
class Student{}