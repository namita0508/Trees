package trees;

import org.junit.Test;
import trees.tree.Node;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DetermineBSTTest {
    TestUtility testUtility = new TestUtility();
    DetermineBST determineBST = new DetermineBST();

    @Test
    public void testBalancedTree () {
        assertTrue(determineBST.isBST(testUtility.buildTree()));
    }

    @Test
    public void testNull () {
        assertFalse(determineBST.isBST(null));
    }

    @Test
    public void testOneNode() {
        assertTrue(determineBST.isBST(new Node(45)));
    }

    @Test
    public void testImbalance2Nodes() {
        Node root = new Node(50);
        root.left = new Node(60);
        assertFalse(determineBST.isBST(root));
    }

    @Test
    public void testImbalance3Nodes() {
        Node root = new Node(50);
        root.left = new Node(40);
        root.right = new Node(45);
        assertFalse(determineBST.isBST(root));
    }

    @Test
    public void testImbalance3Levels() {
        assertFalse(determineBST.isBST(makeNonBst()));
    }

    private Node makeNonBst() {
        Node root = new Node(50);
        root.left = new Node(40);
        root.right = new Node(65);
        root.left.left = new Node(30);
        root.left.right = new Node(45);
        root.right.left = new Node(100);
        root.right.right = new Node(70);
        return root;
    }

}
