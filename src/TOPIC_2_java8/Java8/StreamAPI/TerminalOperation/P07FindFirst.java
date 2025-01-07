package Java8.StreamAPI.TerminalOperation;

import java.util.ArrayList;
import java.util.List;

public class P07FindFirst {

    public static void main(String[] args) {

        //TODO : The findFirst() method retrieves the first element in the stream.

        List<String> stringList = new ArrayList<>();
        stringList.add("zero");
        stringList.add("two");
        stringList.add("three");

        System.out.println(stringList.stream().findFirst().get());
    }
}
