package basics.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoopOverArrayExamples {
    static List fruitBasket = new ArrayList<>(0);

    static void addFruitsToBasket() {
        fruitBasket.add("Apple");
        fruitBasket.add("Banana");
        fruitBasket.add("Pear");
        fruitBasket.add("Mango");
    }

    public static void main(String[] args) {
        addFruitsToBasket();

        System.out.println("Using Classic For Loop");
        for (int i = 0; i < fruitBasket.size(); i++) {
            System.out.println(fruitBasket.get(i));
        }

        System.out.println("Advanced For Loop");
        for(Object fruit : fruitBasket) {
            System.out.println(fruit.toString());
        }

        System.out.println("Using Iterator");
        Iterator fruitIterator = fruitBasket.iterator();
        while (fruitIterator.hasNext()) {
            System.out.println(fruitIterator.next());
        }

        System.out.println("Using While Loop");
        int i = 0;
        while (i < fruitBasket.size()) {
            System.out.println(fruitBasket.get(i));
            i++;
        }

        System.out.println("ForEach (Java 8)");
        fruitBasket.forEach( (fruit) ->
                System.out.println(fruit)
        );
    }
}
