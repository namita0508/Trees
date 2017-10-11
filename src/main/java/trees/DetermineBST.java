package trees;

import trees.tree.Node;

public class DetermineBST {
    static int currentValue = Integer.MIN_VALUE;

    public Boolean isBST(Node root) {
        if (root == null)
            return false;

        if (isLeaf(root)) {
            return true;
        }

        if ((root.left ==  null || (root.left != null && root.left.value < root.value))
                && (root.right ==  null || (root.right != null && root.right.value > root.value))) {
            if (root.left ==  null) {
                return isBST(root.right);
            } else if (root.right == null) {
                return isBST(root.left);
            } else {
                return isBST(root.left) && isBST(root.right);
            }
        } else {
            return false;
        }

    }

    protected Boolean isLeaf(Node node) {
        if (node != null && node.left == null && node.right == null) {
            return true;
        } else
            return false;
    }

    /*
    Naive approach is to do inorder traversal, store result in an array and then check if the array is in sorted order
     */
}
