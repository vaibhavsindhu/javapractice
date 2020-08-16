package sortings;

public class Selection {
    public static void selectionSort(int[] list){
        for(int i=0;i<list.length-1;i++){
            int min=i;
            for(int j=i+1;j<list.length-1;j++){
                if(list[j]<list[min]){
                    min=j;
                }
                int temp=list[i];
                list[i]=list[min];
                list[min]=temp;
            }
        }
    }
}
