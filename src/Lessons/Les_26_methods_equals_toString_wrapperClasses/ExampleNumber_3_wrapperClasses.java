package Lessons.Les_26_methods_equals_toString_wrapperClasses;

import java.util.ArrayList;

public class ExampleNumber_3_wrapperClasses {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(5); //autoboxing
        Long l = 50L;//autoboxing

        int a = list.get(0);//unboxing
        System.out.println(a);
        Integer b = new Integer(10);
        Integer d = Integer.valueOf(10);
        int c = b;//unboxing
        int f = d;

        //Класс Number это родитель числовых Wrapper классов
        Number g = new Integer(10);
        int h = (Integer) g;
        //or
        int i = (int) g;

        String s1 = "50";
        int i1 = Integer.parseInt(s1);
        System.out.println(i1);

        // с пробелом применить метод parse и преобразовать строку в число не получиться,
        // получим NumberFormatException
//        String s2 = " 50";
//        int i2 = Integer.parseInt(s2);
//        System.out.println(i2);

        String s3 = "true";
        boolean b1 = Boolean.parseBoolean(s3);
        System.out.println(b1);

        String s4 = "3.14";
        double doub1 = Double.parseDouble(s4);
        System.out.println(doub1);

        Integer i3 = Integer.valueOf(10);
        System.out.println(i3);

        Double doub2 = Double.valueOf(s4);
        System.out.println(doub2);

        Byte b10 = new Byte((byte) 5);
        Byte b11 = Byte.valueOf((byte) 5);

    }

}


