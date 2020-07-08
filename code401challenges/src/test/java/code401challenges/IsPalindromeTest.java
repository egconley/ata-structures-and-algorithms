package code401challenges;

import org.junit.Assert;
import org.junit.Test;

public class IsPalindromeTest {

    IsPalindrome test = new IsPalindrome();

    @Test
    public void isPalindrome() {
        Assert.assertTrue(test.isPalindrome("tacocat"));
        Assert.assertFalse(test.isPalindrome("ellen"));
        Assert.assertTrue(test.isPalindrome("a"));
    }
}