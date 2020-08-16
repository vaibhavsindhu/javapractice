package collection.map;

import java.util.*;

/**
 * TreeMap(C)
 * -- DS is Red black tree
 * -- Insertion order not preserved
 * -- duplicate keys not allowed
 * -- dup values allowed
 * -- keys must homogeneous and need to be comparable
 * -- no restriction on values
 * -- if we are defining our own sorting using comparator then keys need to be homogeneous and
 * comparable objects also
 * -- null key not allowed
 */
public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap<>();
        //treeMap.put(null,"Z"); // null key not allowed

        treeMap.put(1, null);
        treeMap.put(2, null);  // null values allowed
        System.out.println(treeMap);

        // constructors
        //: 1
        TreeMap treeMap1 = new TreeMap<>();  // elements inserted by default sorting order
        //:2
        Comparator comparator = null;
        TreeMap treeMap2 = new TreeMap<>(comparator); //use comparator obj here for customized sorting order

        //3:
        TreeMap m = new TreeMap<>();
        TreeMap treeMap3 = new TreeMap(m);  // use Map obj here

        //4:

        TreeMap treeMap4 = new TreeMap(treeMap); // obj of sorted tree


        treeMap1.put(101, "ZZZ");
        treeMap1.put(103, "AAA");
        treeMap1.put(102, "BBB");
        treeMap1.put(105, "CCC");
        treeMap1.put(106, "XXX");
        System.out.println(treeMap1); //{101=ZZZ, 102=BBB, 103=AAA, 105=CCC, 106=XXX}

        TreeMap treeMap5 = new TreeMap(
                (Object o1, Object o2) -> {
                    Integer i = (Integer) o1;
                    Integer j = (Integer) o2;
                    return 1;
                }
        );

        treeMap5.put(101, "ZZZ");
        treeMap5.put(103, "AAA");
        treeMap5.put(102, "BBB");
        treeMap5.put(105, "CCC");
        treeMap5.put(106, "XXX");

        System.out.println(treeMap5);  // preserve insertion order as we gave comparator for customised sorting
    }


}
