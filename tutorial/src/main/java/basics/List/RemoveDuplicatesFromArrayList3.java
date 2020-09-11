package basics.List;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArrayList3 {

    public static void main(String[] args) {
        // Remove Duplicates From List Using Java 8 Lambdas
        List<Integer> numbers = Arrays.asList(1, 2, 2, 2, 3, 5);

        System.out.println(numbers);

        List<Integer> removedDuplicates = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(removedDuplicates);
    }
}