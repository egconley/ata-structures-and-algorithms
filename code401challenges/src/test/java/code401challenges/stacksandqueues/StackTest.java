package code401challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void push() {
        Stack<String> testStack = new Stack<>();
        testStack.push("first thing");
        assertEquals("{ first thing } -> NULL", testStack.toString());
    }

    @Test
    public void pop() {
        Stack<String> testStack = new Stack<>();
        testStack.push("first thing");
        testStack.push("second thing");
        assertEquals("second thing", testStack.pop());
        assertEquals("first thing", testStack.pop());
    }

    @Test (expected = NullPointerException.class)
    public void pop_exception() {
        Stack<String> testStack = new Stack<>();
        testStack.pop();
    }

    @Test
    public void peek() {
        Stack<String> testStack = new Stack<>();
        testStack.push("first thing");
        testStack.push("second thing");
        assertEquals("second thing", testStack.peek());
    }

    @Test (expected = NullPointerException.class)
    public void peek_exception() {
        Stack<String> testStack = new Stack<>();
        testStack.peek();
    }

    @Test
    public void isEmpty() {
        Stack<String> testStack = new Stack<>();
        testStack.push("first thing");
        testStack.push("second thing");
        assertFalse(testStack.isEmpty());
        testStack.pop();
        testStack.pop();
        assertTrue(testStack.isEmpty());
    }
}