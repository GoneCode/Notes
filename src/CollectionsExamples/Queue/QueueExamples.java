package CollectionsExamples.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {

         /* TODO  Queue is a interface                            Deque interface extends Queue interface
                  PriorityQueue implements Queue interface        LinkedList class implements Deque interface
                  PriorityBlockingQueue is thread safe.           ArrayDeque class implements Deque interface
         */


        /* TODO : The Queue is used to insert elements at the end of the queue and removes from the beginning of the queue. It follows FIFO concept.
             Basic queue operations - Enqueue, dequeue, peek, IsEmpty, size.
             queue operations
             1.) Enqueue - add(Object O) , offer(Object O)
             2.) dequeue - poll(), remove()
             3.) search - contains(Object O)
         */



        Queue<String> queue = new LinkedList<>();

        //1.) add element
        System.out.println("added elements");
        queue.add("First element");
        queue.add("hi");
        queue.add("hello");
        queue.offer("Inserted using offer method");
        System.out.println(queue);

        //2.) remove element - remove() - only removes element , doesn't return element.
        System.out.println("remove first element");
         queue.remove();
        System.out.println(queue);

        //3.) retrieve first element - peek(); - only retrieves but doesn't remove.
        System.out.println("retrieve first element");
        System.out.println(queue.peek());

        // 4.) poll in queue - retrieves and removes head element from queue
        System.out.println("Poll operation");
        System.out.println(queue.poll());
        System.out.println("After poll operation "+queue);

        //5.) search operation in queue using contains
        System.out.println(queue.contains("hello"));

        //6.)


    }
}
