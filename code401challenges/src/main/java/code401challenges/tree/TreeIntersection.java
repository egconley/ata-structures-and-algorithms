package code401challenges.tree;

import java.util.HashSet;

public class TreeIntersection {

    HashSet<Object> set = new HashSet<>();

    public HashSet<Object> treeIntersection(Node root1, Node root2) {
        if (root1==null || root2==null) {
            return null;
        } else {
            if (root1.value==root2.value) {
                set.add(root1.value);
            }
            treeIntersection(root1.left, root2.left);
            treeIntersection(root1.right, root2.right);
        }
        return set;
    }
}
