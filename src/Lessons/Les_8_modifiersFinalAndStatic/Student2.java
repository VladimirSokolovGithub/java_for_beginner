package Lessons.Les_8_modifiersFinalAndStatic;

public class Student2 {
    String name;
    int course;
    static int count;
    int a;

    public Student2(String name2, int course2) {
        count++;
        name = name2;
        course = course;
        System.out.println("Student № " + count + " sozdan");
    }

    public static void showCount() {
        System.out.println("Всего создано студентов: " + count);
    }

    public void showInfo() {
        System.out.println("Welcome to the Student class!!!");
    }

    void abc() {
        a++;
        count++; //внутри не статичного метода abc(), можно исользовать статичную переменную count
        // так как она полюбому уже существует
    }

    static void abcd() {
        count++;
//        a++; //нестатичную переменную нельзя использовать в статичном методе
        //Но можно создать объект и тогда нестатичную переменную можно будет использовать у этого объекта
        Student2 st2 = new Student2("Petr", 1);
        st2.a++;
    }

    public static void main(String[] args) {
        abcd(); //статичный метод можем вызвать в мейне без создания объекта
//        abc(); //нестатичный метод не можем вызвать в мейне без создания объекта
        Student2 st3 = new Student2("Ivan", 2);
        st3.abc();
    }

}

