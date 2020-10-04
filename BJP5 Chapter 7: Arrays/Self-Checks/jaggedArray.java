/*

Write a piece of code that constructs a jagged two-dimensional array of integers named jagged with five rows and an increasing number of columns in each row, such that the first row has one column, the second row has two, the third has three, and so on.
The array elements should have increasing values in top-to-bottom, left-to-right order (also called row-major order).
In other words, the array's contents should be the following:

1
2, 3
4, 5, 6
7, 8, 9, 10
11, 12, 13, 14, 15

*/

int count = 1;
int[][] jagged = new int[5][];
for (int i = 1; i <= 5; i++) {
    jagged[i-1] = new int[i];
    for (int columns = 0; columns < i; columns++) {
        jagged[i-1][columns] = count++;
    }
}
