package ds.linkedlist;

public class Runner {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insertAtStart(25);
        ll.insertAt(0,33);
        ll.deleteAt(3);
        ll.show();

    }
}
