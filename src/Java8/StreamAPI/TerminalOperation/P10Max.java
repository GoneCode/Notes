package Java8.StreamAPI.TerminalOperation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P10Max {
    public static void main(String[] args) {

        // TODO : The max() method returns the largest element from the stream based on the specified comparator.
        List<String> stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");

        String longestString = stringList.stream().max((str1,str2)->Integer.compare(str1.length(),str2.length())).get();
        String longestString2 = stringList.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println(longestString);
    }
}
