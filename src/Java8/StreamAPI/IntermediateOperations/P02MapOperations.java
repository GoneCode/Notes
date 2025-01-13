package Java8.StreamAPI.IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P02MapOperations {
    public static void main(String[] args) {

        // TODO The map() method is used to transform each element in the stream by applying a function. It creates a new stream with the modified elements.

        List<String> list = Arrays.asList("java", "stream", "api");
        List<String> upperCase = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperCase);
    }
}
