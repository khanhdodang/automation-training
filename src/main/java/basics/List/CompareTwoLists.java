package basics.List;

import java.util.Arrays;
import java.util.List;

public class CompareTwoLists {

    public static void main(String[] args) {
        // Compare two unsorted lists for equality
        List<String> listOne = Arrays.asList("a", "b", "c");
        List<String> listTwo = Arrays.asList("a", "b", "c");
        List<String> listThree = Arrays.asList("c", "a", "b");

        boolean isEqual = listOne.equals(listTwo);
        System.out.println(isEqual);

        isEqual = listOne.equals(listThree);
        System.out.println(isEqual);
    }
}

