package homeWork.les5;

public class BankAccount {

    int id = 10;
    String name = "Petr";
    double balance = 100;

    void popolnenieScheta(double summaPopolneniya) {
        System.out.println("Баланс до пополнения: " + balance);
        System.out.println("Баланс пополняется на: " + summaPopolneniya);
        balance += summaPopolneniya;
        System.out.println("Баланс после пополнения:" + balance);
        System.out.println();
    }

    void snyatieSoScheta(double summaSnyatiya) {
        System.out.println("Баланс до снятия: " + balance);
        System.out.println("Баланс уменьшается на: " + summaSnyatiya);
        balance -= summaSnyatiya;
        System.out.println("Баланс после снятия: " + balance);
        System.out.println();
    }

}
