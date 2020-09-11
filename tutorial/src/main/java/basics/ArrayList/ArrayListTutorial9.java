package basics.ArrayList;

import java.util.ArrayList;

public class ArrayListTutorial9 {
    public static void main(String[] args) {
        // ArrayList Example With Numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        for (int i : numbers) {
            System.out.println(i);
        }
    }
}
