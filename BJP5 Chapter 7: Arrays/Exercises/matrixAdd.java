// Write a method named matrixAdd that accepts a pair of two-dimensional arrays of integers as parameters, treats the arrays as 2D matrices and adds them, returning the result.
// You may assume that the arrays passed as parameters have the same dimensions.

public int[][] matrixAdd(int[][] A, int[][] B) {
    int rowLength = 0;
    for (int[] i: A) {
        rowLength = i.length;
    }
    int[][] C = new int[A.length][rowLength];
    for (int i = 0; i < A.length; i++) {
        for (int j = 0; j < rowLength; j++) {
            C[i][j] = A[i][j] + B[i][j];
        }
    }
    return C;
}
