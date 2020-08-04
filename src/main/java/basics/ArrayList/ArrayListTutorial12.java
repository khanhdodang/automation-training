package basics.ArrayList;

import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTutorial12 {
    public static void main(String[] args) {
        // How to Sort Items in an ArrayList
        ArrayList<String> fruitBasket = new ArrayList<>();
        fruitBasket.add("Orange");
        fruitBasket.add("Apple");
        fruitBasket.add("Grapes");
        fruitBasket.add("Banana");
        System.out.println(fruitBasket);

        Collections.sort(fruitBasket);
        System.out.println(fruitBasket);
    }
}
