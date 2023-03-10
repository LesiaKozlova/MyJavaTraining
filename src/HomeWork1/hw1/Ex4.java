package HomeWork1.hw1;

public class Ex4 {
    public static void main(String[] args) {
        String string = "Testing, is my favourite job";
        String word1 = string.split(" ")[0];
        String word2 = string.split(" ")[1];
        String word3 = string.split(" ")[2];
        String word4 = string.split(" ")[3];
        String word5 = string.split(" ")[4];
        System.out.println("Слово1 =  "+ word1+" Длина этого слова = "+word1.length()+".");
        System.out.println("Слово2 =  "+ word2+","+" Длина этого слова = "+word2.length()+".");
        System.out.println("Слово3 =  "+ word3+","+" Длина этого слова = "+word3.length()+".");
        System.out.println("Слово4 =  "+ word4+","+" Длина этого слова = "+word4.length()+".");
        System.out.println("Слово5 =  "+ word5+","+" Длина этого слова = "+word5.length()+".");
        boolean compareLength = word1.length()>word2.length()&&word1.length()>word3.length()
                &&word1.length()>word4.length()&&word1.length()>word5.length();
        System.out.println(compareLength);
    }
}

