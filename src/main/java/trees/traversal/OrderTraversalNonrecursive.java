package trees.traversal;

import trees.tree.Node;

import java.util.Stack;

public class OrderTraversalNonrecursive {

//left root right
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
