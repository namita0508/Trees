package trees.tree;

import org.junit.Test;
import trees.TestUtility;
import trees.traversal.OrderTraversalsRecursive;

import static org.junit.Assert.assertEquals;

public class TreeOperationsTest {
    TestUtility testUtility = new TestUtility();
    TreeOperations treeOperations = new TreeOperations();

    @Test
    public void testFindLeftMax() {
        assertEquals("should match", 45, treeOperations.findLeftMax(testUtility.buildTree()).value);
    }

    /*
                  50
                 /  \
               40   60
              /\    / \
            30 45  55 70

  */
    @Test
    public void testDeleteLeafNode() {
        Node root = testUtility.buildTree();
        OrderTraversalsRecursive orderTraversalsRecursive = new OrderTraversalsRecursive();
        //expected output: 30, 40, 45, 50, 55, 60. 70
        orderTraversalsRecursive.inOrderTraversal(root);
        System.out.println("\n After deletion: ");
        orderTraversalsRecursive.inOrderTraversal(treeOperations.delete(root, 55));

    }

    @Test
    public void testDeleteNonLeafNode() {
        Node root = testUtility.buildTree();
        OrderTraversalsRecursive orderTraversalsRecursive = new OrderTraversalsRecursive();
        //expected output: 30, 40, 45, 50, 55, 60. 70
        orderTraversalsRecursive.inOrderTraversal(root);
        System.out.println("\n After deletion: ");
        orderTraversalsRecursive.inOrderTraversal(treeOperations.delete(root, 60));

    }

    @Test
    public void testDeleteRootNode() {
        Node root = testUtility.buildTree();
        OrderTraversalsRecursive orderTraversalsRecursive = new OrderTraversalsRecursive();
        //expected output: 30, 40, 45, 50, 55, 60. 70
        orderTraversalsRecursive.inOrderTraversal(root);
        System.out.println("\n After deletion: ");
        orderTraversalsRecursive.inOrderTraversal(treeOperations.delete(root, 50));

    }
}
