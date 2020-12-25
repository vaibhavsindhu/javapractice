package practice;


import java.util.HashSet;
import java.util.Set;

public class Duplicate {
    public static void main(String[] args) {
        String[] names = {"vaibhav", "singh", "vaibhav"};
        Set set = new HashSet();
        for (String name : names) {
            if(set.add(name)==false){
                System.out.println(name);
            }

        }
    }
}
