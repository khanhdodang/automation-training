package basics.ArrayList;

import java.util.ArrayList;

public class ArrayListTutorial {
    public static void main(String[] args) {
        /*
        How to Create an ArrayList
        To create an ArrayList and add items to it, we instantiate an ArrayList object with a specified type, such as String or Integer.

        Note the add() method adds an item to the next position in the ArrayList.
        See the next example to see how to add an item to a specific index.
         */
        ArrayList<String> fruitBasket = new ArrayList<String>();
        fruitBasket.add("Apple");
        fruitBasket.add("Banana");
        fruitBasket.add("Grapes");
        fruitBasket.add("Orange");
        System.out.println(fruitBasket);
    }
}