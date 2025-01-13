package Java8.StreamAPI.IntermediateOperations;

import java.util.Arrays;
import java.util.List;

public class P04DistinctOperation {
    public static void main(String[] args) {

        // TODO : The distinct() method removes duplicate elements from the stream, ensuring only unique elements are passed to the next operation.

        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> distinct = numbers.stream().distinct().toList();
        System.out.println(distinct);

    }
}
