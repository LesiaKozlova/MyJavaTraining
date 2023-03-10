package HomeWork1.hw1;

public class Ex3 {
    public static void main(String[] args) {
        String string1 = "This line that i want to cut, cause it is too long";
        String string2 = string1.substring(0,35)+".";
//        System.out.println(string1.substring(0,35)+".");
        String string3 = string2.replace("i want to cut, cause.", "don't want to cut, cause it is perfect.");
        System.out.println(string1+","+" length is "+string1.length()+" characters.");
        System.out.println(string2+","+" length is "+string2.length()+" characters.");
        System.out.println(string3+","+" length is "+string3.length()+" characters."); //  В условии фраза без символа "i"
    }
}

