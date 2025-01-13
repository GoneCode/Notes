package CollectionsExamples.Queue.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {

        /*TODO :
           Queue follows FIFO principle.
           but sometimes elements of queue needs to be processed according to priority thats why we need priority queue.
           features of priority queue
                1.)  priority queue doesn't permit null
             Priority queue operations
             1.) Enqueue - add(Object O) , offer(Object O) -- O(logn)
             2.) dequeue - poll(), remove() --- O(logn)
             3.) search - contains(Object O) ---
             4.) peek - returns the root element without modifying the heap. -- O(1)
         */

        PriorityQueue<Integer>  pq = new PriorityQueue<>();
        pq.add(9);
        pq.add(10);
        pq.add(1);
        System.out.println(pq);
    }
}
