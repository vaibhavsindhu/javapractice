package collection.list;

import java.util.Collection;
import java.util.Vector;

/**
 * Same as ArrayList just one change
 * Its synchronized/ thread safe but ArrayList is not
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector vector = new Vector();  //first constructor to add default capacity
        System.out.println(vector.capacity()); //default capacity of vector is 10
        for (int i = 0; i < 10; i++) {      //add 10 elements
            vector.add(i);
        }
        System.out.println(vector.capacity()); //still 10
        vector.add("B");                // add 11th element
        System.out.println(vector.capacity()); // now newCapacity=oldCapacity*2=20
        System.out.println(vector);

        //this method specific from vector class

        vector.addElement("A");
        System.out.println(vector);

        /** Constructor 1*/
        Vector vector1 = new Vector();  //first constructor to add default capacity=10
        System.out.println("Default constructor : " + vector1.capacity()); //=10

        /** Constructor 2*/
        Vector vector2 = new Vector(15); // user specified capacity=15
        System.out.println("constructor 2 : " + vector2.capacity()); //=15

        /** Constructor 3
         * if we want user specified increment instead of double always
         * */
        Vector vector3 = new Vector(10, 8); //user defind increment=8
        for (int i = 0; i < 10; i++) {      //add 10 elements
            vector3.add(i);
        }
        vector3.add("C");
        System.out.println("constructor 3 : " + vector3.capacity()); //=18

        /**Constructor 4
         * for any other collection
         * */
        Vector vertor4=new Vector(vector);
        System.out.println("constructor for collection : "+vertor4);

    }




}
