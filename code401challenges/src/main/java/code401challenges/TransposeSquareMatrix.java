package code401challenges;

import java.util.HashSet;

public class TransposeSquareMatrix {
    // transposes a square matrix in place
    public void transposeMatrix(int[][] matrix) {
        HashSet<String> positionsHoldingTransformedValues = new HashSet<>();
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                // the axis of rotation is at i==j, around which there's a 180 degree flip
                // numbers positioned on the axis don't change
                int iTemp = i;
                int jTemp = j;
                // skip over positions with transformed values to keep from rewriting everything back to the original
                if (!positionsHoldingTransformedValues.contains(""+i+j)) {
                    iTemp = j;
                    jTemp = i;
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[iTemp][jTemp];
                    matrix[iTemp][jTemp] = temp;
                    positionsHoldingTransformedValues.add(""+iTemp+jTemp);
                }
            }
        }
    }
}
