package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class PermutationsTest {

    Permutations test = new Permutations();

    @Test
    public void permutation() {
        assertTrue(test.permutation("CAT", "TCA"));
        assertFalse(test.permutation("DOG", "CAT"));
        assertFalse(test.permutation("n", "nn"));
        assertTrue(test.permutation(null, null));
        assertFalse(test.permutation("cat", "CAT"));
    }
}