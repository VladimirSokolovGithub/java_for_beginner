package Lessons.overloadingAndKeywordThis_Les6;

public class MethodOverloading2 {

    //Тип возвращаемого значения в перегруженных методах может быть одинаковый или различный
    //Модификатор доступа может быть одинаковый и различный

    public int sum(int i1, int i2){
        return i1 + i2;
    }

    protected String sum(String s1, String s2){
        return s1 + s2;
    }
}

class MethodOverloading2Test {
    public static void main(String[] args) {
        MethodOverloading2  mo2 = new MethodOverloading2();
        int a = mo2.sum(5, 7);
        System.out.println(a);

        String s = mo2.sum("Privet, ", "moy drug");
        System.out.println(s);
    }
}

//time stop 00:42:32