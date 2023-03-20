package HomeWork1.hw3;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String  word = "";
         System.out.println(word);
        //boolean t = word.contains("STOP");
                while (!word.contains("STOP")) {
                    System.out.println("Ведите слово");
                    word += input.nextLine();
                    //word = word.concat(input.nextLine());
                    System.out.println(word.replace("STOP",""));
                    continue;
                }
        }
    }