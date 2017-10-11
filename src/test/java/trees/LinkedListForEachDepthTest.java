package trees;

import org.junit.Test;
import trees.tree.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

 /*
                     50
                    /  \
                  40   60
                 /\    / \
               30 45  55 70
 */
public class LinkedListForEachDepthTest {
    TestUtility testUtility = new TestUtility();
    LinkedListForEachDepth linkedListForEachDepth = new LinkedListForEachDepth();

    @Test
    public void testDepthList() {
        ArrayList<List<Node>> depthList = linkedListForEachDepth.getListForEachDepth(testUtility.buildTree());
        for (List<Node> list : depthList) {
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i).value + " ");
            }
            System.out.println();
        }
    }

     @Test
     public void testDepthList_PassingLevel() {
         ArrayList<List<Node>> depthList = linkedListForEachDepth.getListForEachDepth_PassingLevels(testUtility.buildTree());
         for (List<Node> list : depthList) {
             for (int i = 0; i < list.size(); i++) {
                 System.out.print(list.get(i).value + " ");
             }
             System.out.println();
         }
     }

     @Test
     public void testDepthList_UsingList() {
         ArrayList<LinkedList<Node>> depthList = linkedListForEachDepth.getListForEachDepth_UsingList(testUtility.buildTree());
         for (List<Node> list : depthList) {
             for (int i = 0; i < list.size(); i++) {
                 System.out.print(list.get(i).value + " ");
             }
             System.out.println();
         }
     }
}
