package javaOOPSConcepts.String.methods;

public class M05EqualsIgnoreCase {
    public static void main(String[] args) {

        //TODO : Description: Compares two strings for equality, ignoring case differences.
        String str1 = "Hello";
        String str2 = "hello";
        boolean isEqual = str1.equalsIgnoreCase(str2); // isEqual is true
        System.out.println(isEqual);

    }
}
