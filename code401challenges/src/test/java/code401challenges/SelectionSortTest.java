package code401challenges;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SelectionSortTest {

    int[] testArray;
    SelectionSort test = new SelectionSort();

    @Before
    public void setup() {
        testArray = new int[]{8,4,23,42,16,15};
    }

    @Test
    public void selectionSort() {
        int[] input = new int[]{9, 2, 5, 4, 13, 8, 1};
        int[] expected = new int[]{1, 2, 4, 5, 8, 9, 13};

        test.selectionSort(input);
        Assert.assertArrayEquals(expected, input);
    }
}