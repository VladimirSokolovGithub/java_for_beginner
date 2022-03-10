package Lessons.constructorAndMethods_Les5.Hw_Les5;

public class Student {
    int studentId;
    String name;
    String surName;
    int course;
    //оценки по 10-ти бальной шкале
    double mathAverageGrade;
    double economicsAverageGrade;
    double foreignLanguageAverageGrade;

}

class StudentTest {

    double averageArithmeticGrade(Student st){
        double averageGrade = (st.mathAverageGrade + st.economicsAverageGrade + st.foreignLanguageAverageGrade) /3;
        System.out.println("Средняя арифметическая оценка студента " + st.name + " " + st.surName + ": " + averageGrade);
        return averageGrade;
    }

    public static void main(String[] args) {

        Student st1 = new Student();
        st1.studentId = 1;
        st1.name = "Nikolay";
        st1.surName = "Ivanov";
        st1.course = 3;
        st1.mathAverageGrade = 7.8;
        st1.economicsAverageGrade =9.2;
        st1.foreignLanguageAverageGrade = 8.8;

        Student st2 = new Student();
        st2.studentId = 1;
        st2.name = "Aleksey";
        st2.surName = "Petrov";
        st2.course = 1;
        st2.mathAverageGrade = 6.8;
        st2.economicsAverageGrade = 8;
        st2.foreignLanguageAverageGrade = 9.5;

        Student st3 = new Student();
        st3.studentId = 1;
        st3.name = "Anton";
        st3.surName = "Sidorov";
        st3.course = 4;
        st3.mathAverageGrade = 7.9;
        st3.economicsAverageGrade = 10;
        st3.foreignLanguageAverageGrade = 9.5;

        StudentTest sTest = new StudentTest();
        sTest.averageArithmeticGrade(st1);
        sTest.averageArithmeticGrade(st2);
        sTest.averageArithmeticGrade(st3);
    }
}


