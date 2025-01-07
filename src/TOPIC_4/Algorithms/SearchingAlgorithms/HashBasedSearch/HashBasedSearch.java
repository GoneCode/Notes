package TOPIC_4.Algorithms.SearchingAlgorithms.HashBasedSearch;

import java.util.HashMap;

public class HashBasedSearch {

    public static void main(String[] args) {
        // Create a HashMap to store key-value pairs
        HashMap<Integer, String> students = new HashMap<>();

        // Add some data to the HashMap
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");
        students.put(104, "Diana");

        // Search for a student by their ID
        int targetId = 103;
        if (students.containsKey(targetId)) {
            System.out.println("Student found: " + students.get(targetId));
        } else {
            System.out.println("Student not found");
        }

        // Example of searching for a non-existent key
        int nonExistentId = 105;
        if (students.containsKey(nonExistentId)) {
            System.out.println("Student found: " + students.get(nonExistentId));
        } else {
            System.out.println("Student not found");
        }
    }
}
