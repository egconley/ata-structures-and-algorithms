package code401challenges.stacksandqueues;

public class Stack {
    Node top;


    public Stack() {
        top = null;
    }

    public void push(String value) {
        top = new Node(value, top);
    }

    public String pop() {
        String popped;
        if (top == null) {
            throw new NullPointerException();
        } else {
            popped = top.getCurrent();
            top = top.getNext();
        }
        return popped;
    }

    public String peek() {
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
        Node position = top;
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
