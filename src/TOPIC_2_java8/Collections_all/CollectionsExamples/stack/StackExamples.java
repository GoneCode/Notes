package CollectionsExamples.stack;

import java.util.Stack;

public class StackExamples {

    public static void main(String[] args) {

        /*
        TODO:
             Stack is a data structure which works on LIFO principle
             Stack operations - Push, pop, peek, search, isEmpty.
             Stack extends Vector class and methods are also inherited.
             Operations in Stack
             1.) insert - push(Object O), add(Object O),
             2.) delete - pop() ,remove()
             3.) search - search(Object O), get(int index), peek
             4.) update - set(int index,Object O)


         */

        Stack<String> stk = new Stack<>();
        // 1.) insert operations
            //a.) add method
            stk.add("hi");
            stk.add("hello");
            stk.add("Joker");
            stk.add("Batman");
            System.out.println(stk);

            //b.) push method
            stk.push("push method");
            System.out.println(stk);

        //2.) delete operations
            //a.) pop() method
            stk.pop();
            System.out.println(stk);

            //b.) remove method - removes particular element.
            stk.remove("hi");
            System.out.println(stk);

        //3.) search operations in  stack
            //a.) search method - give the element to search
            System.out.println(stk.search("Batman")); // --returns '1' if found or else '-1'.
            //b.) get method - give the index and it returns the element.
            System.out.println(stk.get(1));
            // c.) peek method - returns top of the stack
            System.out.println(stk.peek());
            //stk.setSize(100);
            System.out.println(stk.size());

        //4.) Update operation
             //a.) set method - replace the element in stack
             stk.set(2,"Replaced");
             stk.trimToSize();
             System.out.println(stk);




    }
}
