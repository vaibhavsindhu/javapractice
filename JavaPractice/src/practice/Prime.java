package practice;

public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(15, 2));

    }

    public static boolean isPrimeNumber(int n, int i) {
        //base case
        if (n <= 2)
            return (n == 2) ? true : false;

        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
        return isPrimeNumber(n, i + 1);
    }
}
