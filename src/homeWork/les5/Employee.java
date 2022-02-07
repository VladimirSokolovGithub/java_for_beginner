package homeWork.les5;

public class Employee {

    int id;
    String surName;
    int age;
    double salary;
    String department;

    Employee(int id2, String surName2, int age2, double salary2, String department2) {
        id = id2;
        surName = surName2;
        age = age2;
        salary = salary2;
        department = department2;
    }

    double salaryIncrease() {
        salary *= 2;
        return salary;
    }
}

    class EmployeeTest{
        public static void main(String[] args) {
            Employee emp1 = new Employee(1, "Ivanov", 25, 555.55, "IT");
            Employee emp2 = new Employee(2, "Petrov", 30, 888.88, "Sales");

            emp1.salaryIncrease();
            System.out.println("Новая зарплата работника " + emp1.surName + ": " + emp1.salary);

            emp2.salaryIncrease();
            System.out.println("Новая зарплата работника " + emp2.surName + ": " + emp2.salary);
        }
    }



