package string;

import java.util.*;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        String str = "I am am vaibhav singh vaibhav";
        removeDuplicates(str);
    }

    public static void removeDuplicates(String str) {
        String s[]= str.split(" ");
        List<String> noDup = new ArrayList<>();

        for (int i = 0; i < s.length; i++) {
            if(!noDup.contains(s[i])){
                noDup.add(s[i]);
            }
        }
       // System.out.println(noDup);
        for(String word: noDup){
            System.out.print(word+" ");
        }
    }
}
