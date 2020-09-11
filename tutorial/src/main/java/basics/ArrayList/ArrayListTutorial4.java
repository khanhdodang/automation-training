package basics.ArrayList;

import java.util.ArrayList;

public class ArrayListTutorial4 {
    public static void main(String[] args) {
        /*
        How to Remove an Item From an ArrayList
        To remove an item, we use the remove() method. We have to provide the index number.
         */
        ArrayList<String> fruitBasket = new ArrayList<String>();
        fruitBasket.add("Apple");
        fruitBasket.add("Banana");
        fruitBasket.add("Grapes");
        fruitBasket.add("Orange");
        fruitBasket.remove(0);
        System.out.println(fruitBasket);
    }
}