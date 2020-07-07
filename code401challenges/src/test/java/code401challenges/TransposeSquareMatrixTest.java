package code401challenges;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeSquareMatrixTest {

    int[][] testMatrix;
    int[][] answer;
    TransposeSquareMatrix test = new TransposeSquareMatrix();

    @Before
    public void setup() {
        testMatrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        answer = new int[][]{{1,4,7},{2,5,8},{3,6,9}};
    }

    @Test
    public void transposeMatrix() {
        test.transposeMatrix(testMatrix);
        assertArrayEquals(testMatrix, answer);
    }
}