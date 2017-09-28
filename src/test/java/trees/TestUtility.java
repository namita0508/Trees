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

Sorted order - 30 40 45 50 55 55 60 70
To create above tree: picking order - 50, 40, 60, 30, 45, 55, 70 i.e. middle of each part examined
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
