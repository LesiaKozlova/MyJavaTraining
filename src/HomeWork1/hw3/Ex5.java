package HomeWork1.hw3;

import java.util.Scanner;
/*
5)Написать программу в которой пользователь вводит с клавиатуры число,
        а программа определяет, является она полиндромом или нет.
        И выводит данную информацию на экран.*/
public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n =0;
        System.out.println("Введите число:");
        String s1 = input.nextLine();
        String s2="";
        int length = s1.length();
        System.out.println(length);
        while ((length-n)>=1) {
            s2+= s1.charAt(length-n-1);
            n++;
            // System.out.println(s2);
            continue;
        }
        if (s1.equals(s2)) {
            System.out.println("Это число является палиндромом.");
        }
        else
            System.out.println("Это число НЕ является палиндромом.");
    }
}

