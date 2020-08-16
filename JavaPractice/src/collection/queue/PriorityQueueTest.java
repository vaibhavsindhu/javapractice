package collection.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        /**
         * 1: constructor
         * creates an empty priority queue with default capacity=11
         * all objects inserted in default N S O
         */
        PriorityQueue queue = new PriorityQueue();

        /**
         * 2: constructor
         * user defined capacity
         */
        PriorityQueue queue1 = new PriorityQueue(20); // 20 initial capacity

        /**
         * 3: constructor
         * user defined capacity
         * user defined comparator
         */
        PriorityQueue queue3 = new PriorityQueue(20,
                (Object o1, Object o2) -> {
                    String s1 = (String) o1;
                    String s2 = o2.toString();
                    return s2.compareTo(s1);
                }
        );
        /**
         * 4:
         * using sorted set obj
         */
        // PriorityQueue queue4 = new PriorityQueue(SortedSet s);
        //
        /**
         * 5:
         * using collection set obj
         */
        // PriorityQueue queue4 = new PriorityQueue(Collection c);

        /**
         * Implementation of methods:
         */


        System.out.println(queue.peek()); //null
        //  System.out.println(queue.element()); //java.util.NoSuchElementException

        for (int i = 0; i < 10; i++) {
            queue.offer(i);
        }
        System.out.println(queue);  //print queue [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println(queue.poll()); //remove first element and return
        System.out.println(queue); // [1, 3, 2, 7, 4, 5, 6, 9, 8]

        PriorityQueueTest test = new PriorityQueueTest();
        test.ownPriority();
    }

    /**
     * use our own sorting ordering
     */
    public void ownPriority() {
        PriorityQueue queue = new PriorityQueue();

        queue.offer("A");
        queue.offer("D");
        queue.offer("B");
        queue.offer("C");
        System.out.println(queue);  //default order


        PriorityQueue queue3 = new PriorityQueue(20,
                (Object o1, Object o2) -> {
                    String s1 = (String) o1;
                    String s2 = o2.toString();
                    return s2.compareTo(s1);
                }
        );

        queue3.addAll(queue);
        System.out.println(queue3);  // user defined order

    }
}
