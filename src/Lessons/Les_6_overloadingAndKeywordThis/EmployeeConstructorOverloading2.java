package Lessons.Les_6_overloadingAndKeywordThis;

public class EmployeeConstructorOverloading2 {
//вызов конструктора внутри конструктора с помощью ключевого слова "this"

    //Используйте "this" на первой строке в теле конструктора для вызова overloaded
    //конструктора внутри конструктора

    //1-й способ сработает вызов всех конструкторов и принцип стека LIFO
    /*
    EmployeeConstructorOverloading2(int id2, String surName2, int age2){

        this(surName2, age2);
        id = id2;

    }

    EmployeeConstructorOverloading2(String surName3, int age3){
        surName = surName3;
        age = age3;
    }

    EmployeeConstructorOverloading2(int id4, String surName4, int age4, double salary4, String department4){
        this(id4, surName4, age4);//вызов другого перегруженного конструктора для сокращения кода
        salary = salary4;
        department = department4;
    }
    */

    //2- способ более корректный при вызове другого перегруженного конструктора
    EmployeeConstructorOverloading2(int id2, String surName2, int age2){
        this(id2, surName2, age2, 0.0, null);
    }

    EmployeeConstructorOverloading2(String surName3, int age3){
        this(0, surName3, age3, 0.0, null);
    }

    EmployeeConstructorOverloading2(int id4, String surName4, int age4, double salary4, String department4){
        id = id4;
        surName = surName4;
        age = age4;
        salary = salary4;
        department = department4;
    }
    int id;
    String surName;
    int age;
    double salary;
    String department;
}

class EmployeeTest2 {
    public static void main(String[] args) {
        EmployeeConstructorOverloading1 employee1 = new EmployeeConstructorOverloading1(1, "Ivanov", 25);
        System.out.println(employee1.surName);

        EmployeeConstructorOverloading1 employee2 = new EmployeeConstructorOverloading1("Petrov", 30);
        System.out.println(employee2.surName);

        EmployeeConstructorOverloading1 employee3 = new EmployeeConstructorOverloading1(2, "Sidorov", 40, 100.35, "IT");
        System.out.println(employee3.department);
    }
}
