package Lessons.Les_16_String;

public class StringMethods {
    //Методы String
    public static void main(String[] args) {
        String s1 = new String("Hello");

        // 1. length() -> int - параметры не принимает и возвращает int
        int a = s1.length(); //выдает длину объекта s1
        System.out.println(a);
        System.out.println(s1.length());

        // 2. charAt(int index) -> char - принимает параметр int index и возвращает char соотвтетствующий этому индексу
        char с1 = s1.charAt(3);
        System.out.println(с1);


        // 3. indexOf - метод вернёт int индекс на каком находится определённый char или String:
        //indexOf(char c) -> int
        //indexOf(String s) -> int
        //indexOf(char c, int fromIndex) -> int
        //indexOf(String s, int fromIndex) -> int

        int i1 = s1.indexOf('o');
        System.out.println(i1);

        int i2 = s1.indexOf("o");
        System.out.println(i2);

        int i3 = s1.indexOf("llo");//на каком индексе начинается "llo"
        System.out.println(i3);

        int i4 = s1.indexOf("Z");//если такого символа в строке нет то выводится -1
        System.out.println(i4);

        String s2 = new String("abcdefgabcd");

        int i5 = s2.indexOf("a", 5); //начинаяс с пятого индекса ищем на каком индексе находится "a"
        System.out.println(i5);

        int i6 = s2.indexOf('a', 5); //начинаяс с пятого индекса ищем на каком индексе находится "a"
        System.out.println(i6);


        // 4. startsWith - метод задаёт вопрос начинается ли строка с определенного символа или символов
        // startsWith(String prefix) -> boolean
        // startsWith(String prefix, int from) -> boolean

        boolean b1 = s2.startsWith("abc"); //задаётся вопрос String s2 начинается с "abc"? true or false
        System.out.println(b1);

        boolean b2 = s2.startsWith("abc", 7); //задаётся вопрос String s2 начиная с 7-го символа начинается с "abc"? true or false
        System.out.println(b2);

        // 5. endsWith(String suffix) -> boolean - заканчивается ли метод определенными символами true or false

        boolean b3 = s2.endsWith("abc");
        System.out.println(b3);

        // 6. substring - метод возвращает подстроку
        // substring(int beginIndex) -> String - возвращает подстроку с определенного индекса
        // substring(int beginIndex, int endIndex) -> String - возвращает подстроку с определенного индекса включительно
                                                    // до определенного индекса не включительно

        String s3 = new String("abcdefgabcd");
        String s10 = s3.substring(3); //присвой объекту s10 кусок строки начиная с символа с индексом 3
        System.out.println(s10);

        String s11 = s3.substring(3, 7); //присвой объекту s11 кусок строки начиная
                                         // с 3-го символа включительно по 7-й не включительно
        System.out.println(s11);
        String s111 = s3.substring(3, 11);//одинадцатого элемента на существует но чтобы вывести последний символ включительно мы должны указать на один больше
        System.out.println(s111);

        // 7. trim() -> String - убирает все пробелы с обеих боков строки (внутри строки пробелы не убираются)
        String s4 = new String("      abcdef  gabcd           ");
        String s12 = s4.trim();
        System.out.println(s12);

        // 8. replace - метод замены символов
        // replace(char oldChar, char newChar) -> String
        // replace(String oldString, String newString) -> String

        String s5 = new String("privet");
        String s13 = s5.replace('r', 'Z');
        System.out.println(s13);

        String s14 = s5.replace('o', 'Z'); //усли такого символа нет в слове 'o', то ничего не измениться
        System.out.println(s14);

        String s15 = s5.replace("vet", "vivka"); //усли такого символа нет в слове 'o', то ничего не измениться
        System.out.println(s15);


        // 9. concat(String str) -> String
        String s16 = "privet,";
        String s17 = "drug";
        System.out.println(s16.concat(s17));
        System.out.println(s16+s17);

        // 10. toLowerCase() -> String - возвращает новый string в нижнем регистре
        String s18 = "PrIvEt";
        String s19 = s18.toLowerCase();
        System.out.println(s19);

        // 11. toUpperCase() -> String - возвращает новый string в верхнем регистре
        String s20 = s18.toUpperCase();
        System.out.println(s20);

        // 11. contains(String str) -> boolean
        boolean b5 = s18.contains("PrI");
        System.out.println(b5);

        // 12. При цепочке методов (method chaining), методы выполняются слева на право
        String st1 = "Hello World";
        String st2 = "Urrraaaaaaaaa!!!";
        String st3 = st1.concat(st2).trim().replace("Urrraaaaaaaaa", "УРА").substring(6, 10);
        System.out.println(st3);
        System.out.println(st1.substring(st1.indexOf('W')));

        // 13. Определение равенства String
        // method equals and equalsIgnoreCase
        String str1 = new String("ok");
        String str2 = new String("ok");
        System.out.println(str1 == str2); //false
        System.out.println(str1.equals(str2)); //true - так как в String метод equals переопределен
        String str3 = "Hi";
        String str4 = "Hi";
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));

        String str5 = "How are you";
        String str6 = "how are you";
        System.out.println(str5.equals(str6));
        System.out.println(str5.equalsIgnoreCase(str6));




    }

}
