package code401challenges;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSortTest {

    int[] testArray;
    MergeSort test = new MergeSort();

    @Before
    public void setup() {
        testArray = new int[]{8,4,23,42,16,15};
    }

    @Test
    public void mergeSort() {
        test.mergeSort(testArray);
    }
}