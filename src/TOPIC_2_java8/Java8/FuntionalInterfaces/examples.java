package Java8.FuntionalInterfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class examples {

    public static void main(String[] args) {

        /* TODO: functional interfaces are interfaces with exactly one abstract method.
                 they are designed to work with lambda expression.
            Key Points:

               1.) Single Abstract Method (SAM): A functional interface has only one abstract method, but it can have multiple default or static methods.

               2.) @FunctionalInterface Annotation: While not required, using this annotation makes it clear that the interface is intended to be a functional interface.
                    It also prevents you from accidentally adding more abstract methods.

               3.) Lambda Expressions: They provide a clear and concise way to implement the single abstract method of a functional interface.
         */

        // predicate - > takes input and returns boolean
        Predicate<String> isLonger = (str)->str.length()>5;
        System.out.println(isLonger.test("HEll"));

        // consumer - > takes input and doesn't return any output
        Consumer<String> printer = (str)->System.out.println(str);
        printer.accept("hello");

        //Function - > takes input and returns output
        Function<String,Integer> func = (str)->str.length();
        System.out.println(func.apply("HELLO"));

        //supplier -> doesn't take any input,but returns output.
        Supplier<Double> sup = Math::random;
        System.out.println(sup.get());



    }
}
