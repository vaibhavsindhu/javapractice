package string;

public class ReverseString {
    public static void main(String[] args) {
        String s = "java home";
        // System.out.println(reverseString(s));
        System.out.println(reverseOnlyWord(s));
    }

    public static StringBuilder reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb;
    }

    public static StringBuilder reverseOnlyWord(String s) {
        StringBuilder sb = new StringBuilder();
        String[] newStr = s.split(" ");
        for (int j = 0; j < newStr.length; j++) {
            for (int i = newStr[j].length() - 1; i >= 0; i--) {
                sb.append(newStr[j].charAt(i));
            }
           sb.append(" ");

        }
        return sb;

    }

}
