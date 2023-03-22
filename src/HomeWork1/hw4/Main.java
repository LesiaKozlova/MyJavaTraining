package HomeWork1.hw4;

public class Main {
    public static void main(String[] args) {
        WorkBook work1= new WorkBook();
        System.out.println(work1.getCalorOfWorkbook());
        work1.calorOfWorkbook="red";
        System.out.println(work1.getCalorOfWorkbook());
        work1.setCalorOfWorkbook("yellow");
        System.out.println(work1.getCalorOfWorkbook());

    }
}
