package practice;

public class Fibonacci {
    public static void main(String[] args) {
        Fib(6);
    }

    public static void Fib(int N) {
        int F1, F2, F3 = 0;
        F1 = 0;
        F2 = 1;
        System.out.print(F1 + " " + F2);
        for (int i = 2; i < N; i++) {
            F3 = F1 + F2;
            System.out.print(" " + F3);
            F1 = F2;
            F2 = F3;
        }

    }
}
