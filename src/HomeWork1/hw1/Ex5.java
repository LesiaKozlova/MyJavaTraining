package HomeWork1.hw1;

public class Ex5 {
    public static void main(String[] args) {
        String st = "Completely random text in English. In it, we just need to determine" +
                " how many times the character 'a' occurs there. " +
                "And we can use the split method and the length method.";
        String[] array = st.toLowerCase().split("a");
        System.out.println(array.length-1);
    }
}
