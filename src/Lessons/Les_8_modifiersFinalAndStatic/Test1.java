package Lessons.Les_8_modifiersFinalAndStatic;

public class Test1 {

    //public final int a = 10;
    public final int a; //instance переменная

    //final variable должны быть инициализированы до их использования
    //Значение final переменной меняться не может, только для чтения
    //Так же access modifier и non access modifier могут меняться местами может быть так:
    // public final int a = 10;
    // а может и так
    // final public int a = 10;
    // но принято сначала access modifier - public потом non access modifier - final
    //Так же у final переменных нет дефолтного значения и их обязательно нужно инициализировать
    //константы должны инициализироваться либо при объявлении либо в конструкторе если есть
    //перегруженные конструкторы, то в каждом конструкторе, причем значения могут быть
    // разные в каждом конструкторе (если переменная не static)

    Test1() {
        a = 10;
    }

    Test1(boolean b) {
        a = 15;
    }

    public void abc(final short s){ //final modifier так же может использоваться в качестве параметра и в дальнейшем в методе мы его изменить не сможем
        final byte b; //local variable
        b = 10; //в методе final переменную можно проинициализировать позже,
                // а instance переменная должна инициализироваться сразу
        System.out.println(s + b);
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        //t.a = t.a * 2;
        System.out.println(t.a);
    }

}
