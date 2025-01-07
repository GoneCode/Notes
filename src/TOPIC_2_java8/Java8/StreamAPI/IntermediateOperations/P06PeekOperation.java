package Java8.StreamAPI.IntermediateOperations;

import javax.naming.InsufficientResourcesException;
import java.util.Arrays;
import java.util.List;

public class P06PeekOperation {

    public static void main(String[] args) {

        // TODO : The peek() method is mainly used for debugging purposes.
        //  It allows us to see the elements in the stream as they are processed, without modifying them.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> filteredNum = numbers.stream().peek(n->System.out.println("Before filtering "+n)).filter(n->n%2==0).toList();
        System.out.println(filteredNum);

    }
}
