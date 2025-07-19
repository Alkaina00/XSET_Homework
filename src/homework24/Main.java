package homework24;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Box sweetBox = new BoxSweet();

        sweetBox.addSweet(new Chocolate("Milka", 0.072, 161, "молочный"));
        sweetBox.addSweet(new Chocolate("Alpen Gold", 0.08, 116, "белый"));
        sweetBox.addSweet(new IceCream("Эkzo", 0.07, 118, "кокос, манго, маракуйя"));
        sweetBox.addSweet(new Marmalade("Orion Jelly Boy", 0.066, 97, "личи"));

        sweetBox.getInform();

        System.out.println("\nУдаляем последнюю сладость...");
        sweetBox.removeLast();
        sweetBox.getInform();

        System.out.println("\nУдаляем сладость с индексом 1...");
        sweetBox.removeByIndex(1);
        sweetBox.getInform();

        System.out.println("\nДобавляем новую сладость...");
        sweetBox.addSweet(new Marmalade("Orion Jelly Boy", 0.066, 83, "киви"));
        sweetBox.getInform();

        // Тест оптимизация
        System.out.println("\nОптимизация");
        sweetBox.addSweet(new Chocolate("Milka", 0.08, 149, "молочный с фундуком"));
        sweetBox.addSweet(new Chocolate("Alpen Gold", 0.14, 234, "молочный с фруктовыми кусочками"));
        sweetBox.addSweet(new IceCream("Monterra", 0.3, 494, "карамельный сироп и кусочки печенья"));
        sweetBox.addSweet(new Marmalade("Самокат", 0.25, 119, "лимон"));

        sweetBox.getInform();

        System.out.println("\nОптимизация по весу (цель: 0.8 кг)...");
        ((BoxSweet)sweetBox).optimizeByWeight(0.8);
        sweetBox.getInform();

        System.out.println("\nОптимизация по цене (цель: 0.5 кг)...");
        ((BoxSweet)sweetBox).optimizeByPrice(0.5);
        sweetBox.getInform();

    }
}