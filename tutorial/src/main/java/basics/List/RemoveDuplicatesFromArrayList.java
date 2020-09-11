package basics.List;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArrayList {

    public static void main(String[] args) {
        /*
        Remove Duplicate Strings From ArrayList
        Since a Set cannot hold duplicate elements, we can instantiate a Set object passing in the ArrayList with duplicates as a parameter.
         */
        ArrayList<String> pets = new ArrayList<>();

        pets.add("cat");
        pets.add("dog");
        pets.add("cat");
        pets.add("hamster");

        System.out.println(pets);

        Set<String> hashSet = new LinkedHashSet(pets);
        ArrayList<String> removedDuplicates = new ArrayList(hashSet);

        System.out.println(removedDuplicates);
    }
}
