package datastructure.stack;

import java.util.EmptyStackException;

public class StackUsingArray {
    int[] stack = new int[5];
    int top = 0;

    public void push(int data) {
        System.out.println("pushing : " + data);
        if (isFull()) {
            System.out.println("Stack is full now");
        } else {
            stack[top] = data;
            top++;
            System.out.println("Top is : " + top + " : now");
        }
    }

    public int pop() {
        int data = 0;
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("removing top element : " + stack[top - 1]);
            data = stack[top - 1];
            top--;
            stack[top] = 0;
        }
        return data;

    }

    public int peek() {
        return stack[top - 1];
    }

    public void showStack() {
        System.out.print("Stack is : ");
        for (int element : stack) {
            System.out.print(element + "  ");
        }
        System.out.println();
    }

    public boolean isFull() {
        return top == stack.length;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void reverse(int[] list){
        for(int i=0;i<=list.length-1;i++){
            push(list[i]);
        }
        showStack();
        for(int i=0;i<=list.length-1;i++){
            System.out.println(pop());
        }
    }
}
