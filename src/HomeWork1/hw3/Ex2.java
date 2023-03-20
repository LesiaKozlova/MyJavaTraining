package HomeWork1.hw3;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
/*
        2)При помощи цикла while выполнить реализацию следующего алгоритма.
        Пользователь вводит строку с клавиатуры. Программа должна вывести на
        экран сколько символов "a", присутсвует в данной строке.

*/
        Scanner in = new Scanner(System.in);
        String string = in.nextLine().toLowerCase();
        int index = string.indexOf('a');
        System.out.println(index);
        int b = 0;
        while (index!=-1) {
            String stringRest = string.substring(index+1);
            System.out.println(stringRest);
            string = stringRest;
            System.out.println(string);
            index = stringRest.indexOf('a');
            b++;
            continue;
        }

        System.out.println("В введенной ваме строке символ \"a\" встречается "+b+" раз(а).");
        }
//        int countA =0;
//        while (string.length()!=0){
//            if((string.length())==0){
//                break;
//
//            }

        }

