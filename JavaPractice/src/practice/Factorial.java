package practice;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(Fact(3));


    }

    public static int Fact(int n) {
        int result;
        if (n == 0)
            return 1;
        result = n * Fact(n - 1);
        return result;

    }
}
