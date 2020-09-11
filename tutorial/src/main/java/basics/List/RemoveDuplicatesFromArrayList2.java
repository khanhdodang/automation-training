package basics.List;

import java.util.*;

public class RemoveDuplicatesFromArrayList2 {

    public static void main(String[] args) {
        /*
        Remove Duplicate Integers From List
        Likewise, we can use the same methodology to remove duplicate integers.
         */
        List<Integer> numbers = Arrays.asList(1, 2, 2, 2, 3, 5);

        System.out.println(numbers);

        Set<Integer> hashSet = new LinkedHashSet(numbers);
        ArrayList<Integer> removedDuplicates = new ArrayList(hashSet);

        System.out.println(removedDuplicates);
    }
}