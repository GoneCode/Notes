package Java8.DefaultMethods;

public class Examples implements Vehicle{
    public static void main(String[] args) {

        /* TODO :
            What are Default Methods?
            Before Java 8, interfaces could only have abstract methods (methods without a body).
            With Java 8, you can now include methods with a body in interfaces using the default keyword.
            These methods are called default methods.

            TODO Default methods help in:
                 Adding new methods to interfaces without affecting the classes that implement these interfaces.
                 Providing a default implementation that can be used by all implementing classes unless they choose to override it.

            TODO : we can override default methods.
                   Default methods in Java 8 allow you to add new functionality to interfaces without breaking existing code.

            */
        Examples e = new Examples();
        e.start();
        e.stop();
    }

    @Override
    public void start() {
        System.out.println("bike started");
    }
    @Override
    public void stop() {
        System.out.println("bike is stopping");
    }
}
