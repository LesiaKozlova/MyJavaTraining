package HomeWork1.hw2;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите сторону a");
        int a = input.nextInt();
        System.out.println(a);
        System.out.println("Введите сторону b");
        int b = input.nextInt();
        System.out.println(b);
        System.out.println("Введите сторону c");
        int c = input.nextInt();
        System.out.println(c);
        boolean isTriangle = (a+b)>c||(a+c)>b||(b+c)>a;
        System.out.println("Из введенных вами значений сторон \n" +
                "можно построить треугольник " +
                "и это - \""+isTriangle+"\""+".");

    }
}