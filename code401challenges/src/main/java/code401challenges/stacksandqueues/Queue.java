package code401challenges.stacksandqueues;

public class Queue {

    Node front;
    Node back;

    public Queue() {
        front = null;
        back = null;
    }

    public void enqueue(String value) {
        Node newNode = new Node(value, null);
        if (back == null) {
            front = newNode;
            back = front;
        } else {
            back.setNext(new Node(value, null));
            back = back.next;
        }
    }

    public String dequeue() {
        String dequeued = null;
        if (front == null) {
            throw new NullPointerException();
        } else {
            dequeued = front.getCurrent();
            front = front.getNext();
        }
        return dequeued;
    }

    public String peek() {
        if (front == null) {
            throw new NullPointerException();
        } else {
            return front.getCurrent();
        }
    }

    public boolean isEmpty() {
        return front == null;
    }

    public String toString() {
        Node position = front;
        String StackString = "";
        while (position != null) {

            String current = "{ " + position.getCurrent() + " }";
            StackString += current + " -> ";

            position = position.getNext();

        }
        StackString += "NULL";
        return StackString;
    }

}
