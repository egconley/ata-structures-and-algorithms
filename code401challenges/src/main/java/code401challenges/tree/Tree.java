package code401challenges.tree;

import java.util.ArrayList;
import java.util.LinkedList;

public class Tree<T> {

    Node<T> root;

    public Tree(Node<T> root) {
        this.root = root;
    }

    public Node<T> getRoot() {
        return root;
    }

    public LinkedList<T> preOrder() {
        return preOrder(this.root, new LinkedList<>());
    }

    private LinkedList<T> preOrder(Node<T> root, LinkedList<T> order) {
        if (root != null) {
            order.add(root.value);
            preOrder(root.left, order);
            preOrder(root.right, order);
        }
        return order;
    }

    public LinkedList<T> inOrder() {
        return inOrder(this.root, new LinkedList<>());
    }

    private LinkedList<T> inOrder(Node<T> root, LinkedList<T> order) {
        if (root != null) {
            inOrder(root.left, order);
            order.add(root.value);
            inOrder(root.right, order);
        }
        return order;
    }

    public LinkedList<T> postOrder() {
        return postOrder(this.root, new LinkedList<>());
    }

    private LinkedList<T> postOrder(Node<T> root, LinkedList<T> order) {
        if (root != null) {
            postOrder(root.left, order);
            postOrder(root.right, order);
            order.add(root.value);
        }
        return order;
    }

}
