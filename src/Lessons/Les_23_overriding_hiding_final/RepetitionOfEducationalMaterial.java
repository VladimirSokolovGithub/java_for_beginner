package Lessons.Les_23_overriding_hiding_final;

public class RepetitionOfEducationalMaterial {
    //какой бы объект в методе мы не возвращали мы можем вернуть null и написать return null;
    //null означает отсутствие объекта
    String abc(){
        return null;
    }

    //здесь мы можем вернуть char так как он сам конвертируется в int
    int abc2(){
        char c = 'h';
        return c;
    }

}
