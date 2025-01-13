package Java8.StreamAPI.TerminalOperation;

import java.util.ArrayList;
import java.util.List;

public class P03NoneMatch {
    public static void main(String[] args) {

        //TODO : The noneMatch() method checks if no elements in the stream match the given predicate.
        //       It returns true if none of the elements satisfy the condition.

        List<String> stringList = new ArrayList<>();
        stringList.add("john");
        stringList.add("tom");
        System.out.println(stringList.stream().noneMatch(s->s.equals("john")));
    }
}
