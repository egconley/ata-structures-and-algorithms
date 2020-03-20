package code401challenges.linkedlist;

// source: https://www.csie.ntu.edu.tw/~cyy/courses/oop/13summer/chap15java5th.pdf

import java.util.NoSuchElementException;

public class LinkedList {

    public static void main(String[] args) {
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

    // appends new node to end of list
    public void append(String itemName, int itemCount) {
        Node newNode = new Node(itemName, itemCount, null);
        Node position = head;
        if (position == null) {
            insert(itemName, itemCount);
        } else {
            while (position.getNext() != null) {
                position = position.getNext();
            }
            position.setNext(newNode);
        }
    }

    public void insertAfter(String item, int newItemCount, String newItemName) {
        Node newNode = new Node(newItemName, newItemCount, null);
        Node position = head;
        Node nextNode = position.getNext();
        while(!position.getItem().equals(item)) {
            position = position.getNext();
            nextNode = position.getNext();
        }
        position.setNext(newNode);
        newNode.setNext(nextNode);
    }

    public void insertBefore(String item, int newItemCount, String newItemName) {
        Node newNode = new Node(newItemName, newItemCount, null);
        Node position = head;
        Node nextNode = position.getNext();
        while(!nextNode.getItem().equals(item)) {
            position = position.getNext();
            nextNode = position.getNext();
        }
        position.setNext(newNode);
        newNode.setNext(nextNode);
    }

    // removes head and returns true if the list contained at least one node.  Returns false if the list was empty
    public boolean deleteHeadNode() {
        if (head != null) {
            head = head.getNext();
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
            position = position.getNext();
        }
        return count;
    }

    // returns kth value from end of list
    public String getKthFromEnd(int k) {
        int size = 0;
        Node position = head;
        while (position != null) {
            size++;
            position = position.getNext();
        }

        if (k >= size || 0 > k) {
            throw new IndexOutOfBoundsException();
        } else {
            int iterationsToTarget = size - k;
            position = head;
            while ( iterationsToTarget > 1 ) {
                iterationsToTarget--;
                position = position.getNext();
            }
        }
        return position.getItem();
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
            position = position.getNext();
        }
        return null; //target was not found.
    }

    // Define a method called toString (or __str__ in Python) which takes in no arguments
    // and returns a string representing all the values in the Linked List, formatted as:
    // "{ a } -> { b } -> { c } -> NULL"

    // update this to match with new toString() method
    public String toString() {
        Node position = head;
        String LinkedListString = "";
        while (position != null) {
            //String itemAsString = "{ " + position.getItem() + ", " + position.getCount() + " }";
            //could use .append (string builder)
            String itemAsString = "{ " + position.getItem() + " }";
            LinkedListString += itemAsString + " -> ";

            position = position.getNext();
        }
        LinkedListString += "NULL";
        return LinkedListString;
    }
}
