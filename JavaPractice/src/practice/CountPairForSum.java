package practice;

import java.util.HashMap;

public class CountPairForSum {
    public static int arr[] = new int[]{1, 5, 7, -1, 5};

    public static void main(String[] args) {

        int sum = 6;
        //  System.out.println(getPair(arr, 5));
        System.out.println(getPairInConstantTime(arr.length, 5));
    }

    // this is O(n2)
    public static int getPair(int ar[], int s) {
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] + ar[j] == s) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * Below is the Algorithm.
     * <p>
     * Create a map to store frequency of each number in the array. (Single traversal is required)
     * In the next traversal, for every element check if it can be combined with any other element (other than itself!) to give the desired sum. Increment the counter accordingly.
     * After completion of second traversal, we’d have twice the required value stored in counter because every pair is counted two times. Hence divide count by 2 and return.
     *
     * @param n
     * @param sum
     * @return
     */

    //this is O(n)
    public static int getPairInConstantTime(int n, int sum) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            //map.put(arr[i],1);
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 0);
            }


        }
        System.out.println(map);
        return 1;
    }
}
