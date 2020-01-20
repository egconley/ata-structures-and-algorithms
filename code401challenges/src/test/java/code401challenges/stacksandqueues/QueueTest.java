package code401challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void enqueue() {
        Queue<String> testQueue = new Queue<String>();
        testQueue.enqueue("a");
        testQueue.enqueue("b");
        testQueue.enqueue("c");
        assertEquals("{ a } -> { b } -> { c } -> NULL", testQueue.toString());
    }

    @Test
    public void dequeue() {
        Queue<String> testQueue = new Queue<String>();
        testQueue.enqueue("a");
        testQueue.enqueue("b");
        testQueue.enqueue("c");
        assertEquals("a", testQueue.dequeue());
    }

    @Test (expected = NullPointerException.class)
    public void dequeue_exception() {
        Queue<String> testQueue = new Queue<String>();
        testQueue.dequeue();
    }

    @Test
    public void peek() {
        Queue<String> testQueue = new Queue<String>();
        testQueue.enqueue("a");
        testQueue.enqueue("b");
        testQueue.enqueue("c");
        assertEquals("a", testQueue.peek());
    }

    @Test (expected = NullPointerException.class)
    public void peek_exception() {
        Queue<String> testQueue = new Queue<String>();
        testQueue.peek();
    }

    @Test
    public void isEmpty() {
        Queue<String> testQueue = new Queue<String>();
        assertTrue(testQueue.isEmpty());
        testQueue.enqueue("a");
        assertFalse(testQueue.isEmpty());
    }
}