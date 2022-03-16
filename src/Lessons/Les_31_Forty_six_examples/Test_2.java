package Lessons.Les_31_Forty_six_examples;

public class Test_2 {
}

class A1{

    public static void main(String[] args) {
        A1 a1 = new A1();
    }

    static String abc(String str){
        System.out.println(str);
        return str;
    }

    public A1(){
        str1 = abc("String1");
    }
    static String str1 = abc("String2");
    String str3 = abc("String3");
    {
        str1 = abc("String4");
    }
    static {
        str1 = abc("String5");
    }
    static String str2 = abc("String6");
    String str4 = abc("String7");
}

//00-14-24