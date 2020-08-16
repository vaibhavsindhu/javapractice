package ds.queue;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {

        QueueImp queueImp = new QueueImp();
    
        queueImp.deQueue();
        System.out.println("isEmpty before enqueue : "+queueImp.isEmpty());
        queueImp.enQueue(10);
        queueImp.enQueue(20);
        System.out.println("isEmpty after two enqueue : "+queueImp.isEmpty());
        System.out.println("isFull after two enqueue : "+queueImp.isFull());
        queueImp.enQueue(25);
        queueImp.enQueue(9);
        System.out.println("============queue after 4 enqueue================");
        queueImp.show();
        queueImp.deQueue();
        queueImp.deQueue();
        System.out.println("============queue after 2 dequeue================");
        queueImp.show();
        /**
         * we shifted the rear and front but not deleted the data...so if we print the queue
         * we'll get all the data
         * ...lets implement circular queue
         */
        System.out.println("============queue after 2 more enqueue================");
        queueImp.enQueue(8);
        queueImp.enQueue(2);
        queueImp.enQueue(5);
        System.out.println("size : "+queueImp.getSize());
        System.out.println("isFull after 5 enqueue : "+queueImp.isFull());
        queueImp.enQueue(3);//it becomes circular queue
        queueImp.show();
        System.out.println("size : "+queueImp.getSize());
    }

}
