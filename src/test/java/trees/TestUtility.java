package trees;

import trees.tree.BinarySearchTree;
import trees.tree.Node;

public class TestUtility {

    /*
                     50
                    /  \
                  40   60
                 /\    / \
               30 45  55 70

     */

    public Node buildTree() {
        Node root = new Node(50);
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(60, root);
        bst.insert(40, root);
        bst.insert(30, root);
        bst.insert(45, root);
        bst.insert(55, root);
        bst.insert(70, root);
        return root;
    }

    public Node buildTreeImbalance() {
        Node root = new Node(50);
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(60, root);
        bst.insert(40, root);
        bst.insert(30, root);
        bst.insert(45, root);
        bst.insert(30, root);
        bst.insert(45, root);
        return root;
    }
}
