package HomeWork1.hw4;

import java.util.Arrays;

public class ArraySort {
    public void listArray(int[] array){
        System.out.println("Список четных чисел: ");
        for (int x:array){
            if(x%2==0){
                System.out.println(x+" ");
            }
        }
        System.out.println("Список НЕчетных чисел: ");
        for (int x:array){
            if(x%2!=0){
                System.out.println(x);
            }
        }
    }
}
