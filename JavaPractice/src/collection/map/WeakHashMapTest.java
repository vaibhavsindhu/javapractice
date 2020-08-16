package collection.map;

import java.util.HashMap;
import java.util.WeakHashMap;

/**
 * WeakHashMap
 * -- It is same as HashMap except the following difference
 * in the case of HashMap even obj does not have any reference it is not eligible for GC
 * if it is associated with HashMap...HashMap dominates GC
 * --But in the case of WeakHashMap, if obj doesn't contain any references it is eligible for GC
 * even though obj is associated with weakHashMap....GC dominates WeakHashMap
 */
public class WeakHashMapTest {
    public static void main(String[] args) throws InterruptedException {
        Temp temp = new Temp();
        HashMap hashMap = new HashMap();
        hashMap.put(temp, "vaibhav");
        System.out.println(hashMap);
        temp = null;   //making null to Temp's obj
        System.gc();   // calling GarbageCollection
        Thread.sleep(5000);
        System.out.println(hashMap);  // GC does not delete obj as HashMap is stronger than GC


        // Try to use WeakHashMap

        System.out.println("********** Using WeakHashMap here to delete obj ********");

        Temp t = new Temp();
        WeakHashMap weakHashMap = new WeakHashMap();
        weakHashMap.put(t, "Ravi");
        System.out.println(weakHashMap);
        t = null;   //making null to Temp's obj
        System.gc();   // calling GarbageCollection, and this time it called
        Thread.sleep(5000);
        System.out.println(weakHashMap);  // This time GC delete obj as WeakHashMap is weak than GC

    }
}

class Temp {
    public String toString() {
        return "temp";
    }


    public void finalize() {
        System.out.println("finalize called");
    }
}
