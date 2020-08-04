package basics.ArrayList;

import java.util.ArrayList;

public class ArrayListTutorial5 {
    public static void main(String[] args) {
        /*
        How to Remove All Items From an ArrayList
        The clear() method removes all items from an ArrayList.
         */
        ArrayList<String> fruitBasket = new ArrayList<String>();
        fruitBasket.add("Apple");
        fruitBasket.add("Banana");
        fruitBasket.add("Grapes");
        fruitBasket.add("Orange");
        fruitBasket.clear();
        System.out.println(fruitBasket);
    }
}
