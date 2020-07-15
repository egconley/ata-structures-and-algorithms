package code401challenges.tree;

public class KthSmallestInBST {
    public Node findKthSmallest(Node root, int k) {

        if (root==null) {
            return null;
        } else {
            int sizeLeft = findSize(root.left);
            if (sizeLeft==(k-1)) {
                return root;
            } else if (sizeLeft==k && root.left!=null) {
                return root.left;
            } else if (sizeLeft > k) {
                findKthSmallest(root.left, k);
            } else {
                return findKthSmallest(root.right, k-findSize(root.left)-1);
            }
            return null;
        }
    }

    public int findSize(Node current) {
        if (current==null) {
            return 0;
        } else {
            return 1 + findSize(current.left) + findSize(current.right);
        }
    }
}
