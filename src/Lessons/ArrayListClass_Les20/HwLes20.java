package Lessons.ArrayListClass_Les20;

import java.util.ArrayList;
import java.util.Collections;

public class HwLes20 {

    public ArrayList<String> abc(String ... s){
        ArrayList <String> aL = new ArrayList<>();
        for (String s1 : s){
            if (!aL.contains(s1)){
                aL.add(s1);
            }
        }
        Collections.sort(aL);
        System.out.println(aL);
        return aL;
    }

    public static void main(String[] args) {
        HwLes20 les20 = new HwLes20();
        les20.abc("privet", "ok", "poka", "ok", "hello", "how are you", "poka");
    }

}
