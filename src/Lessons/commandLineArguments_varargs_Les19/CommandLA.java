package Lessons.commandLineArguments_varargs_Les19;

public class CommandLA {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("Nulevoy element massiva: " + args[0]);
        System.out.println("Dlina massiva: " + args.length);
    }

    //Команды для работы в коммандной строке windows
    //C:\Windows\system32>cd C:\
    //C:\Users\Dell\IdeaProjects\java for beginner\src\Lessons\commandLineArguments>set path=C:\Java\jdk-11.0.13\bin
    //cd \Users\Dell\IdeaProjects\java for beginner\src\Lessons\commandLineArguments
    //C:\Users\Dell\IdeaProjects\java for beginner\src\Lessons\commandLineArguments>javac CommandLA.java
    //C:\Users\Dell\IdeaProjects\java for beginner\src>java Lessons.commandLineArguments.CommandLA

    //Все что я напишу в коммандной строке после названия программы через пробел будут аргументами
    // массива public static void main(String[] args) в методе main

    //после компиляции и запуска class файла с аргументами через пробел после названия CommandLA
    //C:\Users\Dell\IdeaProjects\java for beginner\src>java Lessons.commandLineArguments.CommandLA ok poka privet on ona
    //Hello world
    //Nulevoy element massiva: ok
    //Dlina massiva: 5

    //00:26:37


}
