package trees.tree;

public class BinarySearchTree {

    public void insert(int value, Node root) {
        if (root == null) {
            root = new Node(value);
        }
        Node current = root;
        while (current != null) {
            if (value >= current.value) {
                if (current.right != null)
                    current = current.right;
                else {
                    current.right = new Node(value);
                    break;
                }
            } else {
                if (current.left != null)
                    current = current.left;
                else {
                    current.left = new Node(value);
                    break;
                }
            }
        }
    }
}
