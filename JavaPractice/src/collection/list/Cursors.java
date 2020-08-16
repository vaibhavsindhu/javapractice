package collection.list;

import java.util.*;

/**
 * Cursors are used to get the elements from the collection
 * there are three type of cursor
 * 1.Enumeration
 * 2.Iterator
 * 3
 */
public class Cursors {
    public static void main(String[] args) {
        Cursors cursors = new Cursors();
        System.out.println("############ enumeration_Cursor ###############");
        cursors.enumeration_Cursor();
        System.out.println();
        System.out.println("############ Iterator ###############");
        cursors.iterator_Cursor();
        System.out.println("#############3 listIterator_Cursor ################");
        cursors.listIterator_Cursor();
    }

    /**
     * 1. Enumeration :
     * Used only for old classes(Legacy) like...vector
     * This can be used to Read only
     * No backward movement allowed --- uni directional
     */
    public void enumeration_Cursor() {
        Vector v = new Vector();
        for (int i = 0; i < 10; i++) {
            v.addElement(i);
        }
        Enumeration en = v.elements(); // create obj by using elements method
        System.out.println("Class implements elements method : " + en.getClass().getName());
        System.out.print("Even no. : ");
        while (en.hasMoreElements()) {
            Integer I = (Integer) en.nextElement();  //get next element and cast it as it returns obj
            if (I % 2 == 0) {
                System.out.print(I + "  ");
            }
        }
        System.out.println();
        System.out.print("Vector : " + v);


//        Iterator itr=v.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
    }

    /**
     * 1. Iterator :
     * Universal cursor
     * Used for all collection classes like...vector,ArrayList..
     * This can be used to Read,remove but not for add or replace
     * No backward movement allowed -- uni directional
     */
    public void iterator_Cursor() {
        ArrayList al = new ArrayList();
        for (int i = 0; i < 10; i++) {
            al.add(i);
        }
        Iterator itr = al.iterator(); // create obj by using iterator method
        System.out.println("Class implements iterator method : " + itr.getClass().getName());
        System.out.print("Even no. : ");
        while (itr.hasNext()) {
            Integer I = (Integer) itr.next();  //get next element and cast it as it returns obj
            if (I % 2 == 0) {
                System.out.print(I + "  ");
            } else {
                itr.remove();       //remove I which is not even
            }
        }
        System.out.println();
        System.out.print("ArrayList : " + al); // removed elements
    }


    /**
     * 1. ListIterator :
     * Its a child of Iterator
     * Its most powerfull but only can be appy ob List --not a universal cursor
     * Used for all List classes like...vector,ArrayList..
     * This can be used to Read,remove,add and replace
     * both side movement allowed -- bi directional
     */
    public void listIterator_Cursor() {
        LinkedList l = new LinkedList();

        l.add("Ram");
        l.add("mohan");
        l.add("sohan");
        l.add("ravi");
        l.add("syam");
        l.add("vaibhav");
        l.add("anu");

        ListIterator itr = l.listIterator(); // create obj by using listIterator method
        System.out.println("Class implements listIterator method : " + itr.getClass().getName());
        System.out.print("List is : " + l);
        while (itr.hasNext()) {
            String str = (String) itr.next();  //get next element and cast it as it returns obj
            if (str.equalsIgnoreCase("mohan")) {
                itr.remove(); //remove
            } else if (str.equalsIgnoreCase("sohan")) {
                itr.set("Amit");       //replace
            } else if (str.equalsIgnoreCase("ravi")) {
                itr.add("dharam"); //will add dharam just after ravi
            }
        }
        System.out.println();
        System.out.print("ArrayList : " + l); // new list

        System.out.println();
        System.out.println("Reverse list : ");
        while (itr.hasPrevious()) {
            System.out.print(itr.previousIndex() + " ");
            System.out.print(itr.previous() + "  ");
        }
    }
}
