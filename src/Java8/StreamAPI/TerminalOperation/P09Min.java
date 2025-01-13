package Java8.StreamAPI.TerminalOperation;

import java.util.ArrayList;
import java.util.List;

public class P09Min {

    public static void main(String[] args) {

        //TODO : The min() method returns the smallest element from the stream based on the specified comparator.
        List<String> stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");

        System.out.println(stringList.stream().min(String::compareTo).get());
    }
}
