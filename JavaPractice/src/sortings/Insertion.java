package sortings;

public class Insertion {
    public static void insertionSort(int[] list){
        for(int i=1;i<list.length-1;i++){
            int value=list[i];
            int hole=i;
            while(hole>0 && list[hole-1]>value){
                list[hole]=list[hole-1];
                hole=hole-1;
            }
            list[hole]=value;
        }
    }
}
