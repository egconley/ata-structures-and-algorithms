package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertStarsTest {

    InsertStars test = new InsertStars();
    @Test
    public void insertPairStar() {
        assertTrue(test.insertPairStar("cac").equals("cac"));
        assertTrue(test.insertPairStar("cacc").equals("cac*c"));
        assertTrue(test.insertPairStar("caccoon").equals("cac*co*on"));
    }
}