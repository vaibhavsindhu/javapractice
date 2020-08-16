package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("A");
        al.add(1);          //int and char allowed....diff data type allowed
        al.add("A");        //duplicate allowed
        al.add(null);       //null allowed
        System.out.println(al);
        al.add(2, "M"); //insert at 2


        ArrayList al2 = new ArrayList();
        al2.add(3);
        al2.add(4);
        al2.add(5);
        System.out.println(al);
        al.addAll(al2);       //append al2 after al
        System.out.println(al);

        System.out.println(al.isEmpty());
        System.out.println(al.size());

        //Create a copy ...no impact on original
        ArrayList clone = (ArrayList) al.clone();
        System.out.println(clone);

        //this will add only in clone and not in al
        clone.add("MM");
        System.out.println(clone);
        System.out.println(al);


        al.remove("A");    //remove first  A
        System.out.println(al);

        al.retainAll(al2);   //remove all except al2
        System.out.println(al);

        System.out.println(al.contains(3));
        System.out.println(al.get(1));    //element at index 1
        System.out.println(al.indexOf(5)); //get index of 5
        al.addAll(clone);
        System.out.println(al);

        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(al);
            itr.next();
        }

        //this is how be make arraylist synchronized
        List l = Collections.synchronizedList(al);


    }

}
