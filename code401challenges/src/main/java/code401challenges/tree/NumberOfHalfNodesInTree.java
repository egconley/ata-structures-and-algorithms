package code401challenges.tree;

public class NumberOfHalfNodesInTree {
    public int numberOfHalfNodes(Node root) {
        return helper(root, 0);
    }

    public int helper(Node current, int count) {
        if (current==null || (current.left==null && current.right==null)) {
            return count;
        } else if (current.left!=null && current.right!= null) {
            return helper(current.left, count) + helper(current.right, count);
        } else if (current.left!=null) {
            return helper(current.left, count+1);
        } else {
            return helper(current.right, count+1);
        }
    }
}
