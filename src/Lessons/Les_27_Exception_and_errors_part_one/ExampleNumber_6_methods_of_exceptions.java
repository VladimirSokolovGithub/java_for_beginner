package Lessons.Les_27_Exception_and_errors_part_one;

public class ExampleNumber_6_methods_of_exceptions {
    void abc() {

        int[] array = {4, 8, 1};
        System.out.println(array[5]);

    }

    void def() throws ArrayIndexOutOfBoundsException {
        abc();
    }

    public static void main(String[] args) {
        ExampleNumber_6_methods_of_exceptions ex1 = new ExampleNumber_6_methods_of_exceptions();
        try {
            ex1.def();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An exception was catch");
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();

        }

    }
}
