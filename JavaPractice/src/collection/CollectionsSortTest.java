package collection;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortTest {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<String>();
        al.add("A");
        al.add("D");
        al.add("C");
        al.add("B");
        //al.add(10); // CCE
        //al.add(null); // NPE
        System.out.println(al); //insertion ordered
        Collections.sort(al);
        System.out.println(al); //natural sorting order


        // custom sorting
        Collections.sort(al,
                (Object o1, Object o2) -> {
                    String i = (String) o1;
                    String j = (String) o2;
                    return j.compareTo(i);
                }
        );
        System.out.println(al); //reverse sorting order using our own sorting
    }


}
