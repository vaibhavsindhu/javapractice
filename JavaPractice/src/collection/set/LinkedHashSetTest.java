package collection.set;


import java.util.LinkedHashSet;

/**
 * LinkedHashSet
 * -- Its child class of HashSet
 * -- Same as HashSet but Insertion order preserved
 * -- underline data structure is hybrid - combination of LinkedList and Hashtable
 * This implementation is best for cache based application where duplicates are not allowed
 * and order should be preserved
 */
public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet<>(); //default


        linkedHashSet.add("Z");
        linkedHashSet.add("B");
        linkedHashSet.add("E");
        linkedHashSet.add("D");
        linkedHashSet.add(10);  // heterogeneous data allowed
        linkedHashSet.add(null);  //null allowed
        System.out.println(linkedHashSet.add("D")); // no duplicate allowed
        System.out.println(linkedHashSet);  //insertion order  preserved
    }
}
