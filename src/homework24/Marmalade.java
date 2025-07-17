package homework24;

public class Marmalade extends Sweet {

    private String flavor;
    public Marmalade(String name, double weight, double price, String flavor){
        super(name, weight, price);
        this.flavor = flavor;
    }

    public String getUniqueParameter() {
        return flavor;
    }

    public void setFlavor(String flavor){
        this.flavor = flavor;
    }
}
