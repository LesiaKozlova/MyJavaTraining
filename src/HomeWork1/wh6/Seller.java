package HomeWork1.wh6;

public class Seller extends MembersOfDeal{
    private String name;
    private boolean isHonest;

    public Seller(String name, boolean isHonest) {
        this.name = name;
        this.isHonest = isHonest;
    }
///////////////////////////////////////////////////////////////////////////////////////////
    public String getName() {
        return name;
    }

    public boolean isHonest() {
        return isHonest;
    }
////////////////////////////////////////////////////////
    void role(){
        System.out.println("Я продавец");
    }
}
