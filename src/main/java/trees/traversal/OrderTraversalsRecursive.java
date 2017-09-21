package trees.traversal;

import trees.tree.Node;

public class OrderTraversalsRecursive {
    /*
                     50
                    /  \
                  40   60
                 /\    / \
               30 45  55 70

     */

    //left root right: 30, 40, 45, 50, 55, 60, 70
    //USES: Sorting BST
    public void inOrderTraversal(Node root) {
        if (root == null)
            return;
        inOrderTraversal(root.left);
        System.out.println(root.value);
        inOrderTraversal(root.right);

    }

    //root left right: 50, 40, 30, 45, 60, 55, 70
    //USES: To create tree replica of tree from an array.
    public void preOrderTraversal(Node root) {
        if (root == null)
            return;
        System.out.println(root.value);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }

    //left right root: 30, 45, 40, 55, 70, 60, 50
    //USES: Delete a tree from leaf to root
    public void postOrderTraversal(Node root) {
        if (root == null)
            return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.value);
    }
}
