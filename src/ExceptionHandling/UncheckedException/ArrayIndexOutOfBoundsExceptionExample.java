package ExceptionHandling.UncheckedException;

public class ArrayIndexOutOfBoundsExceptionExample {

    // TODO: Description: Occurs when trying to access an array element with an invalid index.
        public static void main(String[] args) {
            int[] arr = new int[5];
            try {
                arr[10] = 50; // This will throw ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
            }
        }
}
