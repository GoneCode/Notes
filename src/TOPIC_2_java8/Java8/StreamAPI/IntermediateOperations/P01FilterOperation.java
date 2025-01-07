package Java8.StreamAPI.IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P01FilterOperation {

    public static void main(String[] args) {


        //TODO : The filter() method is used to retain elements in the stream that match a given predicate (condition).
        // Non-matching elements are excluded.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenList = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evenList);
    }
}
