package collection.set;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.TreeSet;

public class NavigableSetTest {
    public static void main(String[] args) {
        TreeSet<Integer> tree=new TreeSet<>();
        for(int i=0;i<20;i++) {
            tree.add(i);
        }
        System.out.println(tree);
        System.out.println("Lower : "+tree.lower(10));
        System.out.println("Floor : "+tree.floor(10));
        System.out.println("Higher : "+tree.higher(10));
        System.out.println("Ceiling : "+tree.ceiling(10));
        System.out.println("pollFirst : "+tree.pollFirst());
        System.out.println("pollLast : "+tree.pollLast());
        System.out.println("descending : "+tree.descendingSet());
    }

}
