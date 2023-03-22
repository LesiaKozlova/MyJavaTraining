package HomeWork1.hw4;

public class Sum {
/*
    Написать метод, принимающий в качестве параметров два числа,
    который будет выводить на консоль сумму этих двух чисел.
    Написать второй метод, который будет возвращать сумму двух чисел,
    которые он будет принимать в параметре метода.
    Вывести на консоль сумму двух любых чисел при помощи первого и второго метода.
*/
    public static int getSum ( int first, int second){
        return first + second;
    }
    public static void getSum2 ( int first, int second){

        System.out.println(first + second);
    }
    public static void main(String[] args) {
        System.out.println(getSum(2,3));
        getSum2(4,5);
    }

}
