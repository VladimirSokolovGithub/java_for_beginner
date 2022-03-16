package Lessons.Les_30_LambdaExpressions;

import java.util.ArrayList;
import java.util.function.Predicate;

public class ExampleNumber_6_Predicate {
}

class Student5 {
    String name;
    char sex;
    int age;
    int course;
    double averageGrade;

    Student5(String name, char sex, int age, int course, double averageGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.averageGrade = averageGrade;
    }
}



class StudentInfo5 {

    void printStudent(Student5 st){
        System.out.println("Имя студента: " + st.name + ", пол: " + st.sex + ", возраст: " + st.age +
                ", курс: " + st.course + ", средняя оценка: " + st.averageGrade);
    }

    //Использование интерфейса Predicate из пакета - java.util.function.*;
    void testStudents(ArrayList<Student5> al, Predicate<Student5> t){
        for (Student5 s: al){
            if (t.test(s)){
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student5> list = new ArrayList<>();
        Student5 st1 = new Student5("Иван", 'm', 22, 3, 8.3);
        Student5 st2= new Student5("Николай", 'm', 20, 2, 6.4);
        Student5 st3 = new Student5("Елена", 'f', 19, 1, 8.9);
        Student5 st4 = new Student5("Петр", 'm', 35, 4, 7);
        Student5 st5 = new Student5("Мария", 'f', 23, 3, 9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        StudentInfo5 si = new StudentInfo5();

        for (Student5 s : list){
            System.out.println(s.name);
        }
        System.out.println("________________________");

        list.removeIf(student -> student.name.endsWith("а"));

        for (Student5 s : list){
            System.out.println(s.name);
        }
    }
}