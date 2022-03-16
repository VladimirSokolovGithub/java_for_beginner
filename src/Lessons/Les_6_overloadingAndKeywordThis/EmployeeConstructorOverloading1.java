package Lessons.Les_6_overloadingAndKeywordThis;

public class EmployeeConstructorOverloading1 {
    //Constructor overloading
    //Перегруженные конструкторы имеют разный список параметров
    //Спсок параметров может быть:
    //разный по типам данных
    //разный по количеству
    //разный по порядку
    //Access modifier может быть одинаковый и различный
    //конструкторы которые отличаются только Access modifier-ом не являются перегруженными

   public EmployeeConstructorOverloading1(int id2, String surName2, int age2){
        id = id2;
        surName = surName2;
        age = age2;
    }

    protected EmployeeConstructorOverloading1(String surName2, int age2){
        surName = surName2;
        age = age2;
    }

    EmployeeConstructorOverloading1(int id2, String surName2, int age2, double salary2, String department2){
        id = id2;
        surName = surName2;
        age = age2;
        salary = salary2;
        department = department2;
    }

    int id;
    String surName;
    int age;
    double salary;
    String department;
}

class EmployeeTest1 {
    public static void main(String[] args) {
        EmployeeConstructorOverloading1 employee1 = new EmployeeConstructorOverloading1(1, "Ivanov", 25);
        System.out.println(employee1.surName);

        EmployeeConstructorOverloading1 employee2 = new EmployeeConstructorOverloading1("Petrov", 30);
        System.out.println(employee2.surName);

        EmployeeConstructorOverloading1 employee3 = new EmployeeConstructorOverloading1(2, "Sidorov", 40, 100.35, "IT");
        System.out.println(employee3.department);
    }
}
