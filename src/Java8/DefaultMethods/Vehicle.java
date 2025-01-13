package Java8.DefaultMethods;

public interface Vehicle {

    void start();
    default void stop(){
        System.out.println("");
    }
}
