package code401challenges.utilities;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    MultiBracketValidation test;

    @Before
    public void setUp() throws Exception {
        test = new MultiBracketValidation();
    }

    @Test
    public void validate1() {
        boolean result = test.validate("{}");

        assertTrue(result);
    }

    @Test
    public void validate2() {
        boolean result = test.validate("{}(){}");

        assertTrue(result);
    }

    @Test
    public void validate3() {
        boolean result = test.validate("()[[Extra Characters]]");

        assertTrue(result);
    }

    @Test
    public void validate4() {
        boolean result = test.validate("(){}[[]]");

        assertTrue(result);
    }

    @Test
    public void validate5() {
        boolean result = test.validate("{}{Code}[Fellows](())");

        assertTrue(result);
    }

    @Test
    public void validate6() {
        boolean result = test.validate("[({}]");

        assertFalse(result);
    }

    @Test
    public void validate7() {
        boolean result = test.validate("(](");

        assertFalse(result);
    }

    @Test
    public void validate8() {
        boolean result = test.validate("{(})");

        assertFalse(result);
    }
}