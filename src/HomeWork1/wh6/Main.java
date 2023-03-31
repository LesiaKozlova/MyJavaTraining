package HomeWork1.wh6;

public class Main {
    public static void main(String[] args) {
        Market market = new Market("Товары для дома");
        market.dealDetail(new Seller("Тамара Петровна", true),
                            new Customer("Петя",true,16),
                                new Article("Вино сухое красное",true, 200, 1));
        Market market1 = new Market("Товары для дома");
        market1.dealDetail(new Seller("Рима Викторовна",false),
                            new Customer("Ярослав",true,16),
                                new Article("Вино сухое красное",true,200,1));

        Market market2 = new Market("Товары для дома");
        market2.dealDetail(new Seller("Рима Викторовна",false),
                new Customer("Ярослав",true,25),
                new Article("Вино сухое красное",true,200,1));

        Market market3 = new Market("Товары для дома");
        market3.dealDetail(new Seller("Рима Викторовна",false),
                new Customer("Ярослав",false,45),
                new Article("Вино сухое красное",true,700,1));

    }
}
