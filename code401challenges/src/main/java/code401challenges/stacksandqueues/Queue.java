package code401challenges.stacksandqueues;

public class Queue<T> {

    Node<T> front;
    Node<T> back;

    public Queue() {
        front = null;
        back = null;
    }

    public void enqueue(T value) {
        Node<T> newNode = new Node<T>(value, null);
        if (back == null) {
            front = newNode;
            back = front;
        } else {
            back.setNext(new Node<T>(value, null));
            back = back.next;
        }
    }

    public T dequeue() {
        T dequeued = null;
        if (front == null) {
            throw new NullPointerException();
        } else {
            dequeued = front.getCurrent();
            front = front.getNext();
        }
        return dequeued;
    }

    public T peek() {
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
        Node<T> position = front;
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
