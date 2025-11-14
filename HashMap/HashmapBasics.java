package HashMap;
import java.util.*;
public class HashmapBasics {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Insert data in hashmap -> .put(key, value);
        // map.put("India",120);
        // map.put("China", 150);
        // map.put("US",30);

        // System.out.println(map);

        // map.put("China",180);
        // System.out.println(map);

        // traversing hashmap with two type of loops
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.print(e.getKey() + " ");
            System.out.println(e.getValue());
        }
    }
}
