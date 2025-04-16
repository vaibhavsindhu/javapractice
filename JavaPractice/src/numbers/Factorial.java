package numbers;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
//        System.out.println("Give me number : ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        System.out.println(factor(0));

        System.out.println(factByRec(0));

    }

    protected static int factor(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    protected static int factByRec(int n) {
        if (n < 2)
            return 1;
        else return n * factByRec(n - 1);
    }
}
