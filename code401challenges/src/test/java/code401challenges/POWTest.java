package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class POWTest {

    POW test = new POW();
    @Test
    public void powZero() {
        assertEquals(1, test.pow(5, 0), 0.001);
    }

    @Test
    public void powOne() {
        assertEquals(5, test.pow(5, 1), 0.001);
    }

    @Test
    public void powNegative() {
        assertEquals(0.5, test.pow(2, -1), 0.001);
    }

    @Test
    public void pow() {
        assertEquals(243, test.pow(3, 5), 0.001);
    }
}