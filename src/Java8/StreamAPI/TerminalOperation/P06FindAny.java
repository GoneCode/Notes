package Java8.StreamAPI.TerminalOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class P06FindAny {

    public static void main(String[] args) {

        //TODO : The findAny() method returns any one element from the stream. It returns an Optional object.
        List<String> stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("four");
        stringList.add("five");
        stringList.add("six");
        stringList.add("seven");
        stringList.add("eight");


        System.out.println(stringList.stream().findAny().get());
    }


}
