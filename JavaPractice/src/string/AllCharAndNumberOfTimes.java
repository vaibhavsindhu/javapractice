package string;

public class AllCharAndNumberOfTimes {
    public static void main(String[] args) {
        getRepeatedChars("Hello this is vaibhav singh. I live in India.");
    }

    public static void getRepeatedChars(String s) {
        for (int i = 0; i < s.length(); i++) {
            int len = s.length();
            char c = s.charAt(0);
            s = s.replaceAll(String.valueOf(c), "");
            if (len - s.length() != 1) {
                System.out.println(c + " -> " + (len - s.length()));
            }
        }
    }
}
