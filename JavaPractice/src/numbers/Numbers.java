package numbers;

public class Numbers {
    public static void main(String[] args) {
        int n = 786;
        System.out.println(reverse(n));
    }

    public static int reverse(int n) {
        int lastDigit;
        int sum = 0;
        while (n > 0) {
            lastDigit = n % 10;
            sum = sum * 10 + lastDigit;
            n = n / 10;
        }

        return sum;
    }
}
