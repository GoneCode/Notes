package CollectionsExamples.Queue.priorityqueue;

import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueueWithComparator {

    public static void main(String[] args) {

        //By default, a PriorityQueue in Java is a min-heap, meaning that the smallest element is at the top, and elements are ordered in ascending order.
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add elements to the priority queue
        minHeap.add(10);
        minHeap.add(5);
        minHeap.add(20);
        minHeap.add(15);

        // Remove elements (this will remove the smallest element first)
        System.out.println("Min-Heap: ");
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll()); // Will print elements in ascending order
        }

        /*
            Explanation of Min-Heap
        1.) The PriorityQueue<Integer> creates a min-heap by default.
        2.) When you add elements using add(), they are inserted into the heap.
        3.) When you call poll(), the smallest element (root of the heap) is removed and returned.

         */


        // Create a PriorityQueue (max-heap using custom comparator)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        // Add elements to the priority queue
        maxHeap.add(10);
        maxHeap.add(5);
        maxHeap.add(20);
        maxHeap.add(15);

        // Remove elements (this will remove the largest element first)
        System.out.println("Max-Heap: ");
        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll()); // Will print elements in descending order
        }

        /*
        Explanation of Max-Heap
            The PriorityQueue<Integer> is created with a custom comparator TOPIC_1.javaOOPSConcepts.Comparator.reverseOrder(), which orders the elements in descending order.
            When elements are added to the queue, they are ordered according to the comparator.
            Calling poll() removes and returns the largest element from the heap.
         */


    }
}
