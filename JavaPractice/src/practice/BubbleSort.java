package practice;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {3, 6, 1, 8, 9, 4, 5, 6, 10, 16, 11};
        int len = arr.length;
        int count = 0;
        for (int i = 0; i < len - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //do swapping
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // by adding these swapped we can avoid extra execution of loop
            // it got terminated as soon as all element sorted
            //remove these line and see no. of counts increased
            count++;
            if (swapped == false)
                break;
        }
        for (int k = 0; k < len - 1; k++) {
            System.out.println(arr[k]);
        }
        System.out.println("count: " + count);
    }
}
