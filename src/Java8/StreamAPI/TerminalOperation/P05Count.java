package Java8.StreamAPI.TerminalOperation;

import java.util.ArrayList;
import java.util.List;

public class P05Count {
    public static void main(String[] args) {

        // TODO : The count() method returns the number of elements in the stream.
        List<String> stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("four");
        stringList.add("five");

        System.out.println(stringList.stream().count());

    }
}
