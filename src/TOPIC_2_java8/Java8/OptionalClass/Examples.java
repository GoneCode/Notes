package Java8.OptionalClass;

import javax.swing.text.html.Option;
import java.util.Optional;

public class Examples {
    public static void main(String[] args) {

        //TODO : The Optional class in Java 8 is a container that may or may not hold a value.
        // It was introduced to help avoid NullPointerException and to make your code more readable and expressive when dealing with potentially null values.

        //TODO :Key Concepts
        //  Presence or Absence: An Optional can either contain a value (present) or be empty (absent).
        //  Avoiding Null Checks: Instead of checking for null, you can use Optional to handle the absence of a value more gracefully.

        Optional<String> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);
        Optional<String> nonEmptyOptional = Optional.of("Hello");
        System.out.println(nonEmptyOptional.get());

        //different ways to create optional
        // 1.) empty optional
        Optional<String> opt = Optional.empty();

        //2.) non-empty optional
        Optional<String> opt1 = Optional.of("Hello");
        System.out.println(opt1);

        //3.) Nullable optional
        Optional<String> nullableOptional = Optional.ofNullable(null);
        System.out.println(nullableOptional);
        if(nullableOptional.isPresent()){
            System.out.println("Value present");
        }else{
            System.out.println("not present");
        }


        //how to use the above methods
        Optional<String> optional = Optional.of("Hello, World!");
        Optional<String> optional1 = Optional.empty();
        // Check if a value is present
        if (optional.isPresent()) {
            System.out.println(optional.get()); // Output: Hello, World!
        }

        // how to handle absence of value
        // You can provide a default value or an alternative action if the Optional is empty:

        // 1.) orElse: Returns the value if present, otherwise returns the default value.
        String value = optional.orElse("Default Value");
        System.out.println(value); // Output: Hello, World!

        //2.) orElseGet: Returns the value if present, otherwise invokes a supplier function.
        String value1 = optional1.orElseGet(() -> "Default Value");
        System.out.println(value1); // Output: Hello, World!

        //3.) orElseThrow: Throws an exception if the value is not present
        Optional<String> optional2 = Optional.empty();
        String value2 = optional2.orElseThrow(() -> new IllegalArgumentException("Value not present"));
        System.out.println(value2);

        // TODO What are the main methods provided by the Optional class?
        /* TODO Some key methods include:

            1.) isPresent(): Checks if a value is present.
            2.) ifPresent(Consumer<? super T> action): Executes the given action if a value is present.
            3.) orElse(T other): Returns the value if present, otherwise returns the provided default value.
            4.) orElseGet(Supplier<? extends T> other): Returns the value if present, otherwise invokes the provided supplier and returns the result.
            5.) orElseThrow(Supplier<? extends X> exceptionSupplier): Returns the value if present, otherwise throws an exception provided by the supplier.
        *
         */

        // TODO : What is the difference between Optional.of() and Optional.ofNullable()?
        //      Optional.of(value): Creates an Optional with the specified non-null value. Throws NullPointerException if the value is null.
        //      Optional.ofNullable(value): Creates an Optional that can hold a null value. If the value is null, it returns an empty Optional.

        // TODO : What are the benefits of using Optional?
        //          Reduces the risk of NullPointerException.
        //          Makes the code more readable and expressive.
        //          Encourages better handling of absent values.

    }
}
