package string;

public class AnagramStrings {

    public static void main(String[] args) {

       // String s = "heart";
      //    String t = "earth";
       // String s = "aa";
      //  String t = "a";
        String s = "ggii";
        String t = "eekk";
        System.out.println(isAnagram(s,t) ? "anagram" : "not anagram");
    }

    public static boolean isAnagram(String s, String t) {

        boolean isAnagram = true;

        for (int i = 0; i < s.length(); i++) {

            if (!(s.length() == t.length())) {
                isAnagram = false;
                break;
            }
            //char c=s.charAt(i);
            s = s.replaceAll(String.valueOf(s.charAt(0)), "");
            t = t.replaceAll(String.valueOf(s.charAt(0)), "");

            if (!(s.length() == t.length())) {
                isAnagram = false;
            }

        }
        return isAnagram;
    }
}
