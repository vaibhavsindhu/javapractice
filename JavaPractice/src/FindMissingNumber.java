package array;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        System.out.println(getMissingNumber(arr));
    }

    public static int getMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int expectedSum = (n * (n + 1)) / 2;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return expectedSum - sum;
    }
}
