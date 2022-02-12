package Lessons.stringBuilder_les17;

public class HwLes17 {
//метод проверяющий равенство двух объектов StringBuilder
    public static boolean equality(StringBuilder sb1, StringBuilder sb2){
        boolean result = true;
        if(sb1.length() == sb2.length()){
            for (int i = 0; i < sb1.length(); i++) {
                if(sb1.charAt(i) != sb2.charAt(i)){
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }
}

class HwLes17Main {
    public static void main(String[] args) {
        StringBuilder sb3 = new StringBuilder("hello");
        StringBuilder sb4 = new StringBuilder("hello");
        StringBuilder sb5 = new StringBuilder("Hello");
        boolean a = HwLes17.equality(sb3, sb4);
        System.out.println(a);
        System.out.println(HwLes17.equality(sb4, sb5));
        System.out.println(HwLes17.equality(new StringBuilder(""), new StringBuilder("")));
        System.out.println(HwLes17.equality(new StringBuilder(), new StringBuilder()));
    }
}
