package collection.set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * There are two ways to implement comparator interface.
 * 1: by using new class which implements comparator interface.
 * 2: or create class using lambda inside the constructor itself
 */
class MyComparator implements Comparator {

    // to implement our own sorting
    public int compare(Object o1, Object o2) {
        Integer i = (Integer) o1;
        Integer j = (Integer) o2;
        if (i < j) {
            return 1;
        } else if (i > j) {
            return -1;
        } else {
            return 0;
        }

    }
}

public class ImpComparotor {
    public static void main(String[] args) {


        ImpComparotor impComparotor = new ImpComparotor();
        impComparotor.lambdaExpressionImp();
        impComparotor.lambdaExpressionImp2();
        impComparotor.NormalImp();
    }

    public void NormalImp() {
        TreeSet newTree = new TreeSet<>();
        newTree.add(10);
        newTree.add(30);
        newTree.add(20);
        newTree.add(15);
        newTree.add(9);
        System.out.println("Natural sorting order");
        System.out.println(newTree);  //natural order

        /**
         * here we implement our sorting which is opposite to natural sorting
         * which is implemented in compareTo method of comparable interface
         */

        TreeSet newTree1 = new TreeSet(new MyComparator());
        newTree1.addAll(newTree);
        System.out.println("user defined sorting order");
        System.out.println(newTree1);  //Reverse the sorting order
    }

    /**
     * Implement comparator using Lambda expression
     * instead of implementing a separate class we can implement class inside constructor
     */

    public void lambdaExpressionImp() {

        TreeSet treeSet = new TreeSet(
                (Object o1, Object o2) -> {
                    Integer i = (Integer) o1;
                    Integer j = (Integer) o2;
                    if (i < j)
                        return 1;
                    else if (i > j)
                        return -1;
                    else
                        return 0;
                }
        );

        treeSet.add(2);
        treeSet.add(5);
        treeSet.add(9);
        treeSet.add(6);
        treeSet.add(10);
        treeSet.add(4);
        System.out.println("sorting using lambda");
        System.out.println(treeSet);
    }

    public void lambdaExpressionImp2() {

        TreeSet treeSet = new TreeSet(
                (Object o1, Object o2) -> {
                    Integer i = (Integer) o1;
                    Integer j = (Integer) o2;
                    // we can use compareTo method inside our implementation
                    // reverse how compareTo implemented, compareTo implemented i.compareTo(j)
                    return j.compareTo(i);
                    //or
                    // return -i.compareTo(j);
                }
        );

        treeSet.add(2);
        treeSet.add(5);
        treeSet.add(9);
        treeSet.add(6);
        treeSet.add(10);
        treeSet.add(4);
        System.out.println("sorting using lambda");
        System.out.println(treeSet);


        // OR

        TreeSet treeSet1 = new TreeSet(
                (Object o1, Object o2) -> {
                    Integer i = (Integer) o1;
                    Integer j = (Integer) o2;
                    return 0;
                }
        );
        treeSet1.addAll(treeSet);
        System.out.println("only first element will come if return 0 rest treated as duplicates");
        System.out.println(treeSet1);

        //OR


        TreeSet treeSet2 = new TreeSet(
                (Object o1, Object o2) -> {
                    Integer i = (Integer) o1;
                    Integer j = (Integer) o2;
                    return 1;
                }
        );
        treeSet2.add(6);
        treeSet2.add(3);
        treeSet2.add(9);
        treeSet2.add(1);
        treeSet2.add(6);
        System.out.println("insertions order preserved, as elements inserted one after another, dup also allowed");
        System.out.println(treeSet2);
    }
}
