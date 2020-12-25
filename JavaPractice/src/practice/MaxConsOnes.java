package practice;

import org.w3c.dom.ls.LSOutput;

public class MaxConsOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1};
        System.out.println(maxOnes(arr));
    }


    public static int maxOnes(int[] arr) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                count = 0;
            else
                count++;
            max = count > max ? count : max;
        }
        return max;
    }
}
