package Lessons.Les_30_LambdaExpressions;
import java.util.ArrayList;
public class ExampleNumber_1_LambdaExpressions {

}

class Student{
    String name;
    char sex;
    int age;
    int course;
    double averageGrade;

    Student(String name, char sex, int age, int course, double averageGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.averageGrade = averageGrade;
    }
}

    class StudentInfo{

        void printStudent(Student st){
            System.out.println("Имя студента: " + st.name + ", пол: " + st.sex + ", возраст: " + st.age +
                    ", курс: " + st.course + ", средняя оценка: " + st.averageGrade);
        }

        void printStudentsOverGrade(ArrayList<Student> al, double averageGrade){
            for (Student s: al){
                if (s.averageGrade > averageGrade){
                    printStudent(s);
                }
            }
        }

        void printStudentsUnderGrade(ArrayList<Student> al, double averageGrade){
            for (Student s: al){
                if (s.averageGrade < averageGrade){
                    printStudent(s);
                }
            }
        }

        void printStudentsOverAge(ArrayList<Student> al, int age){
            for (Student s: al){
                if (s.age > age){
                    printStudent(s);
                }
            }
        }

        void printStudentsUnderAge(ArrayList<Student> al, int age){
            for (Student s: al){
                if (s.age < age){
                    printStudent(s);
                }
            }
        }

        void printStudentsBySex(ArrayList<Student> al, char sex){
            for (Student s: al){
                if (s.sex == sex){
                    printStudent(s);
                }
            }
        }

        void printStudentsMixCondition(ArrayList<Student> al, double averageGrade, int age, char sex){
            for (Student s: al){
                if (s.averageGrade > averageGrade && s.age < age && s.sex == sex){
                    printStudent(s);
                }
            }
        }

        public static void main(String[] args) {
            ArrayList<Student> list = new ArrayList<>();
            Student st1 = new Student("Иван", 'm', 22, 3, 8.3);
            Student st2= new Student("Николай", 'm', 20, 2, 6.4);
            Student st3 = new Student("Елена", 'f', 19, 1, 8.9);
            Student st4 = new Student("Петр", 'm', 35, 4, 7);
            Student st5 = new Student("Мария", 'f', 23, 3, 9.1);
            list.add(st1);
            list.add(st2);
            list.add(st3);
            list.add(st4);
            list.add(st5);

            StudentInfo si = new StudentInfo();
            si.printStudentsOverGrade(list, 8.5);
            System.out.println("-----------------------------------------------------------------------");
            si.printStudentsUnderAge(list, 9);
            System.out.println("-----------------------------------------------------------------------");
            si.printStudentsOverAge(list, 25);
            System.out.println("-----------------------------------------------------------------------");
            si.printStudentsBySex(list, 'm');
            System.out.println("-----------------------------------------------------------------------");
            si.printStudentsMixCondition(list, 7.2, 23, 'f');

        }

    }


//00-15-31
//00-25-06