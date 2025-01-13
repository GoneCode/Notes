package Java8.StreamAPI.IntermediateOperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class P05SortedOperation {
    public static void main(String[] args) {

        // TODO :
        //  The sorted() method sorts the elements of the stream in natural order or using a custom comparator.

        List<String> names = Arrays.asList("Rahul", "Amit", "Deepa", "Suresh");
        List<String> sortedNames = names.stream().sorted().toList();
        List<String> reverseOrder= names.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(reverseOrder);
        System.out.println(sortedNames);
    }
}
