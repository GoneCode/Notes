package ExceptionHandling.CheckedException;

public class ClassNotFoundException extends Throwable {
    public static void main(String[] args) {

        //TODO  : Description: Occurs when an application tries to load a class through its string name but no definition for the class with the specified name could be found.

        try {
            Class.forName("com.example.NonExistentClass");
        } catch (java.lang.ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }
}
