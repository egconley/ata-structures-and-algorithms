package code401challenges.linkedlist;

// source: https://www.csie.ntu.edu.tw/~cyy/courses/oop/13summer/chap15java5th.pdf

public class LinkedList {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert("Apples", 1);
        list.insert("Bananas", 2);
        list.insert("Cantaloupe", 3);
        System.out.println(list.toString());
        System.out.println(list.size());
    }

    private Node head;

    public LinkedList() {
        head = null;
    }

    // Define a method called insert which takes any value as an argument
    // and adds a new node with that value to the head of the list with an O(1) Time performance.
    public void insert(String itemName, int itemCount) {
        head = new Node(itemName, itemCount, head);
    }

    // removes head and returns true if the list contained at least one node.  Returns false if the list was empty
    public boolean deleteHeadNode() {
        if (head != null) {
            head = head.getLink();
            return true;
        } else {
            return false;
        }
    }

    // returns the number of nodes in the list
    public int size() {
        int count = 0;
        Node position = head;
        while (position != null) {
            count++;
            position = position.getLink();
        }
        return count;
    }

    // Define a method called includes which takes any value as an argument
    // and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.
    public boolean includes(String item) {
        return (find(item)) != null;
    }

    // finds the first node containing the target item, and returns a reference to that node. If target is not in the list, null is returned.
    private Node find(String target) {
        Node position = head;
        String itemAtPosition;
        while (position != null) {
            itemAtPosition = position.getItem();
            if (itemAtPosition.equals(target)) {
                return position;
            }
            position = position.getLink();
        }
        return null; //target was not found.
    }

    // Define a method called toString (or __str__ in Python) which takes in no arguments
    // and returns a string representing all the values in the Linked List, formatted as:
    // "{ a } -> { b } -> { c } -> NULL"
    public String toString() {
        Node position = head;
        String LinkedListString = "";
        while (position != null) {
            //String itemAsString = "{ " + position.getItem() + ", " + position.getCount() + " }";
            String itemAsString = "{ " + position.getItem() + " }";
            LinkedListString += itemAsString + " -> ";

            position = position.getLink();
        }
        if (position == null) {
            LinkedListString += "NULL";
        }
        return LinkedListString;
    }
}
