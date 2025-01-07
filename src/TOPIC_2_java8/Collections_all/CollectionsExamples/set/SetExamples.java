package CollectionsExamples.set;

import javax.print.attribute.SetOfIntegerSyntax;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetExamples {

    public static void main(String[] args) {

        /*
            TODO:
                 Set in java is an interface in java.util.
                 Set is unordered collection or list in which duplicates are not allowed.
                 Sorted set and navigableSet are two interfaces that extend set implementation.


        TODO - Operations on set
            1.) Intersection - Operation returns all common elements from the given two sets.
            2.) Union - Operation adds all elements in one set with the other.
            3.) Difference - This Operation removes all the values present in one set from other set.

         */

        // Set operation Example

        Set<Integer> a = new HashSet<Integer>(Arrays.asList(1, 3, 2, 4, 8, 9, 0));
        Set<Integer> b = new HashSet<>(Arrays.asList(1, 3, 7, 5, 4, 0, 7, 5));

        // Union example
        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
        System.out.println(union);

        // intersection example
        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        System.out.println(intersection);

        // difference example
        Set<Integer> difference = new HashSet<>(a);
        difference.removeAll(b);
        System.out.println(difference);



    }
}
