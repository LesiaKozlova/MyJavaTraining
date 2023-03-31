package HomeWork1.hw5;

public class Computer_Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Slon",20000,450,599);
        String cardModel = computer.getCarModel();
        System.out.println(cardModel);
        System.out.println(computer.getCarModel());
        computer.getAllInfo();

    }

}
