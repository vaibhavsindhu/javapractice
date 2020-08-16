package recursion;

public class Recursion {
    public int factorial(int n) {
        int result;
        System.out.println("calculating for: " + n);
        if (n == 0)
            return 1;
        result = n * factorial(n - 1);
        System.out.println("done with calculation for : " + n);
        return result;

    }

    public int fibonacci(int n) {
        int F = 0, F1, F2;
        F1 = 0;
        F2 = 1;
        for (int i = 2; i < n; i++) {
            F = F1 + F2;
            F1=F2;
            F2=F;
        }
        return F;
    }
}
