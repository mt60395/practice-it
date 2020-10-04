// Write a method called isMagicSquare that accepts a two-dimensional array of integers as a parameter and returns true if it is a magic square.
// A square matrix is a magic square if it is square in shape (same number of rows as columns, and every row the same length), and all of its row, column, and diagonal sums are equal.
// For example, [[2, 7, 6], [9, 5, 1], [4, 3, 8]] is a magic square because all eight of the sums are exactly 15.

public boolean isMagicSquare(int[][] a) {
    if (a.length == 0) return true;
    int rowLength = a[0].length;
    if (rowLength != a.length) return false;
    for (int[] i: a) {
        if (i.length != rowLength) {
            return false;
        }
    }

    int sum = 0; // all of its row, column, and diagonal sums are equal.
    for (int i: a[0]) {
        sum += i;
    }

    for (int i = 1; i < a.length; i++) { // checking rows, first row already done
        int currentSum = 0;
        for (int j: a[i]) {
            currentSum += j;
        }
        if (currentSum != sum) return false;
    }

    for (int i = 0; i < rowLength; i++) { // checking columns
        int currentSum = 0;
        for (int j = 0; j < a.length; j++) {
            currentSum += a[j][i];
        }
        if (currentSum != sum) return false;
    }

    int diagonalSum = 0; // checking diagonals
    for (int i = 0; i < a.length; i++) { // top left to bottom right
        diagonalSum += a[i][i];
    }
    if (diagonalSum != sum) return false;

    int diagonalSum2 = 0;
    int currentColumn = rowLength - 1;
    for (int i = 0; i < a.length; i++) { // bottom left to top right
        diagonalSum2 += a[i][currentColumn--];
    }

    return diagonalSum == diagonalSum2;
}
