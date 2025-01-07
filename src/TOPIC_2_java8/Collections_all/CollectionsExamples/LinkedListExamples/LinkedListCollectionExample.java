package TOPIC_2_java8.Collections_all.CollectionsExamples.LinkedListExamples;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListCollectionExample {

    // TODO - Linked List class implements List interface and Deque interface.

    // TODO - methods in linked list
    // TODO - a.) insert  -- add(Object O) , add(int index,Object O),  addLast(Object O) , offer(Object O) , offerFirst(Object O), OfferLast(Object O),push(Object O)
    // TODO - b.) search operation - element(), get(int index), getFirst(), getLast(), indexOf(Object O), lastIndexOf(Object O), peek() , peekFirst(), peekLast(),
    // TODO - c.) delete operation - poll() , pollFirst() , pollLast(),remove(), remove(int index), remove(Object O), removeFirst(),  removeFirstOccurrence(Object O),removeLast(),
    // TODO -                        //removeLastOccurrence().
    // TODO - d.) update operation - set(int index,E Element)


    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();
        //1.) add element ----- Linkedlist operations - O(1)
        ll.add("Joker");
        ll.add("Hello");
        ll.add("Hi");
        ll.add("batman");
        ll.add("Joker");

        // 2.) add element ---- Linkedlist operations - O(n)
        ll.add(2,"Added at index");
        System.out.println(ll);

        //3.) addFirst method - add the beginning of Linked list --- Linkedlist operations - O(1)
        ll.addFirst("Added at beginning");
        System.out.println(ll);

        //4.) addLast method - add at the end of Linked list --- Linkedlist operations - O(n)
        ll.addLast("Added at the last of LL");
        System.out.println(ll);


        //5.) clone the linked list using clone method
        Object clonedLL = ll.clone();
        System.out.println(clonedLL);

        //6.) element method - returns the head of the linked list - Linkedlist operations - O(1)
        System.out.println(ll.element());

        //7.) search operation using get(int index) - returns the value based on index - Linkedlist operations - O(n)
        System.out.println(ll.get(2));

        //8.) search operation using getFirst() - returns the first element from ll -- Linkedlist operations - O(1)
        System.out.println(ll.getFirst());

       // 9.) search operation using getLast() - returns the last element from ll - Linkedlist operations - O(1)
        System.out.println(ll.getLast());

        //10.) Search operation using indexOf() - returns the first occurance of the specified element - Linkedlist operations - O(n)
        System.out.println(ll.indexOf("Hi"));

        //11.) Search operation using lastIndexOf() - returns the last occurance of specified element - Linkedlist operations - O(n)
        System.out.println(ll.lastIndexOf("Joker"));

        //12.) ListIterator for linkedlist
        ListIterator list_itr = ll.listIterator(0);
        while(list_itr.hasNext()){
            System.out.println(list_itr.next());
        }

        //13.) offer method in linked list is to add element
        ll.offer("Offer method in linked list to insert element");
        System.out.println(ll);

        // 14.) offerFirst method in linked list to insert element at beginning of the linked list
        ll.offerFirst("offerFirst is a method to insert element at beginning of linked list");
        System.out.println(ll);

        //15.) offerLast is a method in linked list to insert element at the end of linked list
        ll.offerLast("offerLast is a method to insert element at End of linked list");
        System.out.println(ll);

        //16.) peek is a method in linked list to retrive the first element of linked list
        System.out.println("peek method - "+ll.peek());
        System.out.println("peekFirst method - - "+ll.peekFirst());
        System.out.println("PeekLast method - - "+ll.peekLast());

        //17.) poll is a method in linked list to remove the head of the list
        System.out.println("Poll method - "+ll.poll());
        System.out.println(ll);

        // 18.) pollFirst() - it removes the head of the list
        System.out.println("PollFirst method - "+ll.pollFirst());
        System.out.println(ll);

        //19.) pollLast - it removes the last element from list
        System.out.println("PollLast method - "+ll.pollLast());
        System.out.println(ll);

        //20.) pop() - it removes element based on stack
        System.out.println("pop method - "+ll.pop());
        System.out.println(ll);

        //21.) push() - it adds the element as added into stack
        ll.push("Pushed using push operation");
        System.out.println(ll);

        //22.) remove operations -- removes head element
        System.out.println(ll.remove());
        System.out.println(ll);

        //23.) remove(int index) -- remove based on index
        System.out.println(ll.remove(1));
        System.out.println(ll);

        //24.) removeFirst() -- remove the element from list
        System.out.println(ll.removeFirst());
        System.out.println(ll);

        // 25.) removeFirstOccurance(Object O) remove first occurance of given Object
        System.out.println(ll.removeFirstOccurrence("Joker"));
        System.out.println(ll);





    }
}
