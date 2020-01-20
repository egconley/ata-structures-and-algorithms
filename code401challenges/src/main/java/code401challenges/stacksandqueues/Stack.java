package code401challenges.stacksandqueues;

public class Stack<T> {
    Node<T> top;


    public Stack() {
        top = null;
    }

    public void push(T value) {
        top = new Node<T>(value, top);
    }

    public T pop() {
        T popped;
        if (top == null) {
            throw new NullPointerException();
        } else {
            popped = top.getCurrent();
            top = top.getNext();
        }
        return popped;
    }

    public T peek() {
        if (top == null) {
            throw new NullPointerException();
        } else {
            return top.getCurrent();
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public String toString() {
        Node<T> position = top;
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
