package code401challenges.stacksandqueues;

public class PseudoQueue<T> {

    Stack<T> front = new Stack<>();
    Stack<T>  back = new Stack<>();

    public void enqueue(T value) {
        back.push(value);
    }

    public T dequeue() {
        while (!back.toString().equals("NULL")) {
            front.push(back.pop());
        }
        return front.pop();
    }
}
