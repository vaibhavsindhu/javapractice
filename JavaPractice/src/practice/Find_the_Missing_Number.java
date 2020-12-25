package practice;

public class Find_the_Missing_Number {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12};
        System.out.printf(String.valueOf(getMissingNumber(arr)));

    }

    public static int getMissingNumber(int arr[]) {
        int expectedSum = 0;
        int actualSum = 0;
        int length = arr.length;

        expectedSum = ((length + 1) * (length + 2)) / 2; // if number is missing in the array
        //expectedSum = ((length) * (length + 1)) / 2; // if number is replaced by 0 in the array

        for (int i = 0; i < length; i++) {
            actualSum += arr[i];
        }
        return expectedSum - actualSum;
    }
}
