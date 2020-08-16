package collection.queue;

public interface QueueInterface {
    public void offer(Object o);

    public Object poll();

    public int remove();

    public int peek();

    public int element();

}
