package code401challenges.tree;

public class BinarySearchTree {

    Node<Integer> root;

    public BinarySearchTree(Node<Integer> root) {
        this.root = root;
    }

    public BinarySearchTree() {
        root = null;
    }

    public void add(int value) {
        root = add(root, value);
    }

    Node<Integer> add(Node<Integer> root, int value) {

        if (root == null) {
            root = new Node<Integer>(value);
            return root;
        }

        if (value < root.value)
            root.left = add(root.left, value);
        else if (value > root.value)
            root.right = add(root.right, value);

        return root;
    }

    public boolean contains(Node<Integer> root, int searchVal) {
        if (root != null) {
            if (root.value==searchVal)
                return true;
            else if (root.value > searchVal) {
                return contains(root.left, searchVal);
            }
            return contains(root.right, searchVal);
        }
        else return false;
    }
}
