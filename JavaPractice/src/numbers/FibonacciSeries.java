package numbers;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        fibonacci(10);

        print();
    }

    protected static void fibonacci(int n) {
        // 0 1 1 2 3 5 8 13 21
        int[] series = new int[n];
        series[0] = 0;
        series[1] = 1;
        for (int i = 2; i <=n-1 ; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }
        System.out.println(Arrays.toString(series));
    }

    protected static int byRec(int n) {
        if (n < 2) {
            return n;
        }
        else {
            return byRec(n - 2) + byRec(n - 1);
        }
    }

    public static void print() {
       // Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.print(byRec(i)+" ");
        }
    }

}
