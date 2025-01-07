package Java8.LambdaExpressions;

import java.util.Arrays;
import java.util.List;

public class Examples {

    public static void main(String[] args) {

        /* TODO: lambda expression is a way to create small, anonymous functions(function without name) in java.
            They are used primarily to define the behavior of functional interfaces (interfaces with a single abstract method).
            basic syntax
            (parameters) -> expression
        */

        //before java 8
        //if we want to create a thread that prints hello world
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("HELLO WORLD");
            }
        };
        new Thread(runnable).start();

        // After java 8
        Runnable runnable1 = ()->System.out.println("HELLO WORLD 2");
        new Thread(runnable1).start();

        //before java 8
        List<String> names = Arrays.asList("Apple","Mango","banana");
        for(String name:names){
            System.out.println(name);
        }

        //after java 8
        names.forEach(System.out::println);

        
    }
}
