package code401challenges;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsomorphicStringsTest {

    IsomorphicStrings test = new IsomorphicStrings();

    String test1Input1;
    String test1Input2;

    String test2Input1;
    String test2Input2;

    String test3Input1;
    String test3Input2;

    String test4Input1;
    String test4Input2;

    String test5Input1;
    String test5Input2;

    String test6Input1;
    String test6Input2;

    String test7Input1;
    String test7Input2;

    @Before
    public void setup() {
        test1Input1 = "";
        test1Input2 = "";

        test2Input1 = "a";
        test2Input2 = "b";

        test3Input1 = "add";
        test3Input2 = "egg";

        test4Input1 = "foo";
        test4Input2 = "bar";

        test5Input1 = "abcd";
        test5Input2 = "aabb";

        test6Input1 = "abcabc";
        test6Input2 = "xyzxyz";

        test7Input1 = "abcabc";
        test7Input2 = "xbexyz";
    }

    @Test
    public void isIsomorphic1() {
        assertTrue(test.isIsomorphic(test1Input1, test1Input2));
    }

    @Test
    public void isIsomorphic2() {
        assertTrue(test.isIsomorphic(test2Input1, test2Input2));
    }

    @Test
    public void isIsomorphic3() {
        assertTrue(test.isIsomorphic(test3Input1, test3Input2));
    }

    @Test
    public void isIsomorphic4() {
        assertFalse(test.isIsomorphic(test4Input1, test4Input2));
    }

    @Test
    public void isIsomorphic5() {
        assertFalse(test.isIsomorphic(test5Input1, test5Input2));
    }

    @Test
    public void isIsomorphic6() {
        assertTrue(test.isIsomorphic(test6Input1, test6Input2));
    }

    @Test
    public void isIsomorphic7() {
        assertFalse(test.isIsomorphic(test7Input1, test7Input2));
    }

}