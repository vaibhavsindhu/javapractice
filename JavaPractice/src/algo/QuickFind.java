package algo;

// Takes O(N^2) in worst case
public class QuickFind {
    private static int[] list;

    public static void main(String[] args) {
        list=new int[10];
        System.out.print("before union : ");
        for(int i=0;i<10;i++){
            list[i]=i;
            System.out.print(list[i] + " ");
        }
        System.out.println();
        System.out.println(isConnected(4,6));//chk if 4,6 connected
        union(4,6); //connect them
        System.out.println(isConnected(4,6));//now chk if connected
        union(5,6);//connect 5 with 4,6

        //4,6 connected ....5,6 connected ...now check 4,5 connected (they should)
        System.out.println(isConnected(4,5));

        System.out.print("After union : ");//chk list after union 4,5,6
        for(int i=0;i<list.length;i++) {
            System.out.print(list[i] +" ");
        }
    }
    public static boolean isConnected(int p, int q){
        return list[p]==list[q];
    }
    public static void union(int p,int q){
        int pid=list[p];
        int qid=list[q];
        for(int i=0;i<list.length;i++){
            if(list[i]==pid) //chk if value of ith is equal to p if yes
                list[i]=qid; //replace it with q (all connected nodes should have same value)
                                //list[4],list[5] an list[6] have same value as list[6] after union ....6
        }
    }
}
