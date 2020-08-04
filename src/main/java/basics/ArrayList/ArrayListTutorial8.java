package basics.ArrayList;

import java.util.ArrayList;

public class ArrayListTutorial8 {
    public static void main(String[] args) {
        // Looping Through an ArrayList With for-each
        ArrayList<String> fruitBasket = new ArrayList<>();
        fruitBasket.add("Apple");
        fruitBasket.add("Banana");
        fruitBasket.add("Grapes");
        fruitBasket.add("Orange");
        for (String i : fruitBasket) {
            System.out.println(i);
        }
    }
}
