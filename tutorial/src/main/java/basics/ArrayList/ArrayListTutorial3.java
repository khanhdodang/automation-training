package basics.ArrayList;

import java.util.ArrayList;

public class ArrayListTutorial3 {
    public static void main(String[] args) {
        /*
        How to Access an Item in an ArrayList
        The get() method retrieves an item. We have to provided the index number to the get() method.
         */
        ArrayList<String> fruitBasket = new ArrayList<String>();
        fruitBasket.add("Apple");
        fruitBasket.add("Banana");
        fruitBasket.add("Grapes");
        fruitBasket.add("Orange");
        System.out.println(fruitBasket.get(1));
    }
}