package string;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String str = "Hello this is vaibhav singh. I live in India.";
          getAllCharAndHowManyTimeTheyOccurs(str);
        //System.out.println(getFirstUniqueChar("dddccdbba"));
       // System.out.println(validateAnagramString());
    }

    public static void getAllCharAndHowManyTimeTheyOccurs(String str) {

        for (int i = 0; i < str.length(); i++) {
            int len = str.length();
            char firstChar = str.charAt(0);
            str = str.replaceAll(String.valueOf(str.charAt(0)), "");
            int charTimes = len - str.length();

            System.out.println(firstChar + " :" + charTimes);
        }
    }

    public static int getFirstUniqueChar(String str) {
        String org=str;
        StringBuilder uniqueChars = new StringBuilder();
        int index=0;
        if(str.length()==1)
            return index;
       while(str.length()>=0) {
            int len = str.length();
            char firstChar = str.charAt(0);
            str = str.replaceAll(String.valueOf(str.charAt(0)), "");
            int charTimes = len - str.length();

            // If we need to get first unique char in the string
            if (charTimes == 1) {
                uniqueChars.append(firstChar);
                return  org.indexOf(firstChar);

            }
        }
        //System.out.println("First unique char:" + uniqueChars.substring(0, 1));
        return -1;

    }


    public static boolean validateAnagramString() {
//        String s = "heart";
//        String t = "earth";
        String s = "aa";
        String t = "a";
//        String s = "ggii";
//        String t = "eekk";

        boolean isTrue = true;
        if (!(s.length() == t.length())) {
            isTrue = false;

        } else {
            // for (int i = 0; i <= s.length(); i++) {
            while (s.length() >= 0) {
                char sChar = s.charAt(0);

                s = s.replaceAll(String.valueOf(sChar), "");
                t = t.replaceAll(String.valueOf(sChar), "");

                if (!(s.length() == t.length())) {
                    isTrue = false;
                    break;
                }
            }

        }
        return isTrue;
    }
}