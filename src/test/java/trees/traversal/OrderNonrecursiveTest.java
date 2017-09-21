package trees.traversal;

import org.junit.Test;
import trees.TestUtility;

public class OrderNonrecursiveTest {
    TestUtility testUtility = new TestUtility();
    OrderTraversalNonrecursive traversal = new OrderTraversalNonrecursive();

    @Test
    public void testInorder() {
        //expected output: 30, 40, 45, 50, 55, 60. 70
        traversal.inOrderTraversal(testUtility.buildTree());
    }

    @Test
    public void testPreorder() {
        //expected output: 50, 40, 30, 45, 60, 55, 70
        traversal.preOrderTraversal(testUtility.buildTree());
    }

    @Test
    public void testPostorder() {
        //expected output: 30, 45, 40, 55, 70, 60, 50
        traversal.postOrderTraversal(testUtility.buildTree());
    }
}
