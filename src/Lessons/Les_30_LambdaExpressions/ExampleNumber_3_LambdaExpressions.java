package Lessons.Les_30_LambdaExpressions;
import java.util.ArrayList;
public class ExampleNumber_3_LambdaExpressions {

}

interface StudentChecks3 {
    boolean testStudent(Student3 s);
}

class Student3 {
    String name;
    char sex;
    int age;
    int course;
    double averageGrade;

    Student3(String name, char sex, int age, int course, double averageGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.averageGrade = averageGrade;
    }
}



class StudentInfo3 {

    void printStudent(Student3 st){
        System.out.println("Имя студента: " + st.name + ", пол: " + st.sex + ", возраст: " + st.age +
                ", курс: " + st.course + ", средняя оценка: " + st.averageGrade);
    }

    void testStudents(ArrayList<Student3> al, StudentChecks3 sc){
        for (Student3 s: al){
            if (sc.testStudent(s)){
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student3> list = new ArrayList<>();
        Student3 st1 = new Student3("Иван", 'm', 22, 3, 8.3);
        Student3 st2= new Student3("Николай", 'm', 20, 2, 6.4);
        Student3 st3 = new Student3("Елена", 'f', 19, 1, 8.9);
        Student3 st4 = new Student3("Петр", 'm', 35, 4, 7);
        Student3 st5 = new Student3("Мария", 'f', 23, 3, 9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        StudentInfo3 si = new StudentInfo3();

        //Ниже возможные варианты написания Lambda Expressions

        si.testStudents(list, (Student3 st) -> {return st.averageGrade > 8.5;});
        System.out.println("_______________________________________");
        si.testStudents(list, st -> st.averageGrade < 9);
        System.out.println("_______________________________________");
        si.testStudents(list, (Student3 st) -> st.age > 25);
        System.out.println("_______________________________________");
        si.testStudents(list, st -> {return st.age < 27;});
        System.out.println("_______________________________________");
        si.testStudents(list, st -> {int z = 5; return st.sex == 'm';});
        System.out.println("_______________________________________");
        si.testStudents(list, (Student3 st) -> {return st.averageGrade > 7.2 && st.age <23 && st.sex == 'f';});
        System.out.println("_______________________________________");

    }
}