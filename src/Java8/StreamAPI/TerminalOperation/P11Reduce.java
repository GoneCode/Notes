package Java8.StreamAPI.TerminalOperation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class P11Reduce {
    public static void main(String[] args) {

        // TODO : reduce terminal operation in Java 8 is a powerful tool for performing reduction operations on streams.
        //        It allows you to combine elements of a stream to produce a single result.

        /* TODO  Key Concepts
            Identity: The initial value of the reduction operation and the default result if the stream is empty.
            Accumulator: A function that takes two parameters: a partial result of the reduction operation and the next element of the stream.
            Combiner: A function used to combine the partial results when the reduction is parallelized.
        */

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int result = numbers.stream().reduce(0, Integer::sum);
        System.out.println(result);

        //In this example:
        //
        //0 is the identity.
        //(subtotal, element) -> subtotal + element is the accumulator.

        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        Optional<Integer> max = numbers1.stream().reduce(Integer::max);
        max.ifPresent(System.out::println); // Output: 6

        //TODO : The reduce operation is versatile and
        // can be used for various types of reduction operations, such as summing numbers, concatenating strings, finding the maximum or minimum value.







    }
}
