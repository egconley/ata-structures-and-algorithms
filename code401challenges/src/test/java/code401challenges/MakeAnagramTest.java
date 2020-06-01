package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class MakeAnagramTest {

    MakeAnagram test = new MakeAnagram();

    @Test
    public void makeAnagram1() {
        String a = "aab";
        String b = "ab";
        int actual = test.makeAnagram(a, b);
        assertEquals(1, actual);
    }

    @Test
    public void makeAnagram2() {
        String a = "aab";
        String b = "abb";
        int actual = test.makeAnagram(a, b);
        assertEquals(2, actual);
    }

    @Test
    public void makeAnagram3() {
        String a = "aabc";
        String b = "abbe";
        int actual = test.makeAnagram(a, b);
        assertEquals(4, actual);
    }
}