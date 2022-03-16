package Lessons.Les_30_LambdaExpressions;

import java.util.ArrayList;

public class ExampleNumber_2_LambdaExpressions {

}

interface StudentChecks{
    boolean testStudent(Student2 s);
}

class FindStudentsOverGrade implements StudentChecks {

    @Override
    public boolean testStudent(Student2 s) {
        return s.averageGrade > 8.5;
    }
}

class FindStudentsUnderGrade implements StudentChecks {

    @Override
    public boolean testStudent(Student2 s) {
        return s.averageGrade < 9;
    }
}

class FindStudentsOverAge implements StudentChecks {

    @Override
    public boolean testStudent(Student2 s) {
        return s.age > 25;
    }
}

class FindStudentsUnderAge implements StudentChecks {

    @Override
    public boolean testStudent(Student2 s) {
        return s.age < 27;
    }
}

class FindStudentsBySex implements StudentChecks {

    @Override
    public boolean testStudent(Student2 s) {
        return s.sex == 'm';
    }
}

class FindStudentsMixCondition implements StudentChecks {

    @Override
    public boolean testStudent(Student2 s) {
        return (s.averageGrade > 7.2 && s.age < 23 && s.sex == 'f');
    }
}

class Student2 {
    String name;
    char sex;
    int age;
    int course;
    double averageGrade;

    Student2(String name, char sex, int age, int course, double averageGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.averageGrade = averageGrade;
    }
}



class StudentInfo2 {

    void printStudent(Student2 st){
        System.out.println("Имя студента: " + st.name + ", пол: " + st.sex + ", возраст: " + st.age +
                ", курс: " + st.course + ", средняя оценка: " + st.averageGrade);
    }

    void testStudents(ArrayList<Student2> al, StudentChecks sc){
        for (Student2 s: al){
            if (sc.testStudent(s)){
                printStudent(s);
            }
        }
    }



    public static void main(String[] args) {
        ArrayList<Student2> list = new ArrayList<>();
        Student2 st1 = new Student2("Иван", 'm', 22, 3, 8.3);
        Student2 st2= new Student2("Николай", 'm', 20, 2, 6.4);
        Student2 st3 = new Student2("Елена", 'f', 19, 1, 8.9);
        Student2 st4 = new Student2("Петр", 'm', 35, 4, 7);
        Student2 st5 = new Student2("Мария", 'f', 23, 3, 9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        StudentInfo2 si = new StudentInfo2();

        FindStudentsOverGrade fsog = new FindStudentsOverGrade();
        FindStudentsUnderGrade fsug = new FindStudentsUnderGrade();
        FindStudentsOverAge fsoa = new FindStudentsOverAge();
        FindStudentsUnderAge fsua = new FindStudentsUnderAge();
        FindStudentsBySex fsbs = new FindStudentsBySex();
        FindStudentsMixCondition fsmc = new FindStudentsMixCondition();

        si.testStudents(list,fsog);
        System.out.println("_______________________________________");
        si.testStudents(list,fsug);
        System.out.println("_______________________________________");
        si.testStudents(list,fsoa);
        System.out.println("_______________________________________");
        si.testStudents(list,fsua);
        System.out.println("_______________________________________");
        si.testStudents(list,fsbs);
        System.out.println("_______________________________________");
        si.testStudents(list,fsmc);
        System.out.println("_______________________________________");


    }

}

//00-40-23