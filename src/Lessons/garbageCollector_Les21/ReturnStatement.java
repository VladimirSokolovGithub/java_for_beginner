package Lessons.garbageCollector_Les21;

public class ReturnStatement {

    int abc(){
        return  5;
    }

    int abc2(int i){
        if (i>10) {return 5;} //может быть несколько return Statement в методе, главное что бы он был последним
                                //Statement-ом код которого выполняется. И он необязательно должен стоять в самом конце метода
        else {return 10;}
    }

    //можно писать return в метод где returnType - void

    void abc3(int i2){
        if (i2 > 3){ //если i2 > 3 ничего делать не надо, надо заканчивать метод
            return;
        }
        System.out.println("Hello");
        return; // в этом ретерне в данном случае смысла нет так как после вывода в консоль метод так и так закончиться
    }


    public static void main(String[] args) {
        int a = new ReturnStatement().abc();
        new ReturnStatement().abc(); //необязательно результат метода который возвращает значение нужно
                                    // присваивать в какую то переменную
    }

}
