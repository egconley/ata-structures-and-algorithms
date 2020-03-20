package code401challenges.linkedlist;

// source: https://www.csie.ntu.edu.tw/~cyy/courses/oop/13summer/chap15java5th.pdf

public class Node {
    private String item;
    private Node next;

    public Node() {
        next = null;
        item = null;
    }

    public Node(String newItem, int newCount, Node linkValue) {
        setData(newItem, newCount);
        next = linkValue;
    }

    public void setData(String newItem, int newCount) {
        item = newItem;
    }

    public void setNext(Node newLink) {
        next = newLink;
    }

    public String getItem() {
        return item;
    }

    public Node getNext() {
        return next;
    }

    public String toString() {
        return item + " -> " + (this.next == null ? "NULL" : this.next.toString());
    }
}
