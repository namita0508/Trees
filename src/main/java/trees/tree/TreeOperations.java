package trees.tree;

public class TreeOperations {

    public Node insert(Node root, int value) {
        if(root == null)
            return new Node(value);

        Node current = root;

        while(true) {
            if(value >= current.value) {
                if (current.right == null) {
                    current.right = new Node(value);
                    break;
                } else
                    current = current.right;
            } else {
                if (current.left == null) {
                    current.left = new Node(value);
                    break;
                } else
                    current = current.left;
            }
        }
        return root;
    }

    public Node delete(Node root, int value) {
        if (root == null) return null;

        if(value > root.value) {
            root.right = delete(root.right, value);
        } else if (value < root.value) {
            root.left = delete(root.left, value);
        } else {
            //this is what I want to delete!
            if(root.left ==  null && root.right == null) {
                //leaf node
                root = null;
            } else if (root.left == null) {
                root = root.right;
            } else if (root.right == null) {
                root = root.left;
            } else {
                //both children exist
                Node leftMax = findLeftMax(root);
                root = leftMax;
                root.left = delete(root.left, leftMax.value);
            }
        }
        return root;
    }

    protected Node findLeftMax(Node root) {
        if (root == null) return null;

        Node temp = root.left;
        if (temp == null) return root;

        while(temp != null && temp.right != null) {
            temp = temp.right;
        }

        return temp;
    }

    protected Node find(Node root, int value) {
        Node current = root;

        while (current != null) {
            if (current.value == value)
                return current;
            else if (value > current.value) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return null;
    }
}
