package trees.traversal;

import org.junit.Test;
import trees.TestUtility;

public class LevelOrderTest {
    TestUtility testUtility = new TestUtility();
    LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();

    @Test
    public void testLevelOrder () {
        levelOrderTraversal.levelOrder(testUtility.buildTree());
    }
}
