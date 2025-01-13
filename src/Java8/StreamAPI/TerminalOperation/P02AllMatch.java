package Java8.StreamAPI.TerminalOperation;

import java.util.ArrayList;
import java.util.List;

public class P02AllMatch {
    public static void main(String[] args) {


        //TODO : The allMatch() method checks if all elements in the stream match the given predicate.
        //       It returns true only if all elements satisfy the predicate.
        List<String> stringList = new ArrayList<>();
        stringList.add("Java Guides");
        stringList.add("Python Guides");
        stringList.add("C Guides");

        System.out.println(stringList.stream().allMatch(s->s.contains("Guides")));


    }
}
