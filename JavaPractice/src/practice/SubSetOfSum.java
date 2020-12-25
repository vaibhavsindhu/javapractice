package practice;

public class SubSetOfSum {
    static int newSum = 0;

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int sum = 10;
        getSubSet(arr, sum);

    }

    public static void getSubSet(int arr[], int sum) {
        int[] subSet = new int[5];
        int j = 0;
        newSum = sum;
        for (int i = 0; i < arr.length; i++) {
            if (newSum - arr[i] > newSum) {
                subSet[j] = arr[i];
                j++;
                newSum = sum - arr[i];
            }
        }
    }
}
