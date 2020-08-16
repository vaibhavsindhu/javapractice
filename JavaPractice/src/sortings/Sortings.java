package sortings;

public class Sortings {
    public static void main(String[] args) {
        int [] list={1,5,2,7,4,9,6};
        System.out.print("unsorted list : " );
        show(list);

        System.out.println("******************Sorted List*********************");
       //bubble sort
        BubbleSort.bubbleSort(list);
        show(list);

        //selection sort
        Selection.selectionSort(list);
        show(list);

        Insertion.insertionSort(list);
        show(list);
    }

    public static void show(int[] list){
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}
