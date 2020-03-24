package code401challenges;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    int[] testArray;
    InsertionSort test = new InsertionSort();

    @Before
    public void setup() {
        testArray = new int[]{8,4,23,42,16,15};
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertionSort() {
        int[] input = new int[]{9, 2, 5, 4, 13, 8, 1};
        int[] expected = new int[]{1, 2, 4, 5, 8, 9, 13};

        test.insertionSort(input);
        Assert.assertArrayEquals(expected, input);
    }
}