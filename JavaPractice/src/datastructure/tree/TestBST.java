package datastructure.tree;

public class TestBST extends Node {
    public static void main(String[] args) {

        BST bst = new BST();
        Node node = new Node();
        System.out.println("min value : " + bst.findMin(node.root));
        System.out.println("##################################### Add Node ##################################");
        node.root = bst.insert(node.root, 5);
        node.root = bst.insert(node.root, 4);
        node.root = bst.insert(node.root, 9);
        node.root = bst.insert(node.root, 7);
        node.root = bst.insert(node.root, 8);
        node.root = bst.insert(node.root, 10);
        System.out.println("##################################### Search Node ##################################");
        System.out.println(bst.search(node.root, 5));
        System.out.println(bst.search(node.root, 8));
        System.out.println(bst.search(node.root, 9));
        System.out.println("##################################### Find Min and Max ##################################");
        System.out.println("min value : " + bst.findMin(node.root).data);
        System.out.println("Max value : " + bst.findMax(node.root).data);


        System.out.println("min value recursively: " + bst.findMinRecursion(node.root));
        System.out.println("Max value recursively: " + bst.findMaxRecursion(node.root));

        System.out.println("##################################### find Height ##################################");
        System.out.println("Height of the tree: " + bst.heightOfTree(node.root));
        System.out.println("##################################### Traverse tree ##################################");
        bst.treeTraversal_LevelOrder(node.root);
        System.out.print("treeTraversal_DepthFirst_PreOrder : ");
        bst.treeTraversal_DepthFirst_PreOrder(node.root);
        System.out.println();

        System.out.print("treeTraversal_DepthFirst_InOrder : ");
        bst.treeTraversal_DepthFirst_InOrder(node.root);
        System.out.println();

        System.out.print("treeTraversal_DepthFirst_PostOrder : ");
        bst.treeTraversal_DepthFirst_PostOrder(node.root);
        System.out.println();
        System.out.println("##################################### Is Tree BST ##################################");
        System.out.println("IS_BST : "+bst.isBST(node.root));
        System.out.println("##################################### Delete ##################################");
        //Case 1: delete leaf node
        bst.delete(node.root,10);
        System.out.println(bst.search(node.root, 10));

        System.out.print("treeTraversal_DepthFirst_InOrder : ");
        bst.treeTraversal_DepthFirst_InOrder(node.root);
        System.out.println();

        System.out.println("##################################### Diameter ##################################");
        System.out.println(bst.diameterOfTree(node.root));
    }

}
