package Algorithms.SearchingAlgorithms.JumpSearch;

public class JumpSearch {
    // Function for Jump Search
    public static int jumpSearch(int[] arr, int target) {
        int n = arr.length;
        int step = (int) Math.sqrt(n);  // Step size is sqrt(n)
        int prev = 0;

        // Jump forward while the target is greater than the element at the current position
        while (arr[Math.min(step, n) - 1] < target) {
            prev = step;
            step += (int) Math.sqrt(n);
            if (prev >= n) {
                return -1; // If we've passed the end of the array
            }
        }

        // Perform a linear search within the block
        for (int i = prev; i < Math.min(step, n); i++) {
            if (arr[i] == target) {
                return i; // Target found
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21};
        int target = 15;

        // Perform Jump Search
        int result = jumpSearch(arr, target);

        // Print the result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
