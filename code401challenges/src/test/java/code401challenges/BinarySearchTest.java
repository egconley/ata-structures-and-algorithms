package code401challenges;

import code401challenges.tree.Node;
import code401challenges.tree.Tree;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    int[] array1;
    int find1;

    int[] array2;
    int find2;

    int[] array3;
    int find3;

    int[] array4;
    int find4;

    int[] array5;
    int find5;

    int[] array6;
    int find6;

    int[] array7;
    int find7;

    @Before
    public void setup() {
        array1 = new int[]{2, 5, 7, 8, 9, 12};
        find1 = 8;

        array2 = new int[]{};
        find2 = 4;

        array3 = new int[]{2,5,7,9,12};
        find3 = 12;

        array4 = new int[]{2};
        find4 = 4;

        array5 = new int[]{2,5,7,9,12};
        find5 = 8;

        array6 = new int[]{2};
        find6 = 2;

        array7 = new int[]{2,5,7,9,12};
        find7 = 2;
    }

    @Test
    public void binarySearchBoolean_HappyPath() {
        assertTrue(BinarySearch.binarySearchBoolean(array1, find1));
        assertTrue(BinarySearch.binarySearchBoolean(array3, find3));
        assertTrue(BinarySearch.binarySearchBoolean(array6, find6));
        assertTrue(BinarySearch.binarySearchBoolean(array7, find7));
    }

    @Test
    public void binarySearchBoolean_EmptyArray() {
        assertFalse(BinarySearch.binarySearchBoolean(array2, find2));
    }

    @Test
    public void binarySearchBoolean_NotFound() {
        assertFalse(BinarySearch.binarySearchBoolean(array4, find4));
        assertFalse(BinarySearch.binarySearchBoolean(array5, find5));
    }

    @Test
    public void testBinarySearch_HappyPath() {
        assertEquals(3, BinarySearch.binarySearch(array1, find1));
        assertEquals(4, BinarySearch.binarySearch(array3, find3));
        assertEquals(0, BinarySearch.binarySearch(array6, find6));
        assertEquals(0, BinarySearch.binarySearch(array7, find7));
    }

    @Test
    public void testBinarySearch_EmptyArray() {
        assertEquals(-1, BinarySearch.binarySearch(array2, find2));
    }

    @Test
    public void testBinarySearch_NotFound() {
        assertEquals(-1, BinarySearch.binarySearch(array4, find4));
        assertEquals(-1, BinarySearch.binarySearch(array5, find5));
    }
}