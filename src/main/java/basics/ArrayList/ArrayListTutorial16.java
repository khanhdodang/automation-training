package basics.ArrayList;

import java.util.ArrayList;

public class ArrayListTutorial16 {
    public static void main(String[] args) {
        // How to Join Two ArrayLists
        ArrayList<String> fruitBasket1 = new ArrayList<>();
        ArrayList<String> fruitBasket2 = new ArrayList<>();

        fruitBasket1.add("Apple");
        fruitBasket1.add("Banana");
        fruitBasket1.add("Grapes");
        fruitBasket1.add("Orange");

        fruitBasket2.add("Melon");
        fruitBasket2.add("Strawberries");

        fruitBasket1.addAll(fruitBasket2);

        System.out.println(fruitBasket1);
    }
}
