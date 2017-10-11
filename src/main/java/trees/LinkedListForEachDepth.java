package trees;

import sun.awt.image.ImageWatched;
import trees.tree.Node;

import java.util.*;

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

//Passing levels and adding nodes on the level passed and recursive calling
    public ArrayList<List<Node>> getListForEachDepth_PassingLevels(Node root) {
       ArrayList<List<Node>> result = new ArrayList<List<Node>>();

        generateList(result, 0, root);
        return result;
    }

    protected void generateList(ArrayList<List<Node>> currentList, int level, Node root) {
        if (root ==  null)
            return;

        if (level == currentList.size()) { //i.e. level is more than size. Create a new list
            List<Node> list = new ArrayList<Node>();
            list.add(root);
            currentList.add(list);
        } else  {
            currentList.get(level).add(root);
        }
        generateList(currentList, level + 1, root.left);
        generateList(currentList, level + 1, root.right);
    }

    //Using a counter for outerlist and using previous inner list to make next innerlistx
    public ArrayList<LinkedList<Node>> getListForEachDepth_UsingList(Node root) {
        ArrayList<LinkedList<Node>> result = new ArrayList<LinkedList<Node>>();
        LinkedList<Node> currentList = new LinkedList<Node>();
        if(root != null)
        currentList.add(root);
        int current = 0;
        result.add(currentList);

        while (current < result.size()) {
            LinkedList<Node> newList = new LinkedList<Node>();
            for (int i = 0; i < result.get(current).size(); i++) {
                if (result.get(current).get(i).left != null) {
                    newList.add(result.get(current).get(i).left);
                }
                if (result.get(current).get(i).right != null) {
                    newList.add(result.get(current).get(i).right);
                }
            }
            if (!newList.isEmpty())
            result.add(newList);
           current ++;
        }

        return result;
    }


}
