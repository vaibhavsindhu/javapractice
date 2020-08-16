package datastructure.tree;


import datastructure.queue.QueueUsingArray;

import java.util.*;

public class BST {
    /**
     * Insert data in tree
     *
     * @param root
     * @param data
     * @return
     */
    public Node insert(Node root, int data) {

        if (root == null) {
            root = createNode(data); //when tree is empty..create new node and make it root
            //Chk if data is new node is smaller than the root if yes goto left of tree and make a recursive call
            // put "=" to create duplicate node at the left if we have duplicate value
        } else if (data <= root.data) {
            root.left = insert(root.left, data);
            //if data is greater then root goto right
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    /**
     * Create new node
     *
     * @param data
     * @return
     */
    public static Node createNode(int data) {
        Node node = new Node();
        node.data = data;
        node.left = null;
        node.right = null;
        return node;
    }

    /**
     * find min without recursion
     *
     * @param root
     * @return
     */

    public Node findMin(Node root) {
        if (root == null) {
            System.out.println("Tree is empty");
            return null;
        }
        while (root.left != null) {
            root = root.left;
        }
        return root;

    }

    /**
     * find min with recursion
     *
     * @param root
     * @return
     */

    public int findMinRecursion(Node root) {
        if (root == null) {
            System.out.println("Tree is empty");
            return -1;
        } else if (root.left == null) {
            return root.data;
        }
        return findMinRecursion(root.left);
    }

    /**
     * find max without recursion
     *
     * @param root
     * @return
     */

    public Node findMax(Node root) {
        if (root == null) {
            System.out.println("Tree is empty");
            return null;
        }
        while (root.right != null) {
            root = root.right;
        }
        return root;
    }


    /**
     * find max with recursion
     *
     * @param root
     * @return
     */

    public int findMaxRecursion(Node root) {
        if (root == null) {
            System.out.println("Tree is empty");
            return -1;
        } else if (root.right == null) {
            return root.data;
        }
        return findMaxRecursion(root.right);
    }

    /**
     * Search data in tree
     *
     * @param node
     * @param data
     * @return
     */
    public boolean search(Node node, int data) {
        boolean found = false;
        if (node == null) {
            //do nothing
        } else if (node.data == data)
            found = true;
        else if (data < node.data) {
            found = search(node.left, data);
        } else if (data > node.data) {
            found = search(node.right, data);
        }
        return found;
    }

    /**
     * Return height of the tree (max of height of left/right subtree + 1 )
     *
     * @param root
     * @return
     */
    public int heightOfTree(Node root) {
        if (root == null)
            return -1;
        int heightLeft = heightOfTree(root.left);
        int heightRight = heightOfTree(root.right);
        return (max(heightLeft, heightRight)) + 1;
    }

    /**
     * Traverse the tree in breath first order-- Level order
     * Read all the nodes at level 0 first, then all nodes of level 1, then next level..till the lat node
     *
     * @param root
     */
    public void treeTraversal_LevelOrder(Node root) {
        if (root == null)
            return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        System.out.print("Level Traversal is :");
        while (!queue.isEmpty()) {
            Node current = queue.element();
            System.out.print(current.data + "  ");
            if (current.left != null)
                queue.offer(current.left);
            if (current.right != null)
                queue.offer(current.right);
            queue.remove();
        }
        System.out.println();
    }

    /**
     * <Data><Left><Right>
     * Print data(root node) first and then left node and then right node
     * treeTraversal_DepthFirst_PreOrder : 5  4  9  8  8  10
     *
     * @param root
     */
    public void treeTraversal_DepthFirst_PreOrder(Node root) {
        if (root == null) return;
        System.out.print(root.data + "  ");
        treeTraversal_DepthFirst_PreOrder(root.left);
        treeTraversal_DepthFirst_PreOrder(root.right);

    }

    /**
     * <Left><Data><Right>
     * Goto left sub tree first then root(data) then right subtree
     * In-Order traversal always give shorted list
     * treeTraversal_DepthFirst_InOrder : 4  5  8  8  9  10
     *
     * @param root
     */
    public void treeTraversal_DepthFirst_InOrder(Node root) {
        if (root == null) return;
        treeTraversal_DepthFirst_InOrder(root.left);
        System.out.print(root.data + "  ");
        treeTraversal_DepthFirst_InOrder(root.right);

    }

    /**
     * <Left><Right><Data>
     * Goto left subtree first then right sub tree and finally print root(data)
     * treeTraversal_DepthFirst_PostOrder : 4  8  8  10  9  5
     *
     * @param root
     */
    public void treeTraversal_DepthFirst_PostOrder(Node root) {
        if (root == null) return;
        treeTraversal_DepthFirst_PostOrder(root.left);
        treeTraversal_DepthFirst_PostOrder(root.right);
        System.out.print(root.data + "  ");

    }

    /**
     * Find Out if given tree is BST
     * give min and max values as a range (-1,100)
     * <p>
     * chk if root is b/w min and max values
     * for left child (min>-1, max>=root.data)
     * for right child (min>root.data, max<100)
     *
     * @param root
     * @return
     */
    public boolean bst_Util(Node root, int MIN, int MAX) {

        if (root == null) return true;
        if (root.data > MIN && root.data <= MAX &&
                bst_Util(root.left, MIN, root.data) &&
                bst_Util(root.right, root.data, MAX)) {
            return true;
        } else
            return false;


    }

    /**
     * To check if Tree is BST
     *
     * @param root
     * @return
     */
    public boolean isBST(Node root) {
        int MAX = 100;
        int MIN = -1;
        return bst_Util(root, MIN, MAX);
    }

    public Node delete(Node root, int data) {
        /**return null if tree is empty*/
        if (isTreeEmpty(root)) return null;
        /**find out node to be deleted at left*/
        if (data < root.data) {
            root.left = delete(root.left, data);
            /**find out node to be deleted at the right */
        } else if (data > root.data) {
            root.right = delete(root.right, data);

            /** Node to be deleted found ,Now we can have 3 cases
             * Case 1: if node to be deleted do not have any child */
        } else if (root.left == null && root.right == null) {
            root = null;
            /** Case 2: if root to be deleted have only right child, make right child new root */
        } else if (root.left == null) {
            Node oldRoot = root;
            root = root.right;
            oldRoot = null;
            /** Case 2: if root to be deleted have only left child, make left child new root */
        } else if (root.right == null) {
            Node oldRoot = root;
            root = root.left;
            oldRoot = null;
            /** Case 3: if root to be deleted have both right and left child,
             find out min node at right side and make it new root
             */
        } else {
            Node temp = findMin(root.right);
            root.data = temp.data;
            root.right = delete(root.right, data);

        }
        return root;
    }

    /**
     * Find out max b/w two Int
     *
     * @param i
     * @param j
     * @return
     */
    public int max(int i, int j) {
        int max;
        if (i > j)
            max = i;
        else
            max = j;
        return max;
    }

    public int diameterOfTree(Node root) {
        //base case
        if (isTreeEmpty(root)) {
            return -1;
        }
        //
        int height_L = heightOfTree(root.left);
        int height_R = heightOfTree(root.right);

        int height_tree = height_L + height_R + 1;

        int dia_L = diameterOfTree(root.left);
        int dia_R = diameterOfTree(root.right);

        int dia_tree = max(dia_L, dia_R);

        int diameter = max(dia_tree, height_tree);
        return diameter + 1;
    }

    public boolean isTreeEmpty(Node root) {
        return (root == null);
    }

}
