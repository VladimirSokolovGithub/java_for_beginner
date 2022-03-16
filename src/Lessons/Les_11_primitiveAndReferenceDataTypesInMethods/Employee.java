package Lessons.Les_11_primitiveAndReferenceDataTypesInMethods;


//Использование примитивных и ссылочных типов данных при вызове метода
//Using primitive and reference data types when calling a method
public class Employee {
    public String name;
    public double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public double increaseByTwo(double i){
        i = i * 2;
        return i;
    }

    //в данном методе изменяем саму переменную зарплата
    public double zp2(){
        salary = salary * 2;
        return salary;
    }

}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivan", 100.55);
        //а в этом методе только используем значение переменной salary в качестве параметра
        // а само первоначальное значение переменной не изменяется
        double d = emp1.increaseByTwo(emp1.salary);
        System.out.println(d);
        System.out.println(emp1.salary);

        emp1.zp2();
        System.out.println(emp1.salary);
    }
}
