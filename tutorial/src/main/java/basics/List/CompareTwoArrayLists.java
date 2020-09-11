package basics.List;

import java.util.ArrayList;
import java.util.Arrays;

public class CompareTwoArrayLists {

    public static void main(String[] args) {
        /*
        Compare two lists, find differences
        The List interface also provides methods to find differences between two lists.

        The removeAll() method compares two lists and removes all the common items. What’s left is the additional or missing items.

        For example when we compare two lists, listOne and listTwo and we want to find out what items are missing from listTwo we use:
         */

        ArrayList<Integer> listOne = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        ArrayList<Integer> listTwo = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6, 7));

        listOne.removeAll(listTwo);

        System.out.println("Missing items from listTwo " + listOne);
    }
}
