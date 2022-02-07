package Lessons.primitiveAndReferenceDataTypesInMethods_Les11;

//Использование ссылочных типов данных при вызове метода
public class Student {
    public String name;
    public int course;
    public double grade;

    Student(String name, int course, double grade){
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    //С помощью копии объекта который передаётся в параметр метода мы не можем
    // изменить первоначальную ссылку на объект.
    public static void swap(Student s1, Student s2){
        Student s3 = s1;
        s1 =s2;
        s2 = s3;
        System.out.println(s1.name);
    }

    //С помощью копии ссылки на объект которая передается в параметр метода мы можем менять
    // поля(переменные) объекта
    public static void changeName(Student s1){
        s1.name = "Vasiliy";

    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 3, 9.5);
        Student st2 = new Student("Petr", 1, 5.3);
        swap(st1, st2);
        System.out.println(st1.name);
        System.out.println(st2.name);

        changeName(st2);
        System.out.println(st2.name);
    }

}
