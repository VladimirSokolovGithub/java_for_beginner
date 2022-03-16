package Lessons.Les_30_LambdaExpressions;
import java.util.ArrayList;
import java.util.function.*;
public class ExampleNumber_5_Predicate {

}



class Student4 {
    String name;
    char sex;
    int age;
    int course;
    double averageGrade;

    Student4(String name, char sex, int age, int course, double averageGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.averageGrade = averageGrade;
    }
}



class StudentInfo4 {

    void printStudent(Student4 st){
        System.out.println("Имя студента: " + st.name + ", пол: " + st.sex + ", возраст: " + st.age +
                ", курс: " + st.course + ", средняя оценка: " + st.averageGrade);
    }

    //Использование интерфейса Predicate из пакета - java.util.function.*;
    void testStudents(ArrayList<Student4> al, Predicate<Student4> t){
        for (Student4 s: al){
            if (t.test(s)){
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student4> list = new ArrayList<>();
        Student4 st1 = new Student4("Иван", 'm', 22, 3, 8.3);
        Student4 st2= new Student4("Николай", 'm', 20, 2, 6.4);
        Student4 st3 = new Student4("Елена", 'f', 19, 1, 8.9);
        Student4 st4 = new Student4("Петр", 'm', 35, 4, 7);
        Student4 st5 = new Student4("Мария", 'f', 23, 3, 9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        StudentInfo4 si = new StudentInfo4();

        //Ниже возможные варианты написания Lambda Expressions

        si.testStudents(list, (Student4 st) -> {return st.averageGrade > 8.5;});
        System.out.println("_______________________________________");
        si.testStudents(list, st -> st.averageGrade < 9);
        System.out.println("_______________________________________");
        si.testStudents(list, (Student4 st) -> st.age > 25);
        System.out.println("_______________________________________");
        si.testStudents(list, st -> {return st.age < 27;});
        System.out.println("_______________________________________");
        si.testStudents(list, st -> {int z = 5; return st.sex == 'm';});
        System.out.println("_______________________________________");
        si.testStudents(list, (Student4 st) -> {return st.averageGrade > 7.2 && st.age <23 && st.sex == 'f';});
        System.out.println("_______________________________________");

    }
}