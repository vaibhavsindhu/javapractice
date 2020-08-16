package ds.queue;

public interface Queue {
    void show();
    int getSize();
    void enQueue(int data);
    int deQueue();
    boolean isEmpty();
    boolean isFull();


}
