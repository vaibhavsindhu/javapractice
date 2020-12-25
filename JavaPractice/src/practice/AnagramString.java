package practice;


import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        {
//            char s1[] = {'t', 'e', 's', 't'};
//            char s2[] = {'t', 't', 'e', 'w'};

            char s1[] = {'l', 'i', 's', 't', 'e', 'n'};
            char s2[] = {'s', 'i', 'l', 'e', 'n', 't'};

            if (anagramString(s1, s2))
                System.out.println("The two strings are"
                        + " anagram of each other");
            else
                System.out.println("The two strings are not"
                        + " anagram of each other");
        }
    }

    public static boolean anagramString(char[] s1, char[] s2) {

        //if length is different for both then they can't be anagram string
        if (s1.length != s2.length)
            return false;
        // sort both
        Arrays.sort(s1);
        Arrays.sort(s2);

        for (int i = 0; i < s1.length - 1; i++)
            if (s1[i] != s2[i])
                return false;

        return true;
    }
    

}
