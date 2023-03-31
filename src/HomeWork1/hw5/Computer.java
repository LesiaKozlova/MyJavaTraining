package HomeWork1.hw5;

/*1) Создать класс Computer c конструктором принимающим параметры
        Марка тип String, цена тип int, оперативная память тип int,
        и видеокарта тип int.
        Конструктор также выводит на консоль сообщение типа:
        "Создан PC.
        Имя = марка.
        Цена = цена.
        Видеокарта = объем видеокарты
        ОЗУ = Объем оперативной памяти."

        Все поля класса Computer должны быть приватными.
        Также создайте публичные методы для получения информации о полях класса Computer.
        А также методы для изменения его полей.

        Создайте один метод для получения всей информации о объекте класса Computer.

        В отдельном классе создайте объект класса компьютер, и выведите на экран его поля при использовании
        одного созданного выше метода класса.*/
public class Computer {
/*
    public String name;
    public int price;
    public int ram;
    public int video;
*/
    private String carModel;
    private int price;
    private int ram;
    private int video;

    public Computer(String carModel,int price, int ram, int video){
        this.carModel = carModel;
        this.price = price;
        this.ram = ram;
        this.video = video;
        System.out.println(
                "Создан PC.\n"+"      Имя = "+carModel+".\n"+"      Цена = "+price+".\n"+"      Видеокарта = "+ram+".\n"
                        +"      ОЗУ = "+video+"."
        );

    }

    public String getCarModel() {
        return carModel;
    }

    public int getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

    public int getVideo() {
        return video;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setVideo(int video) {
        this.video = video;
    }
    public void getAllInfo(){
        System.out.println("Создан PC.\n"+"      Имя = "+getCarModel()+".\n"
                +"      Цена = "+getPrice()+".\n"+"      Видеокарта = "+getRam()+".\n"
                +"      ОЗУ = "+getVideo()+"." );
    }
}
