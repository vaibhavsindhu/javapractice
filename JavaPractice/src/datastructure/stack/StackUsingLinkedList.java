package datastructure.stack;

import datastructure.linkedlist.LinkedListTest;
import datastructure.linkedlist.Node;

public class StackUsingLinkedList {
    LinkedListTest list=new LinkedListTest();
    Node top;

    public void push(int data){
       // Node newNode=list.createNode(data); //create new node with data and null link
        list.insertAtStart(data);
    }
    public void pop(){
        list.deleteAt(0);
    }
    public void show(){
        list.show();
    }

}
