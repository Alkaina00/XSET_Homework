package homework24;

import java.util.ArrayList;

public class BoxSweet implements Box{
    private ArrayList<Sweet> boxSweet = new ArrayList<>();

    public void addSweet(Sweet sweet) {
        boxSweet.add(sweet);
    }

    public void removeLast(){
        if(!boxSweet.isEmpty()){
            boxSweet.remove(boxSweet.size() - 1);
        }
    }

    public void removeByIndex(int index){
        if(index >= 0 && index < boxSweet.size()){
            boxSweet.remove(index);
        }
    }

    public double getTotalWeight(){
        return boxSweet.stream().mapToDouble(Sweet::getWeight).sum();
    }

    public double getTotalPrice(){
        return boxSweet.stream().mapToDouble(Sweet::getPrice).sum();
    }

    public void getInform(){
        if (boxSweet.isEmpty()) {
            System.out.println("Коробка пуста");
            return;
        }
        System.out.println("Сладости в коробке:");
        for (int i = 0; i < boxSweet.size(); i++) {
            Sweet sweet = boxSweet.get(i);
            System.out.printf("%d. Название: %s, Вес (кг): %.2f, Цена (руб): %.2f, %s%n",
                    i + 1, sweet.getName(), sweet.getWeight(), sweet.getPrice(), sweet.getUniqueParameter());
        }
        System.out.printf("Общий вес: %.2f\n", getTotalWeight());
        System.out.printf("Общая стоимость: %.2f\n", getTotalPrice());
    }
}
