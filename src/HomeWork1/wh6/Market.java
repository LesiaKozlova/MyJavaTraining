package HomeWork1.wh6;

public class Market implements Sales {
    private String nameOfMarket;

    public Market(String nameOfMarket) {
        this.nameOfMarket = nameOfMarket;
    }

    public String getNameOfMarket() {
        return nameOfMarket;
    }
    @Override
    public void dealDetail(Seller seller, Customer customer, Article article){
        String prodastTovar ;
        System.out.println(seller.isHonest());
        System.out.println(article.isAlcohol());
        System.out.println(customer.getAge());
        if (seller.isHonest()==true && customer.getAge()<18 && article.isAlcohol()==true ){
            prodastTovar = "НЕ продаст вам этот товар ";
/*
            if (customer.isHasDiscountCard()){

            } ;
*/
            System.out.println("Уважаемый "+customer.getName()+","+" продавец "+seller.getName()+",\n"
                            + "нашего магазина \"" + getNameOfMarket() + "\",\n" + prodastTovar
                            + "\""+article.getNameOfArticle()
                            + "\""+","+"\nпоскольку ваша покупка содержит алкогольную продукцию, а ваш возраст " + customer.getAge()+" лет!"
                            + "\nСтоимость вашей покупки равна "
                            +"0 грн."+" Ваша скидка 0%");

        }
        else if (seller.isHonest()==false && customer.getAge() <18 && article.isAlcohol()==true ) {
            prodastTovar = "продаст вам этот товар ";

            if(customer.isHasDiscountCard()==true) {
                double summOfPorchuse = article.getCostOneStk() * article.getValueOfStk()
                        - (article.getCostOneStk() * article.getValueOfStk()) * 10 / 100;


                System.out.println("Уважаемый " + customer.getName() + "," + " продавец " + seller.getName()+",\n"
                        + "нашего магазина \"" + getNameOfMarket() + "\",\n" + prodastTovar + "\""+article.getNameOfArticle()
                        + "\"\nхотя ваша покупка содержит алкогольную продукцию, а ваш возраст " + customer.getAge()+" лет!"
                        + "\nСтоимость вашей покупки равна "
                        + summOfPorchuse +" грн." +"\nВаша скидка 10%");
//                            +"0 грн."+" Ваша скидка 0%");
            }

        }
        else {
            prodastTovar = "продаст вам этот товар ";

            if (customer.isHasDiscountCard() == true) {
                double summOfPorchuse = article.getCostOneStk() * article.getValueOfStk()
                        - (article.getCostOneStk() * article.getValueOfStk()) * 10 / 100;

                System.out.println("Уважаемый " + customer.getName() + "," + " продавец " + seller.getName() + ",\n"
                        + "нашего магазина \"" + getNameOfMarket() + "\",\n" + prodastTovar + "\"" + article.getNameOfArticle()
                        + "\"\nпоскольку НЕ важно содержит ли ваша покупка алкогольную продукцию, поскольку ваш возраст " + customer.getAge() + " лет!"
                        + "\nСтоимость вашей покупки, с учетом скидки равна "
                        + summOfPorchuse + " грн." + "\nВаша скидка 10%");//                            +"0 грн."+" Ваша скидка 0%");
            } else {
                double summOfPorchuse = article.getCostOneStk() * article.getValueOfStk();

                System.out.println("Уважаемый " + customer.getName() + "," + " продавец " + seller.getName() + ",\n"
                        + "нашего магазина \"" + getNameOfMarket() + "\",\n" + prodastTovar + "\"" + article.getNameOfArticle()
                        + "\"\nпоскольку НЕ важно содержит ли ваша покупка алкогольную продукцию, поскольку ваш возраст " + customer.getAge() + " лет!"
                        + "\nСтоимость вашей покупки равна "
                        + summOfPorchuse + " грн." + "\nВаша скидка 0%");
                //                            }
            }
        }
    }

}



