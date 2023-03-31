package HomeWork1.hw4;
/*4) Написать перегруженный метод, который может:
        - не принимать никаких значений, тогда он будет выводить на консоль сообщение типа:
        "Я пустой".
        - Принимать в качестве параметров  , тогда он будет выводить на консоль это сообщение.
        - Принимать в качестве параметров массив строк, тогда он будет выводить на консоль все его значения
        через пробел.
        - Принимать в качестве параметра массив чисел, тогда он будет выводить на консоль сумму элементов
        массива.
        - Принимать в качестве параметров число и строку, тогда он будет выводить на консоль сообщение типа:
        "Ваше сообщение - "%%%%%%%%", ваше число -  $",
        где "%%%%%%%%" и $ ваши введенные строка и число соответственно.*/

import java.util.Arrays;
import java.util.Scanner;

public class OverloadedMethod {

    public static void overloaded(){
        System.out.println("Я пустой");
    }
    public static void overloaded(String string){
        System.out.println(string);
    }
    public static void overloaded(String[] array){

        System.out.println(array.toString()+" ");
    }
    static int input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число");
        return input.nextInt();
    }
    static String input1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку");
        return input.nextLine();
    }

    static int[] arrayCreate() {
        int[] array = new int[input()];
        for (int i = 0; i < array.length; i++) {
            array[i] = (i * 2) + 1;
            System.out.println(array[i]);
        }
        return Arrays.stream(array).toArray();
    }

    public static void overloaded(int[] array){
        int summ =0;
        for (int x:array) {
             summ=summ+x;
        }
        System.out.println("Сумма елементов массива равна "+summ);
    }
    public static void overloaded(String string, int digit){
        System.out.println("Ваше сообщение - \"" +string+"\","+" ваше число - "+ digit+","+
               " где \""+string+"\" и "+ digit+" ваши введенные строка и число соответственно.");
    }
        public static void main(String[] args) {
        overloaded(input1(),input());
/*
        overloaded(input1());
        overloaded(arrayCreate());
        String[] arrayString = {"First","Second","Third"};
        overloaded(Arrays.toString(arrayString));
*/
        }
    }

