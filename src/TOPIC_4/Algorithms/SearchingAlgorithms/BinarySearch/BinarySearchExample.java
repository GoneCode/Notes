package TOPIC_4.Algorithms.SearchingAlgorithms.BinarySearch;

public class BinarySearchExample {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Prevents overflow

            // Check if the middle element is the target
            if (arr[mid] == target) {
                return mid; // Target found
            }

            // Narrow down the search range
            if (arr[mid] < target) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14}; // Sorted array
        int target = 8;

        // Perform binary search
        int result = binarySearch(numbers, target);

        // Print the result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
