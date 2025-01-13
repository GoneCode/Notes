package CollectionsExamples.Queue.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueueWithInitialCapacity {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(10);
        pq.add(100);
        //add 10 elements
        pq.add(100);pq.add(100);pq.add(100);pq.add(100);pq.add(100);pq.add(100);pq.add(100);pq.add(100);pq.add(100);pq.add(100);pq.add(100);
        System.out.println(pq);
    }

}
