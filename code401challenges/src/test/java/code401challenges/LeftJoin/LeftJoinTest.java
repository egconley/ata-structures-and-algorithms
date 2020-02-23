package code401challenges.LeftJoin;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Hashtable;

import static org.junit.Assert.*;

public class LeftJoinTest {
    LeftJoin test = new LeftJoin();

    Hashtable<String, String> ht1;
    Hashtable<String, String> ht2;

    @Before
    public void setup() {
        ht1 = new Hashtable<>();
        ht2 = new Hashtable<>();
        ht1.put("A", "a");
        ht1.put("B", "b");
        ht1.put("C", "c");
        ht1.put("D", "d");
        ht2.put("A", "aa");
        ht2.put("B", "bb");
        ht2.put("E", "ee");
        ht2.put("F", "ff");
    }

    @Test
    public void leftJoin() {
        assertTrue(test.leftJoin(ht1, ht2)[0][0]=="A");
        assertTrue(test.leftJoin(ht1, ht2)[0][2]=="aa");
    }
}