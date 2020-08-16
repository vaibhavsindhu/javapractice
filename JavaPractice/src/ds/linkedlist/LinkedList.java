package ds.linkedlist;

public class LinkedList {
    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
        System.out.println("added node: "+node.data);
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        node.next = head;
        head = node;
        System.out.println("added node at start : "+node.data);
    }

    public void insertAt(int index, int data) {
        //adding new node with data and next as null
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (index == 0) {
            insertAtStart(data);
        } else {
            Node n = head;

            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;  //break the link first
            n.next = node; //assign later
        }
        System.out.println("added node: "+node.data+" at index :" + index );
    }

    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node n = head;
            Node n1;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            System.out.println("deleting node "+n1.data);
            //its deleted but still in the memory
            //so delete it
            n1=null;
        }
    }

    public void show() {
        Node n = head;
        while (n.next != null) {
            System.out.println(n.data); //till the end but not the last
            n = n.next;
        }
        System.out.println(n.data); //to print last node
    }

}
