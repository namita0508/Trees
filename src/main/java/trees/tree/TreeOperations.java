package trees.tree;

public class TreeOperations {

    /*
   Add a pointing node to root, and move it until its null.
   If it's right or left connection is null, then you insert the new node there.
    */
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

    /*
    Deleting leaf: simple. Mark as null.
    If non-leaf deletion:
      only right side: replace with right child
      only left side: replace with left child
      both sides:  replace value with left side's Max or right side's Min
                   and delete the leftMax or rightMin

    Make it recursive: Delete method returns Root so each subtree can call delete recursively
     */
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
                root.value = leftMax.value;
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

}
