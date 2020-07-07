package code401challenges;

import java.util.HashSet;

public class MatrixRotation90Degrees {
    public static void rotate90Degrees(int[][] matrix) {
        int maxIndex = matrix.length-1;
        HashSet<String> positionsHoldingTransformedValues = new HashSet<>();
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                int iTemp = i;
                int jTemp = j;
                // skip over positions with transformed values to keep from rewriting everything back to the original
                if (!positionsHoldingTransformedValues.contains(""+i+j)) {
                    iTemp = j;
                    jTemp = Math.abs(maxIndex-i);
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[iTemp][jTemp];
                    matrix[iTemp][jTemp] = temp;
                    positionsHoldingTransformedValues.add(""+iTemp+jTemp);
                }
            }
        }
    }
}
