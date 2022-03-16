package Lessons.Les_20_ArrayListClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorAndListIterator {

    //Iterator And ListIterator
    public static void main(String[] args) {

        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";
        ArrayList<String> list1 = new ArrayList<>();
        list1.add(s3);
        list1.add(s1);
        list1.add(s4);
        list1.add(s2);

        Iterator <String> it = list1.iterator(); // Iterator это повторитель, с помощью этого объекта "it"
                                                 // мы сможем пробежаться по элементам list1

        //если есть последующий элемент it.hasNext, то мы входим в тело цикла и выводим следующий элемент
        // метод next(),  выдаёт этот следующий элемент
        // С помощью Iterator можно удалить элемент ArrayList, а с помощью foreach не сможем
        while (it.hasNext()){
            System.out.println(it.next());
        }

        String s5 = "A";
        String s6 = "B";
        String s7 = "C";
        String s8 = "D";
        ArrayList<String> list2 = new ArrayList<>();
        list2.add(s5);
        list2.add(s6);
        list2.add(s7);
        list2.add(s8);

        ListIterator <String> it2 = list2.listIterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }

        //Попробуем удалить элементы ArrayList

        ListIterator <String> it3 = list2.listIterator();
        while (it3.hasNext()){ //сначала проверяем есть ли элемент в ArrayList
            it3.next(); // next выдает нам этот элемент
            it3.remove(); // remove удаляет элемент
        }
        System.out.println(list2);
    }
}
