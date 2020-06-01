package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class BetterFibonacciTest {

    BetterFibonacci test = new BetterFibonacci();

    @Test
    public void betterFibonacci() {
        assertEquals(0, test.betterFibonacci(0));
        assertEquals(1, test.betterFibonacci(1));
        assertEquals(13, test.betterFibonacci(7));
    }
}