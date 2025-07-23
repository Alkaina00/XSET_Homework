package homework24;

public class Chocolate extends Sweet {
    private String type;
    public Chocolate(String name, double weight, double price, String type){
        super(name, weight, price);
        this.type = type;
    }

    public String getUniqueParameter() {
        return type;
    }

    public void setType(String type){
        this.type = type;
    }
}
