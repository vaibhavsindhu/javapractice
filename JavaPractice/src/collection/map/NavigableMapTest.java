package collection.map;

import java.util.TreeMap;
import java.util.TreeSet;

public class NavigableMapTest {
    public static void main(String[] args) {
        TreeMap<String, String> tree = new TreeMap<>();
        tree.put("A", "Apple");
        tree.put("B", "Banana");
        tree.put("C", "Cat");
        tree.put("D", "Dog");
        tree.put("E", "Elephant");
        tree.put("F", "Fish");
        System.out.println(tree);
        System.out.println("Lower : " + tree.lowerKey("C"));
        System.out.println("Floor : " + tree.floorKey("C"));
        System.out.println("Higher : " + tree.higherKey("D"));
        System.out.println("Ceiling : " + tree.ceilingKey("D"));
        System.out.println("pollFirst : " + tree.pollFirstEntry());
        System.out.println("pollLast : " + tree.pollLastEntry());
        System.out.println("descending : " + tree.descendingMap());
    }

}
