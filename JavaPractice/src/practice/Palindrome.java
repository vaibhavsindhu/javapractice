package practice;

public class Palindrome {
    public static void main(String[] args) {
        palindromeNumber();
        System.out.println(palindromeString());

    }

    public static void palindromeNumber() {
        int n = 121;
        int rev;
        int temp = n;
        int sum = 0;
        while (n > 0) {
            rev = n % 10;
            sum = (sum * 10) + rev;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }

    public static boolean palindromeString() {
        String str = "naan";
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;

            i++;
            j--;
        }
        return true;
    }
}
