package homework24;

public interface Box {
    void addSweet(Sweet sweet);
    void removeLast();
    void removeByIndex(int i);
    double getTotalWeight();
    double getTotalPrice();
    void getInform();
}
