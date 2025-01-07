package Java8.MethodReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Examples {

    public static void main(String[] args) {

        // A method reference is a short hand notation of lambda expression to call a method.
        // it allows you to refer to methods or constructors without invoking them.
        /*
        Types of method reference
        1.) Reference to a static method
        2.) Reference to an instance method of a particular method
        3.) Reference to an instance method of an arbitrary object of a particular type.
        4.) Reference to a constructor.

         */
        //Static method reference
        List<String> messages = Arrays.asList("Hello", "World", "Method", "Reference");
        messages.forEach(MethodReferenceExample::printMessage);

        //instance method reference of an object
        MethodReferenceExample n = new MethodReferenceExample();
        Consumer<String> printer = n::print;
        printer.accept("hello world");

        //Instance Method Reference of an Arbitrary Object of a Particular Type
        List<String> messages1 = Arrays.asList("Java", "Python", "C++", "JavaScript");
        messages.forEach(System.out::println);

        //Constructor Reference
        Supplier<MethodReferenceExample> supplier = MethodReferenceExample::new;
        MethodReferenceExample m = supplier.get();

    }
}
