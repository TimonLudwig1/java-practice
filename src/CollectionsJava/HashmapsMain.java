package CollectionsJava;

import java.util.HashMap;

public class HashmapsMain {
    public static void main(String[] args) {
        
    
        // HashMap = A data structure that stores key-value pairs
        //           Keys are unique, but Values can be duplicated
        //           Does not maintain any order, but is memory efficient
        //           HashMap<Key, Vlaue> 

        HashMap<String, Double> map = new HashMap<>(); 

        // store things in the HashMap

        map.put("apple", 0.50); 
        map.put("orange", 0.75);
        map.put("banana", 0.25);
        map.put("coconut", 1.00);

        System.out.println(map);

        // In Hashmaps, the keys have to be unique! - adding a "duplicate" overrides the entry

        map.put("orange", 10000.00);
        System.out.println(map);

        // remove suff - use the key!

        map.remove("apple");
        System.out.println(map);

        // get me the value to a key - .get();

        System.out.println(map.get("coconut"));

        // .containsKey() - is there the key "..." in the HashMap ? -> true/false

        System.out.println(map.containsKey("orange"));

        if (map.containsKey("apple")) {
            System.out.println("There is an apple in the map :) ");
            System.out.println(map.get("apple"));
        }
        else{
            System.out.println("The apple has been removed! ");
            }

        // .containsValue(value); check if the HashMap contains a specific value

        System.out.println(map.containsValue(0.25));

        // return the size of a HashMap

        System.out.println(map.size());

        for(String key : map.keySet()){
            // System.out.println(key + ": $" + map.get(key));
            System.out.printf("%s: $%.2f\n",key, map.get(key));
        }

        System.out.println(map.keySet());   // gives us a set of the keys
    }
}
