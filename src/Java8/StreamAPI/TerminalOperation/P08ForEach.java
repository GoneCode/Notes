package Java8.StreamAPI.TerminalOperation;

import java.util.ArrayList;
import java.util.List;

public class P08ForEach {

    // TODO : The forEach() method performs an action for each element in the stream.
    //  It is typically used for printing or other side effects.

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");

        stringList.stream().forEach(System.out::println);
    }
}
