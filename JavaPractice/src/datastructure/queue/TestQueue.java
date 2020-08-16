package datastructure.queue;

public class TestQueue {
    public static void main(String[] args) {

        System.out.println("################## Queue implementation using Array ################");
        QueueUsingArray queueUsingArray=new QueueUsingArray();
        queueUsingArray.enQueue(3);
        queueUsingArray.enQueue(4);
        queueUsingArray.enQueue(6);
        queueUsingArray.enQueue(8);
        queueUsingArray.enQueue(9);
        System.out.println("Size of queue :"+ queueUsingArray.size());
        queueUsingArray.enQueue(5);
        queueUsingArray.showQueue();
        queueUsingArray.deQueue();
        queueUsingArray.deQueue();
        queueUsingArray.deQueue();
        queueUsingArray.showQueue();

        System.out.println("################## Queue implementation using LinkedList ################");
        QueueUsingLinkedList queueUsingLinkedList=new QueueUsingLinkedList();
        queueUsingLinkedList.enQueue(7);
        queueUsingLinkedList.enQueue(3);
        queueUsingLinkedList.enQueue(6);
        queueUsingLinkedList.show();
        queueUsingLinkedList.deQueue();
        queueUsingLinkedList.show();
    }
}
