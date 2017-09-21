package trees.traversal;

import org.junit.Test;
import trees.TestUtility;

public class OrderRecursiveTest {
    OrderTraversalsRecursive orderTraversals = new OrderTraversalsRecursive();
    TestUtility testUtility = new TestUtility();

    @Test
    public void printInorder() {
        //expected output: 30, 40, 45, 50, 55, 60. 70
        orderTraversals.inOrderTraversal(testUtility.buildTree());
    }

    @Test
    public void printPostorder() {
        //expected output: 30, 45, 40, 55, 70, 60, 50
        orderTraversals.postOrderTraversal(testUtility.buildTree());
    }

    @Test
    public void printPreorder() {
        //expected output: 50, 40, 30, 45, 60, 55, 70
        orderTraversals.preOrderTraversal(testUtility.buildTree());
    }
}
