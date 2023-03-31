package HomeWork1.wh6;

public class Article {
    private String nameOfArticle;
    private boolean isAlcohol;
    private int costOneStk;
    private int valueOfStk;

    public Article(String nameOfArticle, boolean isAlcohol, int costOneStk, int valueOfStk) {
        this.nameOfArticle = nameOfArticle;
        this.isAlcohol = isAlcohol;
        this.costOneStk = costOneStk;
        this.valueOfStk = valueOfStk;
    }

    public String getNameOfArticle() {
        return nameOfArticle;
    }

    public boolean isAlcohol() {
        return isAlcohol;
    }

    public int getCostOneStk() {
        return costOneStk;
    }

    public int getValueOfStk() {
        return valueOfStk;
    }
}
