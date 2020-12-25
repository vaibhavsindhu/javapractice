package practice;

import java.util.Arrays;

public class GetPairs {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 15};
        //if not sorted use Arrays.sort()
        // Arrays.sort(arr);
        int sum = 17;
        int len = arr.length - 1;
        //for(int i=0;i<len;i++){
        int i = 0;
       // while (len > 0 || i < len) {
        while(i<len){
            if (arr[i] + arr[len] < sum) {
                i++;
            } else if (arr[i] + arr[len] > sum) {
                len--;
            } else if (arr[i] + arr[len] == sum) {
                System.out.println(arr[i] + " " + arr[len]);
                len--;
            }
            //if (i >= len) {
              //  break;
            }
        }

    }

