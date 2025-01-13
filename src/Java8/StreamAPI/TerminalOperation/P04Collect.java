package Java8.StreamAPI.TerminalOperation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class P04Collect {
    public static void main(String[] args) {


        // TODO :The collect() method is used to collect the stream elements into a collection, such as a List, Set, or Map.

        List<String> stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("four");
        stringList.add("five");

        List<String> uppercaseList = stringList.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(uppercaseList);
    }
}
