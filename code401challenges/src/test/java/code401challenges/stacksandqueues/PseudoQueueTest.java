package code401challenges.stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    @Test
    public void enqueue() {
        PseudoQueue<Integer> test = new PseudoQueue<>();

        test.enqueue(1);
        test.enqueue(2);
        test.enqueue(3);

        assertEquals(1, test.dequeue().intValue());
    }

    @Test
    public void dequeue() {
    }
}