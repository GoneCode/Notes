package ExceptionHandling.UncheckedException;

public class ClassCastExceptionExample {

    //TODO : Description: Occurs when an attempt is made to cast an object to a subclass of which it is not an instance.
    public static void main(String[] args) {
        Object obj = new Integer(100);
        try {
            String str = (String) obj; // This will throw ClassCastException
        } catch (ClassCastException e) {
            System.out.println("ClassCastException caught: " + e.getMessage());
        }
    }
}
