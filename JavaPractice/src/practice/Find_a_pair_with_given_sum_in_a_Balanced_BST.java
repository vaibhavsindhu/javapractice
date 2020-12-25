package practice;

import datastructure.tree.BST;
import datastructure.tree.Node;

import java.util.ArrayList;

public class Find_a_pair_with_given_sum_in_a_Balanced_BST {
    public static void main(String[] args) {
        Node node = new Node();
        BST bst = new BST();

        // create a BST

        node.root = bst.insert(node.root, 8);
        node.root = bst.insert(node.root, 10);
        node.root = bst.insert(node.root, 12);
        node.root = bst.insert(node.root, 15);
        node.root = bst.insert(node.root, 20);
        node.root = bst.insert(node.root, 16);
        node.root = bst.insert(node.root, 25);


        //get sorted list and store into list
        ArrayList<Integer> al = new ArrayList<>();
        bst.BST_To_List(node.root, al);
        System.out.println(al);

        //loop the list
        int start = 0;
        int end = al.size() - 1;
        int sum = 36;
        while (start < end) {
            if (al.get(start) + al.get(end) == sum) {
                System.out.println(al.get(start) + " " + al.get(end));
                break;
            } else if (al.get(start) + al.get(end) < sum)
                start++;
            else if (al.get(start) + al.get(end) > sum)
                end--;

        }

    }
}
