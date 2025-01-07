package Java8.MethodReference;

public class MethodReferenceExample {
    public static void printMessage(String message){
        System.out.println(message);
    }

    public void print(String message){
        System.out.println(message);
    }

    public MethodReferenceExample() {
        System.out.println("Example Constructor Called");
    }

}
