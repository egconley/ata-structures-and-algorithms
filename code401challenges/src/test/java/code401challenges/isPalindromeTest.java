package code401challenges;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class isPalindromeTest {

    isPalindrome test = new isPalindrome();

    @Test
    public void firstChar() {
        Assert.assertEquals('e', test.firstChar("ellen"));
    }

    @Test
    public void lastChar() {
        Assert.assertEquals('n', test.lastChar("ellen"));
    }

    @Test
    public void middleChars() {
        Assert.assertEquals("lle", test.middleChars("ellen"));
    }

    @Test
    public void isPalindrome() {
        Assert.assertTrue(test.isPalindrome("tacocat"));
        Assert.assertFalse(test.isPalindrome("ellen"));
        Assert.assertTrue(test.isPalindrome("a"));
    }
}