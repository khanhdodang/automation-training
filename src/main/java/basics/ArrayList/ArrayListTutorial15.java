package basics.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTutorial15 {
    public static void main(String[] args) {
        // How to Swap Two Items in an ArrayList
        ArrayList<String> fruitBasket = new ArrayList<>();
        fruitBasket.add("Apple");
        fruitBasket.add("Banana");
        fruitBasket.add("Grapes");
        fruitBasket.add("Orange");
        System.out.println(fruitBasket);

        Collections.swap(fruitBasket, 1, 3);
        System.out.println(fruitBasket);
    }
}