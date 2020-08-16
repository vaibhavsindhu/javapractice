package collection.set;

import java.util.HashSet;

/**
 * HashSet
 * -- under line data structure is Hashtable
 * -- no duplicate allowed -- no error but add(); returns false
 * -- insertion order not preserved -- insert elements based on hashcode
 * -- heterogeneous allowed
 * -- null allowed
 * -- serializable and cloneable interface
 * -- best if search operation is frequent, as stores based on hashcode
 * -- initial capacity is 16
 * -- fill ratio/ load factor is 0.75 -- means will increase capacity once its 75% filled
 */
public class HashSetTest {
    public static void main(String[] args) {

        HashSet hashSet1 = new HashSet(); //default
        HashSet hashSet2 = new HashSet(20); //user specific capacity
        HashSet hashSet3 = new HashSet(20, 90); // user specific load factor
        HashSet hashSet4 = new HashSet(hashSet1);

        hashSet1.add("Z");
        hashSet1.add("B");
        hashSet1.add("E");
        hashSet1.add("D");
        hashSet1.add(10);  // heterogeneous data allowed
        hashSet1.add(null);  //null allowed
        hashSet1.add(null);  //null allowed only once
        System.out.println(hashSet1.add("D")); // no duplicate allowed
        System.out.println(hashSet1);  //insertion order not preserved


    }
}
