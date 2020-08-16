package datastructure.linkedlist;

public class RunnerTest {
    public static void main(String[] args) {

        LinkedListTest linkedList=new LinkedListTest();
        linkedList.insert(5);
        linkedList.show();
        linkedList.insert(4);
        linkedList.show();
        linkedList.insert(6);
        linkedList.show();
        linkedList.insertAt(2,7);
        linkedList.show();
        linkedList.insert(9);
        linkedList.show();
        linkedList.insertAt(0,2);
        linkedList.show();
        linkedList.insertAt(0,8);
        linkedList.show();
        linkedList.deleteAt(5);
        linkedList.show();
    }

}
