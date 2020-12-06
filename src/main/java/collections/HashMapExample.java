package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> values = new HashMap<Integer, String>();
        values.put(1, "Rahul");
        values.put(2, "Sah");
        values.put(2, "Sah");
        values.put(2, "Sah");
        values.put(2, "Sah");

        Iterator hmIterator = values.entrySet().iterator();

        while (hmIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry) hmIterator.next();
            String name = (String)mapElement.getValue();
            int key =  (Integer) mapElement.getKey();
            System.out.println("Key =>"+key+" & name =>"+name);
        }
    }
}
