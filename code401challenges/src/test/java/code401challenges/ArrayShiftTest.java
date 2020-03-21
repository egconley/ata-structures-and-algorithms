package code401challenges;

import org.junit.Assert;
import org.junit.Test;

public class ArrayShiftTest {

    @Test
    public void insertShiftArray() {
        ArrayShift test1 = new ArrayShift();
        ArrayShift test2 = new ArrayShift();

        int[] input1 = new int[]{1, 2, 3, 4, 10, 11};
        int[] expected1 = new int[]{1, 2, 3, 99, 4, 10, 11};

        int[] input2 = new int[]{1, 2, 3, 4, 10, 11, 12};
        int[] expected2 = new int[]{1, 2, 3, 4, 77, 10, 11, 12};

        int[] result1 = test1.insertShiftArray(input1, 99);
        Assert.assertArrayEquals(expected1, result1);

        int[] result2 = test1.insertShiftArray(input2, 77);
        Assert.assertArrayEquals(expected2, result2);
    }
}