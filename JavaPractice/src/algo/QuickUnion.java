package algo;

// Takes O(N) in worst case
public class QuickUnion {
    private static int[] id;
    static int big;
    public static void main(String[] args) {
        id = new int[10];
        System.out.print("before union : ");
        for (int i = 0; i < 10; i++) {
            id[i] = i;
            System.out.print(id[i] + " ");
        }
        System.out.println();
        System.out.println(root(3)); //self root
        union(3, 4); //4 is now parent of 3  ...
        show();
        System.out.println(root(3)); ///root is 4
        System.out.println(isConnected(3, 4)); //connected
        System.out.println(isConnected(3, 5)); //not connected
        union(5, 4); // 4 is parent of 5
        show();
        System.out.println(isConnected(3, 5)); //connected...same have root as 4
        union(1, 4);
        show();
        System.out.println(isConnected(1, 5)); //true as 4 is root for 5 and 1
        union(2, 5);
        show();
        System.out.println(isConnected(2, 4)); //true as 4 is root for 5 and 1
    }


    public static int root(int i) {
        if (i != id[i])
            i = id[i];
        return i;
    }

    public static boolean isConnected(int p, int q) {
        return root(p) == root(q);
    }

    public static void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
        if(id[i]>id[j])
            big=i;
        else
            big=j;
    }

    public static void show() {
        System.out.print("list after union : ");
        for (int i = 0; i < id.length; i++) {
            System.out.print(id[i]+" ");
        }
        System.out.println();
    }

}
