package practice;

/**
 * Given a sorted array arr[] of n elements, write a function to search a given element x in arr[].
 * <p>
 * A simple approach is to do linear search.The time complexity of above algorithm is O(n).
 * Another approach to perform the same task is using Binary Search.
 * <p>
 * Binary Search: Search a sorted array by repeatedly dividing the search interval in half.
 * Begin with an interval covering the whole array. If the value of the search key is less than
 * the item in the middle of the interval, narrow the interval to the lower half. Otherwise narrow
 * it to the upper half. Repeatedly check until the value is found or the interval is empty.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 6, 7, 9, 10, 18, 19, 23, 26, 27};
        int x = 27;
        int result;
        int len = arr.length - 1;
        int start = 0;
        // result = withoutRecursion(arr, x);
        result = withRecursion(arr, start, len, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index : " + result);

    }


    public static int withRecursion(int arr[], int start, int len, int x) {

        int mid = 0;
        if (len >= start) {
            mid = start + (len - start) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] < x) {
                start = mid + 1;
                return withRecursion(arr, start, len, x);
            } else
                return withRecursion(arr, start, len - 1, x);
        }
        return -1;

    }


    //without recursion
    public static int withoutRecursion(int arr[], int x) {
        int len = arr.length - 1;
        int start = 0;
        int mid = 0;

        while (start <= len) {
            mid = start + (len - start) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                len = mid - 1;
            else
                start = mid + 1;

        }

        return -1;

    }
}
