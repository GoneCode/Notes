package CollectionsExamples.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<String,Integer> hp = new HashMap<>();
        hp.put("A",1);
        hp.put("B",2);
        hp.put("C",3);
        if(hp.containsKey("A")){
            System.out.println(hp.get("A"));
        }
        // using keySet and keyValue we can get
        for(String s: hp.keySet()){
            System.out.println(s+" "+hp.get(s));
        }
        System.out.println(hp.values());

        //using entrySet we can get key and value this way.
        for(Map.Entry<String,Integer> s : hp.entrySet()){
            System.out.println(s.getKey()+" "+s.getValue());
        }

        // Methods in hashmap
        /*1.) put(k,v) - insert value in hashmap
          2.) get(k) - get value based on key
          3.) remove(k) - removes the key value pair
          4.) containsKey(k) - checks if key exists
          5.) containsValue(v) - checks if value exists
          6.) keySet() - returns keys
          7.) values() - returns all the values.
         */

    }
}
