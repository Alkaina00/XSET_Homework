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
    }
}