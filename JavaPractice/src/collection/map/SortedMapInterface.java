package collection.map;

import java.util.*;

/**
 * ex..
 * <p>
 * 101--A
 * 102--B
 * 103--C
 * 104--D
 * 105--E
 * 106--F
 */
public interface SortedMapInterface {
    Object firstKey();   //101--A

    Object lastKey();   //106--F

    //less than the given key
    SortedMap headMap(Object toKey); // SortedMap headMap(104); ...{101--A,102--B,103--C}

    // >= given value
    SortedMap tailMap(Object fromKey);// SortedMap tailMap(104); ...{104--D,105--E,106--F}

    SortedMap subMap(Object fromKey, Object toKey); //SortedMap subMap(103,106);.. {103--C,104--D,105--E}

    Comparator comparator(); //null

}
