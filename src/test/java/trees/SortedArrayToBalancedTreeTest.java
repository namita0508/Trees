package trees;

import org.junit.Test;
import trees.traversal.OrderTraversalsRecursive;
import trees.tree.Node;

public class SortedArrayToBalancedTreeTest {
    TestUtility testUtility = new TestUtility();
    SortedArrayToBalancedTree sortedArrayToBalancedTree = new SortedArrayToBalancedTree();
    OrderTraversalsRecursive orderTraversalsRecursive = new OrderTraversalsRecursive();

    @Test
    public void testBalancedTree() {
        int[] arr = {30, 40, 45, 50, 55, 60, 70};
        Node root = sortedArrayToBalancedTree.buildBalancedTree(arr);
        orderTraversalsRecursive.inOrderTraversal(root);
    }
}
