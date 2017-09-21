package trees;

import trees.tree.Node;

public class CalculateBalance_HeightConcept {

    public int getHeight(Node root) {
        if (root == null)
            return 0;
        return (1 + Math.max(getHeight(root.left), getHeight(root.right)));
    }

    //Balance means that same height or a difference of 1 for all subtrees
    public int isBalanced(Node root) {
        if (root == null)
        return 0;

        int leftHeight = isBalanced(root.left);

        int rightHeight = isBalanced(root.right);

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        } else
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public Boolean isBalancedBruteForce(Node root) {
        if (root == null) return true;

        isBalancedBruteForce(root.left);
        if (Math.abs(getHeight(root.left) - getHeight(root.right)) > 1)
            return false;
        isBalancedBruteForce(root.right);

    }


}
