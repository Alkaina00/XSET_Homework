package homework24;

public abstract class BaseSweetness {
    private String name;
    private double weight;
    private double price;

    public BaseSweetness(String name, double weight, double price){
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(String name){
        this.weight = weight;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(String name){
        this.price = price;
    }
}
