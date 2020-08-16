package collection.list;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {

        LinkedList l=new LinkedList(); // first constructor
        ArrayList al=new ArrayList();

        LinkedList l2=new LinkedList(al);// 2nd constructor ....convert al to list

        //add few elements

        l.add("A");
        l.add("A");
        l.add("3");
        l.add(null);
        System.out.println(l);
        l.set(0,"Vaibhav");  //replace first element
        l.add(2,"name");  //add name at 2nd index
        System.out.println(l);

        l.addFirst("me");
        l.addLast("you");
        System.out.println(l);
        System.out.println(l.contains("vaibhav"));
        System.out.println(l.contains("Vaibhav"));  //case sensitive
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
    }
}
