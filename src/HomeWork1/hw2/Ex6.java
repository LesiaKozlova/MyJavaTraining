package HomeWork1.hw2;
import java.util.Date;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        System.out.println("Уважаемый X, Вы выполняете задание номер Y, " +
                "и делаете это в Z часов W минут в V.");
        System.out.println("Введите свое имя и через пробел номер задания.");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        int taskNumber = input.nextInt();
        System.out.println("Ведите спецификаторы форматов вместо X, Y, Z, W, V.\n"+
                "где X - это имя пользователя,\n"+"Y - порядковый номер ДЗ,\n"+
                "Z - время в часах в момент выполнения программы,\n"+
                "W - время в минутах в момент выполнения программы,\n"+
                "V - день недели. Все спецификаторы форматов вводить через пробел."
        ); //%1$s %2$d %3$tH %4$tM %5$tA
        Scanner input1 = new Scanner(System.in);
        String string = input1.nextLine();
//        System.out.println(string);
        String string1 = "Уважаемый X, Вы выполняете задание номер Y, " +
                "и делаете это в Z часов W минут в V.";
        String string2 = string1.
                replace("X",string.split(" ")[0]).
                replace("Y",string.split(" ")[1]).
                replace("Z",string.split(" ")[2]).
                replace("W",string.split(" ")[3]).
                replace("V",string.split(" ")[4]);
        System.out.println(string2);
        Date date = new Date();
//        System.out.println(date);
        String string3 = String.format(string2,name,taskNumber,date,date,date);
        System.out.println(string3);
    }
}