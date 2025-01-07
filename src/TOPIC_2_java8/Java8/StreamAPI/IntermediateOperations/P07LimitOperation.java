package TOPIC_2.Java8.StreamAPI.IntermediateOperations;

import java.util.Arrays;
import java.util.List;

public class P07LimitOperation {

    public static void main(String[] args) {

        //TODO : The limit() method returns a stream consisting of the first n elements of the original stream.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> limitedNums = numbers.stream().limit(3).toList();
        System.out.println(limitedNums);
    }
}
