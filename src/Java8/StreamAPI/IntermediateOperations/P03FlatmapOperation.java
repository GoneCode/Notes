package Java8.StreamAPI.IntermediateOperations;

import java.util.Arrays;
import java.util.List;

public class P03FlatmapOperation {

    public static void main(String[] args) {

        // TODO
        //  The flatMap() method is used to flatten nested collections or arrays into a single stream.
        //  It applies a function to each element and then flattens the result.

        List<List<String>> nestedList = Arrays.asList(Arrays.asList("Java","python"),Arrays.asList("C++","GO"));
        List<String> flattendList = nestedList.stream().flatMap(List::stream).toList();

    }
}
