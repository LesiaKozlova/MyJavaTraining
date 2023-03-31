package HomeWork1;

public class Main1 {
    public static void main(String[] args) {
        Student ivan = new Student();
        //Student ivan = new Student("Вася",33,true,"AQA");
        //System.out.println(ivan.getAge()+" "+ivan.getName());

        //System.out.println(ivan.getName());
        //System.out.println(ivan.getAge()+" "+ivan.getName());
        ivan.getInfo();
        Student x = new Student();
        x.getInfo();
        Student alona = new Student("Alona","Developer",32,false);
        alona.getInfo();

    }
}
