package basics.ArrayList;

import java.util.ArrayList;

public class ArrayListTutorial10 {
    public static void main(String[] args) {
        /*
        How to Replace an Item in an ArrayList
        The replace() method replaces an item with another provided item.
        We have to specify the index of the item we want to replace.
         */
        ArrayList<String> fruitBasket = new ArrayList<>();
        fruitBasket.add("Apple");
        fruitBasket.add("Banana");
        fruitBasket.add("Grapes");
        fruitBasket.add("Orange");

        fruitBasket.set(3, "Peach");
        for (String i : fruitBasket) {
            System.out.println(i);
        }
    }
}
