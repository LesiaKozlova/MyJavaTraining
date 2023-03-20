package HomeWork1.hw3;

import java.util.Scanner;

public class Ex_111 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("какая программа вам интересна ?");
        String prog = input.nextLine().toUpperCase();
        System.out.println(prog);
        System.out.println("какая OS вам интересна ?");
        String os = input.nextLine().toUpperCase();
        System.out.println(os);
        System.out.println(prog);
        switch (prog) {
            case ("INTELLIJ IDEA"):
                if (os.equals("LINUX")) {
                    System.out.println("link1");
                } else if (os.equals("MACOS")) {
                    System.out.println("link2");//
                } else if (os.equals("Windows")){
                    System.out.println("link3");
                } else {
                    System.out.println("Извините, такой OC не существует.");
                }
                break;
            case ("GIT"):
                if (os.equals("LINUX")) {
                    System.out.println("link4");
                } else if (os.equals("MACOS")) {
                    System.out.println("link5");//
                } else if (os.equals("Windows")){
                    System.out.println("link6");
                } else {
                    System.out.println("Извините, такой OC не существует.");
                }
                break;
            case ("JAVA"):
                if (os.equals("LINUX")) {
                    System.out.println("link7");
                } else if (os.equals("MACOS")) {
                    System.out.println("link8");
                } else if (os.equals("Windows")){
                    System.out.println("link9");
                } else {
                    System.out.println("Извините, такой OC не существует.");
                }
                break;
            default:
                System.out.println("Извините, такой программы не существует.");
            }
        }
    }

