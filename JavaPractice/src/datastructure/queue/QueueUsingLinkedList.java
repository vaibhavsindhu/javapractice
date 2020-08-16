package datastructure.queue;

import datastructure.linkedlist.LinkedListTest;
import datastructure.linkedlist.Node;
import ds.linkedlist.LinkedList;

public class QueueUsingLinkedList {
    LinkedListTest list=new LinkedListTest();

    public void enQueue(int data){
        // Node newNode=list.createNode(data); //create new node with data and null link
        list.insertAt(LinkedListTest.rear,data);
    }
    public void deQueue(){
        list.deleteAt(0);
    }
    public void show(){
        list.show();
    }
}
