package basics.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTutorial11 {
    public static void main(String[] args) {
        /*
        How to Shuffle Items in an ArrayList
        The shuffle() method is in the Collections class and is used to do a random shuffle of the ArrayList items.
         */
        ArrayList<String> fruitBasket = new ArrayList<>();
        fruitBasket.add("Apple");
        fruitBasket.add("Banana");
        fruitBasket.add("Grapes");
        fruitBasket.add("Orange");
        System.out.println(fruitBasket);

        Collections.shuffle(fruitBasket);
        System.out.println(fruitBasket);
    }
}