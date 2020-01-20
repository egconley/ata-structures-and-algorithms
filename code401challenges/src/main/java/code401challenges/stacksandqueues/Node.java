package code401challenges.stacksandqueues;

public class Node<T> {

    public T item;
    public Node<T> next;

    public Node() {
        next = null;
        item = null;
    }

    public Node(T newItem, Node<T> nextNode) {
        item = newItem;
        next = nextNode;
    }

    public T getCurrent() {
        return item;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> newNext) {
        next = newNext;
    }

}
