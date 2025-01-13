package Java8.StreamAPI.IntermediateOperations;

import java.util.Arrays;
import java.util.List;

public class P08SkipOperation {

    public static void main(String[] args) {


        //TODO : The skip() method skips the first n elements of the stream and returns a stream consisting of the remaining elements.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> skipNum = numbers.stream().skip(3).toList();
        System.out.println(skipNum);

    }
}
