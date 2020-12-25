package practice;

/**
 * Write program to accept 2 integers R and S, and find N(number of possibilities),.
 * the no.of R digit numbers whose sum of digit equals to S
 * 1<=R<=9
 * 1<=S<=90
 * Sample input
 * R=2
 * S=6
 * output
 * N =6
 * Explanation
 * (1,5)(2 4)(3 3)(4 2)(5 1)(6 0)
 */

public class Possibilities {
    public static void main(String[] args) {
        System.out.println(findPossibleCombinations(2, 6));

    }

    public static int findPossibleCombinations(int n, int sum) {
        if (n == 0)
            return sum == 0 ? 1 : 0;
        if (sum == 0)
            return 1;


        return 1;
    }

    }
