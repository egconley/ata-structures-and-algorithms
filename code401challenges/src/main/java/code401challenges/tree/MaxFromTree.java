package code401challenges.tree;

import java.util.HashSet;
import java.util.LinkedList;

public class MaxFromTree {

    //        60
    //       /  \
    //      45    100
    //     /\    / \
    //    55 90 30  20

    public Integer findMax(Tree<Integer> tree) {
        Integer possMax=0;
        return findMaxHelper(tree.getRoot(), possMax);
    }

    private Integer findMaxHelper(Node<Integer> current, Integer possMax) {
        if (current != null) {
            if (current.value > possMax) {
                possMax = current.value;
            }
            findMaxHelper(current.left, possMax);
            findMaxHelper(current.right, possMax);
            return possMax;
        }
        else return null;
    }
}
