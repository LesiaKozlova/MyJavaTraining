package HomeWork1.hw5;

import java.util.Scanner;

public class Calculator {

    public void summ(double a, double b) {
        double summResult = a + b;
        System.out.println(summResult);
    }

    public void minus(double a, double b) {
        double minusResult = a - b;
        System.out.println(minusResult);
    }
    public void multiply(double a,double b) {
        double multiplyResult = a*b;
        System.out.println(multiplyResult);
    }
    public void division(double a,double b) {
        double divisionResult = a/b;
        System.out.println(divisionResult);
    }

    public void start(){
        System.out.println("Калькулятор запущен");
        System.out.println("Введите действие");
        Scanner input = new Scanner(System.in);
        String action = input.nextLine();
        System.out.println(action);
             if(action.equals("Stop")==false) {
                 if (action.equals("+")) {
                     summ(2, 4);
                 } else if (action.equals("-")) {
                     minus(5, 6);
                 } else if (action.equals("*")) {
                     multiply(25, 3);
                 } else if (action.equals("/")) {
                     division(34, 3);
                 } else {
                     System.out.println("Введите корректное действие.");
                 }
                 start();
             } else if(action.equals("Stop")==true)  {
                 System.out.println("Калькулятор закрыт");
             }
    }
}
/*
    static void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число");
        recurs(input.nextInt());
    }

    static void recurs(int number) {
        System.out.print((number % 10) + "" + (number % 10) + " ");
        if (number / 10 == 0) {

        } else {
            number = number / 10;
            recurs(number);
        }
    }
    public static void main(String[] args) {
        input();
    }
}*/
