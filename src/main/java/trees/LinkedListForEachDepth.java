package trees;

import trees.tree.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LinkedListForEachDepth {

    //Naive approach. Space complexity 2n extra space, runtime complexity O(n)
    public ArrayList<List<Node>> getListForEachDepth(Node root) {
        ArrayList<List<Node>> depthList = new ArrayList<List<Node>>();

        Stack a = new Stack();
        Stack b = new Stack();

        //start with an active stack with root and then push all children of active stack in a collection stack
        // and exchange the stack roles when active stack is empty
        a.push(root);
        Stack activeStack = a;
        Stack collectionStack = b;
        depthList.add(new ArrayList<Node>());

        while (true) {
            Node popped = (Node) activeStack.pop();
            depthList.get(depthList.size() - 1).add(popped);

            if (popped.left != null) {
                collectionStack.push(popped.left);
            }
            if (popped.right != null) {
                collectionStack.push(popped.right);
            }

            if(activeStack.empty() && collectionStack.empty()) {
                break;
            }
            //create new LinkList when active stack is emptied
            if(activeStack.empty() && !collectionStack.empty()) {
                activeStack = a.empty() ? b : a;
                collectionStack = a.empty() ? a : b;
                depthList.add(new ArrayList<Node>());

            }
        }
        return depthList;
    }

    public ArrayList<List<Node>> getListForEachDepth_Efficient(Node root) {

        return null;
    }


}
