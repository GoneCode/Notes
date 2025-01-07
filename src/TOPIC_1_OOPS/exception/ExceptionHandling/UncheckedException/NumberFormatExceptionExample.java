package ExceptionHandling.UncheckedException;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        String str = "abc";
        try {
            int num = Integer.parseInt(str); // This will throw NumberFormatException
             } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }
    }
}
