package CollectionsExamples.Hashtable;

import java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args) {


        // Create a Hashtable
        Hashtable<String, String> table = new Hashtable<>();

        // Insert key-value pairs
        table.put("1", "One");
        table.put("2", "Two");
        table.put("3", "Three");

        // Display the Hashtable
        System.out.println("Hashtable: " + table);
    }
}
