package CollectionsExamples.Queue.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExamples {
    public static void main(String[] args) {
        // Create a Deque using ArrayDeque
        Deque<String> deque = new ArrayDeque<>();

        // Add elements to the front and back of the deque
        deque.addFirst("Alice");
        deque.addLast("Bob");
        deque.addFirst("Charlie");
        deque.addLast("David");

        // Print the deque
        System.out.println("Deque after additions: " + deque); // Output: [Charlie, Alice, Bob, David]

        // Access elements from both ends
        System.out.println("First element: " + deque.getFirst()); // Output: Charlie
        System.out.println("Last element: " + deque.getLast());   // Output: David

        // Remove elements from both ends
        System.out.println("Removed from front: " + deque.removeFirst()); // Output: Charlie
        System.out.println("Removed from back: " + deque.removeLast());   // Output: David

        // Print the deque after removals
        System.out.println("Deque after removals: " + deque); // Output: [Alice, Bob]

        // Peek at the front and back
        System.out.println("Peek front: " + deque.peekFirst()); // Output: Alice
        System.out.println("Peek back: " + deque.peekLast());  // Output: Bob
    }
}

