package datastructure.queue;

public class QueueUsingArray {
    int[] queue = new int[5];
    int front;
    int rear;

    public void enQueue(int data) {
        if (isFull()) {
            System.out.println("queue is full");
        } else {
            queue[rear] = data;
            rear++;
        }
    }

    public void deQueue() {
        front++;
    }

    public int poll() {
        return queue[front];
    }

    public boolean isEmpty() {
        return size() < 1;
    }

    public void showQueue() {
        System.out.print("Queue : ");
//        for(int element: queue){
//            System.out.print(element+ "  ");
//        }
        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + "  ");
        }
        System.out.println();
    }

    public boolean isFull() {
        return rear == queue.length;
    }

    public int size() {
        return queue.length;
    }
}
