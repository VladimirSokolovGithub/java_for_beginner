package Lessons.Les_30_LambdaExpressions;

import java.util.ArrayList;
import java.util.function.Predicate;

public class HomeWorkLes_30 {
}

class Employee{
    String name;
    String department;
    int salary;

    public Employee(String name, String department, int salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class TestEmployee{
    void printEmployee(Employee employee){
        System.out.println("Имя работника: " + employee.name + ", Отдел: " + employee.department +
                ", Зарплата работника: " + employee.salary);
    }

    void filteringOfEmployees(ArrayList<Employee> al, Predicate<Employee> t){
        for (Employee emp : al) {
            if (t.test(emp)){
                printEmployee(emp);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee("Ivan", "IT", 200);
        Employee emp2 = new Employee("Irina", "IT", 250);
        Employee emp3 = new Employee("Egor", "HR", 440);
        Employee emp4 = new Employee("IT", "IT", 500);
        Employee emp5 = new Employee("Valera", "Economic", 260);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);

        TestEmployee te = new TestEmployee();
        te.filteringOfEmployees(list, emp -> emp.department.equals("IT") && emp.salary > 200);
        System.out.println("_________________________");
        te.filteringOfEmployees(list, emp -> emp.name.startsWith("E") && emp.salary != 450);
        System.out.println("_________________________");
        te.filteringOfEmployees(list, emp -> emp.name.equals(emp.department));
    }
}



