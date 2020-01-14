package code401challenges.linkedlist;

// source: https://www.csie.ntu.edu.tw/~cyy/courses/oop/13summer/chap15java5th.pdf

public class Node {
    private String item;
    private int count;
    private Node link;

    public Node() {
        link = null;
        item = null;
        count = 0;
    }

    public Node(String newItem, int newCount, Node linkValue) {
        setData(newItem, newCount);
        link = linkValue;
        //System.out.println("link = " + link + ", item = " + item);
    }

    public void setData(String newItem, int newCount) {
        item = newItem;
        count = newCount;
    }

    public void setLink(Node newLink) {
        link = newLink;
    }

    public String getItem() {
        return item;
    }

    public int getCount() {
        return count;
    }

    public Node getLink() {
        return link;
    }

    // fix to match your code
//    public String toString() {
//        return item + " -> " + (this.nextNode == null ? "NULL" : this.nextNode.toString());
//    }
}
