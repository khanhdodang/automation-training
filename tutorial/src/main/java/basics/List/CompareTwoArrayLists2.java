package basics.List;

import java.util.ArrayList;
import java.util.Arrays;

public class CompareTwoArrayLists2 {

    public static void main(String[] args) {
        /*
        Compare two lists, find common items
        The retainAll() method only keeps the items that are common in both lists. For example:
         */

        ArrayList<Integer> listOne = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        ArrayList<Integer> listTwo = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6, 7));

        listOne.retainAll(listTwo);

        System.out.println("Common items in both lists " + listOne);
    }
}
