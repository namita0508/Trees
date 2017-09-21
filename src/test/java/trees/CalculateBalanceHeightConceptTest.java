package trees;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculateBalanceHeightConceptTest {
    TestUtility utility = new TestUtility();
    CalculateBalance_HeightConcept calculateBalance = new CalculateBalance_HeightConcept();

    @Test
    public void testTreeHeight() {
        assertEquals("should match", 3,  calculateBalance.getHeight(utility.buildTree()));
    }

    @Test
    public void testTreeBalance() {
        assertEquals("should match", 3, calculateBalance.isBalanced(utility.buildTree()));
    }

    @Test
    public void testTreeImbalance() {
        assertEquals("should match", -1, calculateBalance.isBalanced(utility.buildTreeImbalance()));
    }
}
