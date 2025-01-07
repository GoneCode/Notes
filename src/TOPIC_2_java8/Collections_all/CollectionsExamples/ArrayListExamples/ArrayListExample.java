package CollectionsExamples.ArrayListExamples;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {

    // TODO ArrayList class implements implements List interface and extends AbstractList

    // TODO - methods in ArrayList.
    // TODO - a.) insert -- add(Object O) , add(int index,Object O).
    // TODO - b.) search operation - contains(Object O), get(int index), indexOf(Object O), lastIndexOf(Object O).
    // TODO - c.) delete operation - remove() , remove(Object O),
    // TODO - d.) update operation - set(int index,E Element)

    public static void main(String[] args) {

        ArrayList<String> strList = new ArrayList<>();

        //1.)adding into arraylist -- Linkedlist operations - O(1)
        strList.add("Hello");
        strList.add("hi");
        strList.add("Joker");
        strList.add("hi");
        System.out.println(strList);

        // 2.) removing from arraylist ---Linkedlist operations - O(n)
        //strList.remove("Hello");
       // System.out.println(strList);

        //3.)removing from arraylist using index  -- Linkedlist operations - O(n)
        strList.remove(1);
        System.out.println(strList);

        //4.)update the arraylist using index --- Linkedlist operations - O(n)
        strList.set(1,"batman");
        System.out.println(strList);

        //5.)add element at a particular index  -- Linkedlist operations - O(n)
        strList.add(1,"hi");
        System.out.println(strList);

        //6.) search operation using contains(Object O) (pass value - returns true or false)  --- Linkedlist operations - O(n)
        System.out.println(strList.contains("Hello"));

        //7.) search operation using get(int index) method (pass index - returns value of the index) --  Linkedlist operations - O(n)
        System.out.println(strList.get(0));

        // 8.) search operation using indexOf(Object O) method (pass value - returns index of the given value)  --- Linkedlist operations - O(n)
        System.out.println(strList.indexOf("batman"));

        // 9.) search operation using lastIndexOf(Object O) method (pass value - returns last index of the given value) ---  Linkedlist operations - O(n)
        System.out.println(strList.lastIndexOf("hi"));

        // 10.) get the length of arrayList   --- Linkedlist operations - O(n)
        System.out.println(strList.size());


        //11.) convert an arraylist to array using toArray() method
        System.out.println(Arrays.toString(strList.toArray()));

        strList.add(null);
        System.out.println(strList);



    }

}
