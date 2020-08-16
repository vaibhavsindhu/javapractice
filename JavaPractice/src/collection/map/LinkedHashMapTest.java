package collection.map;

import java.util.*;

/**
 * LinkedHashMap
 * -- same as HashMap
 * -- underline DS is HashTable+LinedList
 * -- synchronized
 * -- Insertion order preserved
 * -- no duplicate
 * -- no null allowed
 */
public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(100, "vaibhav");
        linkedHashMap.put(101, "ravi");
        linkedHashMap.put(102, "ravi");  // duplicate value allowed , keys not allowed to be duplicate
        linkedHashMap.put(99, "syam");

        // {100=vaibhav, 101=ravi, 102=ravi, 99=syam}
        System.out.println(linkedHashMap); // insertion order preserve...


    }


}
