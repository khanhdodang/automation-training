package basics.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateMap {
    public static void main(String[] args) {
        System.out.println("How to Iterate Map Entries (Keys and Values)");
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        map.put(4, 4);
        map.put(5, 5);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        System.out.println("How to Iterate Map Keys Only");
        for (Integer key : map.keySet()) {
            System.out.println("Key = " + key);
        }

        System.out.println("How to Iterate Map Values Only");
        for (Integer value : map.values()) {
            System.out.println("Value = " + value);
        }

        System.out.println("Using Iterator - Using Generics");
        Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer, Integer> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        System.out.println("Using Iterator - Without Generics");
        entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry entry = entries.next();
            Integer key = (Integer) entry.getKey();
            Integer value = (Integer) entry.getValue();
            System.out.println("Key = " + key + ", Value = " + value);
        }

        System.out.println("Iterating over keys and searching for values");
        for (Integer key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println("Key = " + key + ", Value = " + value);
        }

        System.out.println("Using Java 8 ForEach");
        Map<String, Integer> items = new HashMap<>();
        items.put("key 1", 1);
        items.put("key 2", 2);
        items.put("key 3", 3);

        items.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));
    }
}
