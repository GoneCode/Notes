package Java8.StreamAPI.TerminalOperation;

import java.util.ArrayList;
import java.util.List;

public class P01AnyMatch {

    public static void main(String[] args) {

        //TODO : The anyMatch() method checks if any element in the stream matches the given predicate.
        //       If any match is found, it returns true; otherwise, false.

        List<String> strList = new ArrayList<>();
        strList.add("Apple");
        strList.add("Anaconda");
        strList.add("Carrot");
        strList.add("Dog");

        System.out.println(strList.stream().anyMatch(s->s.startsWith("D")));

    }
}
