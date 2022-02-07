package Lessons.overloadingAndKeywordThis_Les6;

public class Test1 {

    int sum(int a, int b, int c){
        return a+b+c;
    }

    int averageArithmetic(int x, int y, int z){
        return sum(x,y,z) / 3;
    }

}
