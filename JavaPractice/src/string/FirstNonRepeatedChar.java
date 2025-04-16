package string;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String s = "swigdfdfisws";
        getFirstNonRepeatedChar(s);
    }

    public static void getFirstNonRepeatedChar(String s) {

        while (s.length() > 0) {
            char c = s.charAt(0);
            int len = s.length();
            s = s.replaceAll(String.valueOf(c), "");
            if (len - s.length() != 1) {
                continue;
            }
            System.out.println(c);
            break;
        }
    }
}
