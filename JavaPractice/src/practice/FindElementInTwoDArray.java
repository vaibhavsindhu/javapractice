package practice;


import java.util.ArrayList;
import java.util.List;

public class FindElementInTwoDArray {
    public static void main(String[] args) {
        int x = 18;
        int result = 0;
        int arr[][] = {
                {1, 4, 6, 8},
                {9, 10, 11, 13},
                {14, 15, 18, 19},
                {20, 31, 36, 40},
        };

        System.out.println("array length: " + arr.length);

        System.out.println("one D array : ");
        for (int i = 0; i < getOneDArrayFrom2D(arr).length; i++) {
            System.out.print(getOneDArrayFrom2D(arr)[i] + "   ");
        }

        System.out.println();
        System.out.println("find element : " + x);
        result = BinarySearch.withoutRecursion(getOneDArrayFrom2D(arr), x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index : " + result);

    }

    //2D to 1 D conversion
    public static int[] getOneDArrayFrom2D(int arr[][]) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                list.add(arr[i][j]);
            }
        }
        int oneDArray[] = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            oneDArray[k] = list.get(k);
        }
        return oneDArray;
    }

}
