package trees;

public class InorderSuccessor {

    /*
                     50
                    /  \
                  40   60
                 /\    / \
               30 45  55 70

     if non leaf:
        if right = null return null
        if right.left = null return right child
        else return left most child of right.
     if leaf:
        if left leaft, return parent
        if right leaf
            while parent is not left child OR parent is root
                parent = grandparent;
                return parent;

     */
}
