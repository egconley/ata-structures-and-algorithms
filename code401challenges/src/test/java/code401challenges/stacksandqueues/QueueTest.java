package code401challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void enqueue() {
        Queue testQueue = new Queue();
        testQueue.enqueue("a");
        testQueue.enqueue("b");
        testQueue.enqueue("c");
        assertEquals("{ a } -> { b } -> { c } -> NULL", testQueue.toString());
    }

    @Test
    public void dequeue() {
        Queue testQueue = new Queue();
        testQueue.enqueue("a");
        testQueue.enqueue("b");
        testQueue.enqueue("c");
        assertEquals("a", testQueue.dequeue());
    }

    @Test (expected = NullPointerException.class)
    public void dequeue_exception() {
        Queue testQueue = new Queue();
        testQueue.dequeue();
    }

    @Test
    public void peek() {
        Queue testQueue = new Queue();
        testQueue.enqueue("a");
        testQueue.enqueue("b");
        testQueue.enqueue("c");
        assertEquals("a", testQueue.peek());
    }

    @Test (expected = NullPointerException.class)
    public void peek_exception() {
        Queue testQueue = new Queue();
        testQueue.peek();
    }

    @Test
    public void isEmpty() {
        Queue testQueue = new Queue();
        assertTrue(testQueue.isEmpty());
        testQueue.enqueue("a");
        assertFalse(testQueue.isEmpty());
    }
}