package datastructure.linkedlist;

public class LinkedListTest {
    Node head; //always point to the head
    public static int rear=0; // this will be used for queue implementation using linkedList ...no use for linkedlist

    public Node createNode(int data) {
        System.out.println("Adding new node : " + data);
        Node node = new Node();
        node.data = data;
        node.next = null;
        return node;
    }

    public void insert(int data) {
        Node newNode = createNode(data);
        if (isEmpty()) //list is empty
        {
            head = newNode;

        } else {
            Node n = head;   //to traverse
            while (n.next != null) {
                n = n.next;
            }
            n.next = newNode;  //traverse till the end and put lat node in the end

        }
    }

    public void insertAt(int index, int data) {
        System.out.println("Adding new node at index : " + index);
        Node newNode = createNode(data);
        if (index == 0) {
            insertAtStart(data);
            rear++; //increment to get end of queue
        } else {
            Node n = head;
            for (int i = 1; i < index; i++) {
                n = n.next;
            }
            newNode.next = n.next;   //first break the link b/w 2-3
            n.next = newNode; //assign new node to n's next
            rear++; //increment to get end of queue
        }
    }

    public void insertAtStart(int data) {
        System.out.println("Inserting at start");
        //Creating new node and now new node will point where head pass pointing ,head will point to new node
        Node newNode = createNode(data);
        newNode.next = head;
        head = newNode;

    }

    /**
     * delete first node.....
     * point head to second node of the list
     *
     * @param index
     */
    public void deleteAt(int index) {
        System.out.println("deleting node at index : " + index);
        if (index == 0) {
            head = head.next;
        } else {
            Node n = head;
            Node n1;
            /**
             * //looping till one element before the index and then link n.next to index.next
             * assign index node to n.next and
             * delete the node at index
             */

            for (int i = 1; i < index - 1; i++) {
                n = n.next;
            }
            n1 = n.next.next; //
            n.next = n.next.next;
            n1 = null;
        }

    }

    public boolean isEmpty() {
        return head == null;
    }

    public void show() {
        Node n = head; //start from head
        System.out.print("Linked list : ");
        while (n.next != null) {
            System.out.print(n.data + "  "); //to print all the nodes but not the lastone
            n = n.next;
        }
        System.out.println(+n.data); //to print the last one

    }
}
