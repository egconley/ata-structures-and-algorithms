package code401challenges;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MatrixRotation90DegreesTest {

    int[][] testMatrix;
    int[][] answer;
    MatrixRotation90Degrees test = new MatrixRotation90Degrees();

    @Before
    public void setup() {
        testMatrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        answer = new int[][]{{7,4,1},{8,5,2},{9,6,3}};
    }

    @Test
    public void rotate90Degrees() {
        test.rotate90Degrees(testMatrix);
        System.out.println(Arrays.deepToString(testMatrix));
        assertArrayEquals(testMatrix, answer);
    }
}