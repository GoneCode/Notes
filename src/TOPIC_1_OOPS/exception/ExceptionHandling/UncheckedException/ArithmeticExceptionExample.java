package ExceptionHandling.UncheckedException;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {

        //TODO:ArithmeticException
        //  Description: Occurs when an exceptional arithmetic condition has occurred, such as division by zero.
        try {
            int result = 50 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    }
}
