package array;

import java.util.Map;

public class FindLargestAndSmallest {
    public static void main(String[] args) {
        int[] arr = {3, 14, 2, 6, -9, 10, 11, 45, 77, 67};
        getLargestAndSmallest(arr);
    }

    public static void getLargestAndSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            if (arr[i] > largest) {
                largest = arr[i];
            }


        }
        System.out.println(smallest + "-----------" + largest);
    }

}
