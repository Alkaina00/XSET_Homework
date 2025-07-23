package homework24;

public class IceCream extends Sweet {
    private String topping;
    public IceCream(String name, double weight, double price, String topping){
        super(name, weight, price);
        this.topping = topping;
    }

    public String getUniqueParameter() {
        return topping;
    }

    public void setTopping(String topping){
        this.topping = topping;
    }
}
