package trees.traversal;

import trees.tree.Node;

import java.util.Stack;

public class OrderTraversalNonrecursive {

    //left root right: 30, 40, 45, 50, 55, 60, 70
/*
Use One stack: Push root. Start popping until empty.
Print logic: if both left and right are null
Pushing in reverse order, if not null - right, root, left
Push already popped as a new Node with right and left as null as they have been examined
 */
    public void inOrderTraversal (Node root) {
        Stack stack = new Stack();
        stack.push(root);
            while (!stack.empty()) {
                Node popped = (Node) stack.pop();
                if(popped.right == null && popped.left == null) {
                    System.out.println(popped.value);
                    continue;
                }
                if (popped.right != null)
                    stack.push(popped.right);
                stack.push(new Node(popped.value));
                if (popped.left != null)
                    stack.push(popped.left);
            }


    }

    //left right root
    public void postOrderTraversal (Node root) {
        Stack stack = new Stack();
        stack.push(root);

        while (!stack.empty()) {
            Node popped = (Node) stack.pop();
            if (popped.left == null && popped.right == null) {
                System.out.println(popped.value);
                continue;
            }
            stack.push(new Node(popped.value));
            if (popped.right != null)
                stack.push(popped.right);
            if (popped.left != null)
                stack.push(popped.left);

        }
    }

    //root left right
    public void preOrderTraversal (Node root) {
        Stack stack = new Stack();
        stack.push(root);

        while (!stack.empty()) {
            Node popped = (Node) stack.pop();
            if (popped.left == null && popped.right == null) {
                System.out.println(popped.value);
                continue;
            }
            if (popped.right != null)
                stack.push(popped.right);
            if (popped.left != null)
                stack.push(popped.left);
            stack.push(new Node(popped.value));

        }
    }
}
