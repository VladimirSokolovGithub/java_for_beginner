package Lessons.modifiersFinalAndStatic_Les8;

//Статическими бывают и переменные и методы и основное свойство что они принадлежат всему классу в целом
// а не конкретному объекту.
//Для того чтобы вызвать переменную или метод с модификатором static не нужно создавать объект
// но теперь необходимо указывать класс например Student.count из другого класса
// или просто имя переменной или метода находясь в своём классе где эта переиенная или метод созданы


public class Student {

    String name;
    int course;
    static int count; //class variable

    //у static переменных так же есть дефолтные значения
    //если перед переменной(полем) класса стоит модификатор static, то это означает, что эта переменная
    //принадлежит не конкретному созданному абъекту, а всему классу, т.е. всем объектам которые созданы или
    // будут создаваться. Она является собственностью класса и к ней могут обращаться и изменять её любые объекты
    // этого класса, но внутри себя они не хранят эту переменную. Для этой переменной выделяется место в памяти
    // не связанное с создаваемым объектом а связанное с самим классом.

//    static final int count = 5;
    //Очень часто модификатор static используется вместе с final
    // поэтому получаются константы которые принадлежат всему классу а не конкретному объекту


    public Student(String name2, int course2){
        count++;
        name = name2;
        course = course;
        System.out.println("Student № " + count + " sozdan");
    }

    public static void showCount(){
        System.out.println("Всего создано студентов: " + count);
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 1);
        Student st2 = new Student("Petr", 4);
        Student st3 = new Student("Masha", 2);

        System.out.println(st1.name);
        System.out.println(Student.count);

        System.out.println(st2.count);//так же у объекта можно вызвать статик переменную и узнать
        // чему она равна в данный момент, но такая запись не является хорошей практикой
        System.out.println(st1.count);
        System.out.println(st3.count);

        showCount();
        st2.showCount();//хотя метод пренадлежит классу Student, а не объекту, объект так же может к нему обратиться
    }

}

class StudentTest{
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 1);
        Student st2 = new Student("Petr", 4);
        Student st3 = new Student("Masha", 2);

        System.out.println(st1.name);
        System.out.println(Student.count);

        System.out.println(st2.count);//так же у объекта можно вызвать статик переменную и узнать
        // чему она равна в данный момент, но такая запись не является хорошей практикой

        Student.showCount();
        st1.showCount();
    }

}
