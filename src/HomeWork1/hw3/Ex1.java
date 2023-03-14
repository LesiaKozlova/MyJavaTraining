package HomeWork1.hw3;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("какая программа вам интересна ?");
        String prog = input.nextLine().toUpperCase();
        System.out.println(prog);
        switch (prog) {
            case ("INTELLIJ IDEA"):
                System.out.println("Вы выбрали INTELLIJ IDEA");
                prog = "INTELLIJ IDEA";
                System.out.println(prog);
                break;
            case ("GIT"):
                System.out.println("Вы выбрали GIT");
                prog = "GIT";
                System.out.println(prog);
                break;
            case ("JAVA"):
                System.out.println("Вы выбрали JAVA");
                prog = "JAVA";
                System.out.println(prog);
                break;
            default:
                System.out.println("Извините, такой программы не существует.");

        }
        System.out.println("какая у вас ОС ?");
        String os = input.nextLine().toUpperCase();
        switch (os) {
            case ("LINUX"):
                System.out.println("Вы выбрали LINUX");
                os = "LINUX";
                System.out.println(os);
                break;
            case ("MACOS"):
                System.out.println("Вы выбрали MACOS");
                os = "MACOS";
                System.out.println(os);
                break;
            case ("WINDOWS"):
                System.out.println("Вы выбрали WINDOWS");
                os = "WINDOWS";
                System.out.println(os);
                break;
            default:
                System.out.println("Извините, такой ОС не существует.");

        }
        if (prog == "INTELLIJ IDEA" && os == "LINUX") {
            System.out.println("Ваша ссылка для скачивания 1");
        }
        if (prog == "INTELLIJ IDEA" && os == "MACOS") {
            System.out.println("Ваша ссылка для скачивания 2");
        }
        if (prog == "INTELLIJ IDEA" && os == "WINDOWS") {
            System.out.println("Ваша ссылка для скачивания 3");
        }
        if (prog == "GIT" && os == "LINUX") {
            System.out.println("Ваша ссылка для скачивания 4");
        }
        if (prog == "GIT" && os == "MACOS") {
            System.out.println("Ваша ссылка для скачивания 5");
        }
        if (prog == "GIT" && os == "WINDOWS") {
            System.out.println("Ваша ссылка для скачивания 6");
        }
        if (prog == "JAVA" && os == "LINUX") {
            System.out.println("Ваша ссылка для скачивания 7");
        }
        if (prog == "JAVA" && os == "MACOS") {
            System.out.println("Ваша ссылка для скачивания 8");
        }
        if (prog == "JAVA" && os == "WINDOWS") {
            System.out.println("Ваша ссылка для скачивания 9");
        }
    }
}











