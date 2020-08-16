package collection.map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapTest {
    public static void main(String[] args) {
        IdentityHashMapTest iMap = new IdentityHashMapTest();
        iMap.Implementations();
        iMap.testMaps();

    }

    /**
     * Difference b/w "==" and ".equals"
     * "==" =>       it compares based on references
     * ".equals" =>  it compares content
     */
    public void Implementations() {
        Integer i = new Integer(10);
        Integer j = new Integer(10);

        System.out.println(i == j);  // false as both have diff address
        System.out.println(i.equals(j));  //true as content is same
    }

    /**
     * HashMap implements key compare based on .equals(value) and return true and replace old value
     * IdentityHashMap implements key compare based on ==(address) and return false and create new key,value pair
     */
    public void testMaps() {
        HashMap hashMap = new HashMap();
        Integer i = new Integer(10);
        Integer j = new Integer(10);
        hashMap.put(i, "vaibhav");
        hashMap.put(j, "Syam");
        System.out.println(hashMap); // based on .equals (value) so treat both equals

        IdentityHashMap identityHashMap = new IdentityHashMap();
        Integer k = new Integer(10);
        Integer m = new Integer(10);
        identityHashMap.put(k, "vaibhav");
        identityHashMap.put(m, "Syam");
        System.out.println(identityHashMap); // based on "=="


    }
}
