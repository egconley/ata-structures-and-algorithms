package code401challenges;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void binarySearch() {
        BinarySearch testBinarySearch_ValueNotFound = new BinarySearch();

        int[] testArray = new int[] {1,2,3,4,5,6,7,8,9,10,11,12};
        int testValue1 = 145;

        int result1 = testBinarySearch_ValueNotFound.binarySearch(testArray, testValue1);

        int expected1 = -1;

        Assert.assertEquals(expected1, result1);

        /////

        BinarySearch testBinarySearch_ValueFirstInArray = new BinarySearch();

        int testValue2 = 1;

        int result2 = testBinarySearch_ValueFirstInArray.binarySearch(testArray, testValue2);

        int expected2 = 0;

        Assert.assertEquals(expected2, result2);

        /////

        BinarySearch testBinarySearch_ValueLastInArray = new BinarySearch();

        int testValue3 = 12;

        int result3 = testBinarySearch_ValueLastInArray.binarySearch(testArray, testValue3);

        int expected3 = 11;

        Assert.assertEquals(expected3, result3);
    }
}