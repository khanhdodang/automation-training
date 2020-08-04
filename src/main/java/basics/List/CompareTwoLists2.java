package basics.List;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareTwoLists2 {

    public static void main(String[] args) {
        /*
        Compare two sorted lists
        To compare two lists for equality just in terms of items regardless of their location, we need to use the sort() method from the Collections() class.
         */
        List<String> listOne = Arrays.asList("b", "c", "a");
        List<String> listTwo = Arrays.asList("a", "c", "b");
        List<String> listThree = Arrays.asList("c", "a", "b");

        Collections.sort(listOne);
        Collections.sort(listTwo);
        Collections.sort(listThree);

        boolean isEqual = listOne.equals(listTwo);
        System.out.println(isEqual);

        isEqual = listOne.equals(listThree);
        System.out.println(isEqual);
    }
}
