package basics.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTutorial13 {
    public static void main(String[] args) {
        // How to Reverse the Items on an ArrayList
        ArrayList<String> fruitBasket = new ArrayList<>();
        fruitBasket.add("Apple");
        fruitBasket.add("Banana");
        fruitBasket.add("Grapes");
        fruitBasket.add("Orange");
        System.out.println(fruitBasket);

        Collections.reverse(fruitBasket);
        System.out.println(fruitBasket);
    }
}
