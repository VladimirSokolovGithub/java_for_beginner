package Lessons.Les_28_Exception_and_errors_part_two;

public class ExampleNumber_10 {
    public static void main(String[] args) {
        Doctor d = new Doctor();
        Teacher t = new Teacher();
        Employee[] array1 = {d,t};
//        Teacher t2 = (Teacher)array1[0]; //ClassCastException
        createPassword("qwerty");
        createPassword("qwertyqwertyq");

    }
    public static void createPassword(String password){
        if (password.length() < 6){
            throw new IllegalArgumentException("Длина пароля слишком маленькая");
        }
        if (password.length() > 12){
            throw new IllegalArgumentException("Длина пароля слишком большая");
        }
        System.out.println("Пароль принят");
    }


}



class Employee{}
class Doctor extends Employee{}
class Teacher extends Employee{}

class Airplane{
    String status = "в ожидании"; //будет три состояния - В ожидании, в воздухе, полёт отменён
    public void fly(){
        status = "в воздухе";
        System.out.println("Самолёт летит");
    }
    public void waiting(){
        if (status.equals("в воздухе")){
            throw new IllegalStateException("Самолёт уже в воздухе");
        }
        status = "в ожидании";
        System.out.println("Самолёт в ожидании полёта");
    }
    public void cancelFlight(){
        if (status.equals("в воздухе")){
            throw new IllegalStateException("Самолёт уже в воздухе");
        }
        status = "полёт отменён";
        System.out.println("Полёт самолёта отменён");
    }

    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        airplane.waiting();
        airplane.fly();
        airplane.cancelFlight();
    }
}