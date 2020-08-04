package basics.ArrayList;

import java.util.ArrayList;

public class ArrayListTutorial14 {
    public static void main(String[] args) {
        // How to Convert an ArrayList to Array
        ArrayList<String> fruitBasket = new ArrayList<>();
        fruitBasket.add("Apple");
        fruitBasket.add("Banana");
        fruitBasket.add("Grapes");
        fruitBasket.add("Orange");

        String[] fruitArray = new String[fruitBasket.size()];
        fruitBasket.toArray(fruitArray);

        for (String i : fruitArray) {
            System.out.println(i);
        }
    }
}
