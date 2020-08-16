package ds.queue;

public class QueueImp implements Queue {
    int queue[] = new int[5];
    int data;
    int front;
    int rear;
    int size;

    @Override
    public void show() {
        System.out.print("Queue : ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front+i)%5] + " ");
        }
        System.out.println();
        for(int x:queue){
            System.out.print(x +" ");
        }
        System.out.println();
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void enQueue(int data) {
        if(!isFull()) {
            queue[rear] = data;
            rear = (rear + 1) % 5;  //to make it circular queue % by list length
            size = size + 1;
        }else{
            System.out.println("queue is full");
        }
    }

    @Override
    public int deQueue() {
        if(!isEmpty()) {
            data = queue[front];
            front = (front + 1) % 5;
            size = size - 1;
        }else{
            System.out.println("queue is empty");
        }
        return data;
    }

    @Override
    public boolean isEmpty() {
        return getSize()==0;
    }

    @Override
    public boolean isFull() {
        return getSize()==5;
    }


}
