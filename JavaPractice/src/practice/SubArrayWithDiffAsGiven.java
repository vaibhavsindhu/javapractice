package practice;

import java.util.Arrays;

/**
 * find a subarray such that difference between elements is less than k.
 * <p>
 * Naive Approach:
 * To solve the problem mentioned above the naive method is to use The Brute Force approach
 * that is to generate all the possible subarray of the given array and check if the difference
 * between the maximum and minimum element of the subarray is at most K or not. If it is,
 * then update the length of the current subarray with the maximum length. Print the maximum length
 * of the subarray after all the operations.
 */
public class SubArrayWithDiffAsGiven {
    public static void main(String[] args) {
        //int arr[] = {1, 2, 3, 6, 7};
        //int k = 2;
        int arr[] = {2, 4, 5, 5, 5, 3, 1};

        int k = 0;
        int subArrayLength = computeLongestSubArray(arr, k);
        System.out.println("length of sub array: " + subArrayLength);

    }

    public static int computeLongestSubArray(int arr[], int k) {
        // Length will be one in any case
        int maxLength = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            int minOfSub = arr[i];
            int maxOfSub = arr[i];
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] > maxOfSub)
                    maxOfSub = arr[j];

                if (arr[j] < minOfSub)
                    minOfSub = arr[j];

                if (maxOfSub - minOfSub <= k) {
                    int currentLength = j - i + 1;

                    if (maxLength < currentLength)
                        maxLength = currentLength;

                }
            }

        }
        return maxLength;
    }
}

