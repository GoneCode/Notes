package TOPIC_4.Algorithms.SearchingAlgorithms.LinearSearch;


public class LinearSearchExample {
    public static int linearSearch(int[] arr, int target) {
        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element matches the target
            if (arr[i] == target) {
                return i; // Return the index of the target
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        // Example array
        int[] numbers = {3, 5, 7, 9, 11};
        int target = 7;

        // Perform the linear search
        int result = linearSearch(numbers, target);

        // Print the result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
