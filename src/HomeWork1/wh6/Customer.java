package HomeWork1.wh6;

public class Customer extends MembersOfDeal{
    private String name;
    private boolean hasDiscountCard;
    private int age;

    public Customer(String name, boolean hasDiscountCard, int age) {
        this.name = name;
        this.hasDiscountCard = hasDiscountCard;
        this.age = age;
    }
///////////////////////////////////////////////////////////////////////
    public String getName() {
        return name;
    }

    public boolean isHasDiscountCard() {
        return hasDiscountCard;
    }

    public int getAge() {
        return age;
    }
///////////////////////////////////////////////////////
    void role(){
        System.out.println("Я покупатель");
    }

}
