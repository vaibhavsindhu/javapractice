package sortings;

import java.util.Scanner;

public class BubbleSort {
    static int numberOfElements;
    public static int[] elements;

    public static void main(String[] args) {

        //if want to take user input
       /* Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        numberOfElements = s.nextInt();
        elements = new int[numberOfElements];
        System.out.print("Enter elements : ");
        for (int i = 0; i < numberOfElements; i++) {
            elements[i] = s.nextInt();
        }
        System.out.println("Elements to be sorted : ");
        for (int element : elements) {
            System.out.print(element + "   ");
        }
        System.out.println();*/

        //sort();
        int list[]={2,3,9,1,10,5,4,8,2};
        bubbleSort(list);
        show(list);
    }

    public static void sort() {
        for (int i = 0; i < numberOfElements - 1; i++) {
            for (int j = 0; j < numberOfElements; j++) {
                if (elements[j] > elements[j + 1]) {
                    int temp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted elements : ");
        for (int i = 0; i < elements.length - 1; i++) {
            System.out.print(elements[i] + " ");
        }
    }

    public static void bubbleSort(int [] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length-1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }

    }
    public static void show(int[] list){
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

    }
}

