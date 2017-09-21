package trees.traversal;

import trees.tree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    public void levelOrder(Node root) {
        Queue queue = new LinkedList<Node>();
        queue.add(root);
        int height = 0;

        while(!queue.isEmpty()) {
            int size = queue.size();
            height++;
            while (size > 0) {
                Node node = (Node) queue.remove();
                size --;
                System.out.print(node.value + " ");
                if(node.left != null)
                    queue.offer(node.left);
                if(node.right != null)
                    queue.offer(node.right);
            }
        }

        System.out.println("\n Height = " + height);

    }
}
