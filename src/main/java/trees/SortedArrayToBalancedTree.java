package trees;

import trees.tree.Node;

public class SortedArrayToBalancedTree {

    /*
    Building a balanced tree from a sorted array, you want to pick the middle first as root -
    This dividdes equal number of nodes on each side
     */

    public Node buildBalancedTree(int[] sortedArray) {

        return getMiddleBST(sortedArray, 0, sortedArray.length - 1);
    }

    public Node getMiddleBST(int[] a, int start, int end) {
        if(start == end) {
            return new Node(a[start]);
        } else if (end < start) {
            return null;
        }
        int mid = (end + start)/2;
        Node root = new Node(a[mid]);
        root.right = getMiddleBST(a, mid+1, end);
        root.left = getMiddleBST(a, start, mid-1);
        return root;
    }
}
