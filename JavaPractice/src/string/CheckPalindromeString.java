package string;

public class CheckPalindromeString {
    public static void main(String[] args) {
        String s = null;
        System.out.println(validatePalindrome(s));
        System.out.println(validatePalindromeUsingRecursion(s));

    }

    public static boolean validatePalindrome(String s) {
        if (s == null) {
            return false;
        }
        boolean isPalindrome = true;
        int first = 0;
        int last = s.length() - 1;
        while (first < last) {
            if (s.charAt(first) == s.charAt(last)) {
                first++;
                last--;
            } else {
                isPalindrome = false;
                break;
            }

        }
        return isPalindrome;
    }


    public static boolean validatePalindromeUsingRecursion(String s) {
        if (s == null) {
            return false;
        }
        if (s.length() <= 1) {
            return true;
        }
        String firstChar = s.substring(0, 1);
        String lastChar = s.substring(s.length() - 1);
        if (!firstChar.equals(lastChar)) {
            return false;
        } else {
            return validatePalindromeUsingRecursion(s.substring(1, s.length() - 1));
        }

    }
}
