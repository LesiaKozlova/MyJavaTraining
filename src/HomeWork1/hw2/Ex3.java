package HomeWork1.hw2;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите свой год рождения");
//        int year = input.nextInt();
//        System.out.println(year);
//        String year = input.nextLine();
        int age = 2023-Integer.parseInt(input.nextLine());
        System.out.println(age);
    }
}