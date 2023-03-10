package HomeWork1.hw2;

import java.util.Date;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        System.out.println("Введите спецификатор формата для нынешнего времени. " +
                "В качестве разделителя используйте пробел.");
        Scanner input = new Scanner(System.in);
        String specFormat = input.next();
        Date date = new Date();
        String date2 = String.format(specFormat, date);
        System.out.println(date2);
    }
}
