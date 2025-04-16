package string;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        String s = "JavaTest".toLowerCase();
        Set<Character> noDup = new LinkedHashSet<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            noDup.add(chars[i]);
        }
        for (char c : noDup) {
            System.out.print(c);
        }
    }
}
