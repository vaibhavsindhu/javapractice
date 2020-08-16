package collection.set;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * TreeSet
 * -- underline DS is balanced tree
 * -- child class of SortedSet
 * -- No duplicates
 * -- Insertion order not preserved
 * -- sorted based on elements inserted --comparator(); method gives null if default sorting is used
 * -- heterogeneous not allowed
 * -- null allowed // from java 7 onwards
 */
public class TreeSetTest {
    public static void main(String[] args) {

        TreeSetTest treeSetTest = new TreeSetTest();
        // treeSetTest.TreeSetConstructors();
        treeSetTest.stringBufferExample();
        treeSetTest.testCompareTo();
    }

    public void TreeSetConstructors() {

        /**
         * 4 constructors
         */
        TreeSet treeSet = new TreeSet();  //default sorting

        Comparator c = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };


        TreeSet treeSet1 = new TreeSet(c);  // if we want to use user specific sort


        SortedSet sortedSet = new TreeSet();
        TreeSet treeSet2 = new TreeSet(sortedSet);  // use obj of sortedSet as param

        TreeSet treeSet3 = new TreeSet(treeSet1);   // pass collection obj

        treeSet.add("A"); // A->65
        treeSet.add("a");  // a->97
        treeSet.add("L");
        treeSet.add("Z");

        System.out.println(treeSet); //sorted
        System.out.println(treeSet.comparator());  // null as we used default sorting

        try {
            treeSet.add(1);
        } catch (ClassCastException e) {
            System.out.println("exception because we are trying to add integer");
            System.out.println(e.getMessage());
        }
        /**
         * If we add null after adding few elements we gets null pointer exception
         * If we add null as first element we won't get exception
         * Now if we add any other element after adding null then also we will get null pointer exception
         * So null can be added as only element in the TreeSet
         *
         */
        try {
            treeSet.add(null);
        } catch (NullPointerException e) {
            System.out.println("exception because we are trying to add null");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    /**
     * This gives "java.lang.ClassCastException: java.lang.StringBuffer
     * cannot be cast to java.lang.Comparable"
     * because StringBuffer class does not implement Comparable
     * --- If we are depending ond default natural sorting order then objects should be homogeneous
     * and comparable otherwise we'll get runtime exception saying classCastException
     * --- A object is called comparable only if its corresponding class implements comparable Interface
     * --- String class and all wrapper classes already implements comparable interface
     * -----In order to make this work we need to implement comparator methods
     * Compare --used for default natural sorting order
     * Comparator -- used for user defined sorting
     */
    public void stringBufferExample() {
        try {
            TreeSet treeSet = new TreeSet<>();
            treeSet.add(new StringBuffer("A"));
            System.out.println(treeSet);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // implement compare method by lambda
        // how to make this sorting work ..check this
        TreeSet treeSet1 = new TreeSet(
                (Object o1, Object o2) -> {
                    String i = o1.toString();
                    String j = o2.toString();
                    // we can use compareTo method inside our implementation
                    // reverse how compareTo implemented, compareTo implemented i.compareTo(j)
                    return i.compareTo(j);
                    //or
                    // return -i.compareTo(j);
                }
        );
        treeSet1.add(new StringBuffer("A"));
        treeSet1.add(new StringBuffer("L"));
        treeSet1.add(new StringBuffer("Z"));

        System.out.println("StringBuffers works now");
        System.out.println(treeSet1);

    }

    /**
     * How compareTo works
     */
    public void testCompareTo() {
        System.out.println("A".compareTo("Z")); //returns A-Z = -25
        System.out.println("Z".compareTo("A"));  //Z-A =25
        System.out.println("A".compareTo("A")); // A-A =0
        // System.out.println("A".compareTo(null)); // exception
    }
}
