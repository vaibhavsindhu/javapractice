package collection.map;

import java.util.*;

/**
 * Child class of hash interface.
 * It based on HashTable
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(100, "vaibhav");
        hashMap.put(101, "ravi");
        hashMap.put(102, "ravi");  // duplicate value allowed , keys not allowed to be duplicate
        hashMap.put(99, "syam");

        System.out.println(hashMap);  // insertion order not preserved ..{99=syam, 100=vaibhav, 101=ravi, 102=ravi}

        System.out.println(hashMap.put(100, "sohan")); // replace vaibhav with sohan and return vaibahv

        String s = (String) hashMap.get(100);
        System.out.println(s);

        Set keySet = hashMap.keySet();  // it returns set of keys
        System.out.println(keySet);     // print all the keys ..[100, 101, 102, 103]

        Collection c = hashMap.values();
        System.out.println(c);  // returns collection of values ... [sohan, ravi, ravi, syam]

        Set entrySet = hashMap.entrySet();
        System.out.println(entrySet);

        // its a set so put Iterator to navigate through
        Iterator itr = entrySet.iterator();
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();  // cast to Map.entry
            System.out.println(entry.getKey() + " ....." + entry.getValue()); //print key value
            if (entry.getKey().equals(100)) {
                entry.setValue("vaibhav");  //replace value at key=100 with vaibhav
            }
        }
        System.out.println(hashMap);


        System.out.println(hashMap.remove(100));  // remove value at 100 and return it back
        System.out.println(hashMap);
        hashMap.clear();
        System.out.println(hashMap); //removes all key and values

        HashMapTest hashMapTest = new HashMapTest();
        hashMapTest.oneKeyMultipleValues();

    }

    //How can you store multiple values with one key

    public void oneKeyMultipleValues() {
        HashMap<String, List<String>> map = new HashMap();

        List<String> classNameList = new ArrayList<String>();
        classNameList.add("nursery");
        classNameList.add("prep");
        classNameList.add("first");

        List<String> studentsList = new ArrayList<String>();
        studentsList.add("Ravi");
        studentsList.add("mohan");
        studentsList.add("syam");
        studentsList.add("navin");
        studentsList.add("kavi");
        studentsList.add("amit");
        studentsList.add("sumit");

        map.put("classes", classNameList);
        map.put("students", studentsList);

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String classes = entry.getKey();
            List<String> students = entry.getValue();
            // System.out.println("classes : " + classes);
            //System.out.println("values : " + students);

            System.out.println(classes + " : " + students);

        }

    }


}
