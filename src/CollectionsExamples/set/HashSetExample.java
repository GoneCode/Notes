package CollectionsExamples.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {

        /*
        TODO : HashSet is one of the widely used classes which implements set interface.
               Frequently used operations on the hashset are
               a.) Adding elements
               b.) accessing elements
               c.) Removing elements
               d.) iterating elements
               e.) Iterating through set.


         */

        /* TODO
            Add operations
            Internally for every element, a hash is generated and the values are stored with respect to the generated hash.
            the values are compared and sorted in ascending order.
            Null values are accepted by set.
         */
        Set<String> hs = new HashSet<>();
        hs.add("Z");
        hs.add("B");
        hs.add("C");
        hs.add("A");
        hs.add("B");
        System.out.println(hs);

        /*
         TODO
             Accessing elements .
             we use inbuilt methods like contains()

         */
        System.out.println(hs.contains("Z"));

        /*
           TODO
                Remove values using remove() method

         */
        System.out.println(hs.remove("A"));
        System.out.println(hs);

        /*
            TODO
                Iterating over set using enhanced loop - for-each
         */
        for(String a:hs){
            System.out.println(a);
        }

        /*
            TODO
                Iterating using iterator
         */
        Iterator<String> itr = hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }

}
