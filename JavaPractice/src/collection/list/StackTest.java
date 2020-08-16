package collection.list;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();

        System.out.println(stack.empty());
        System.out.println(stack.capacity()); // 10 is original capacity
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        System.out.println(stack);
        stack.push("A");
        System.out.println(stack.capacity()); // now double the capacity

        System.out.println("Peek is : " + stack.peek());  //just get top element no removal
        System.out.println(stack.search("A"));
        System.out.println(stack.empty());
        stack.pop();                // remove top
        System.out.println(stack);
        System.out.println("Now Peek is : " + stack.peek());  //=9
        System.out.println(stack.search("A"));    // == -1 as no A now
    }
}
