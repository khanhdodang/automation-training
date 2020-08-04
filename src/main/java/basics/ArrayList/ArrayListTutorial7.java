package basics.ArrayList;

import java.util.ArrayList;

public class ArrayListTutorial7 {
    public static void main(String[] args) {
        // How to Loop Through an ArrayList
        ArrayList<String> fruitBasket = new ArrayList<>();
        fruitBasket.add("Apple");
        fruitBasket.add("Banana");
        fruitBasket.add("Grapes");
        fruitBasket.add("Orange");
        for (int i = 0; i < fruitBasket.size(); i++) {
            System.out.println(fruitBasket.get(i));
        }
    }
}
