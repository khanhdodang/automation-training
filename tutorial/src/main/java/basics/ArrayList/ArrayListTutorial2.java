package basics.ArrayList;

import java.util.ArrayList;

public class ArrayListTutorial2 {
    public static void main(String[] args) {
        /*
        How to Add an Item to a Specific Position
        To add an item to a specified position, we have to provide the desired index to the add() method.
         */
        ArrayList<String> fruitBasket = new ArrayList<String>();
        fruitBasket.add("Apple");
        fruitBasket.add("Banana");
        fruitBasket.add("Grapes");
        fruitBasket.add("Orange");
        fruitBasket.add(2, "Melon");
        System.out.println(fruitBasket);
    }
}