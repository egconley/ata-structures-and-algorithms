package code401challenges.stacksandqueues;

public class Node {

    public String item;
    public Node next;

    public Node() {
        next = null;
        item = null;
    }

    public Node(String newItem, Node nextNode) {
        item = newItem;
        next = nextNode;
    }

    public String getCurrent() {
        return item;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node newNext) {
        next = newNext;
    }

}
