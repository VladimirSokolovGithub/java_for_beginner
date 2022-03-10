package Lessons.Les_27_Exception_and_errors_part_one;

public class ExampleNumber_7_Error {
    static void abc(){
        System.out.println("work the method abc()");
        abc(); //рекурсивный вызов метода
    }

    public static void main(String[] args) {
        //Error можно обработать, но не нужно этого делать
//        try {
            abc(); //будет Error так как стек переполнится
//        }
//        catch (StackOverflowError e){
//            System.out.println("Error catch");
//        }
    }
}
