package by.ixodes.codewars.katas.kyu5;

/*
Write a function that accepts two square (NxN) matrices (two dimensional arrays), and returns the product of the two.
Only square matrices will be given.

How to multiply two square matrices:
We are given two matrices, A and B, of size 2x2 (note: tests are not limited to 2x2). Matrix C, the solution,
will be equal to the product of A and B. To fill in cell [0][0] of matrix C, you need to compute:
A[0][0] * B[0][0] + A[0][1] * B[1][0].

More general: To fill in cell [n][m] of matrix C, you need to first multiply the elements in the nth row of
matrix A by the elements in the mth column of matrix B, then take the sum of all those products.
This will give you the value for cell [m][n] in matrix C.

Example
  A         B          C
|1 2|  x  |3 2|  =  | 5 4|
|3 2|     |1 1|     |11 8|

Detailed calculation:
C[0][0] = A[0][0] * B[0][0] + A[0][1] * B[1][0] = 1*3 + 2*1 =  5
C[0][1] = A[0][0] * B[0][1] + A[0][1] * B[1][1] = 1*2 + 2*1 =  4
C[1][0] = A[1][0] * B[0][0] + A[1][1] * B[1][0] = 3*3 + 2*1 = 11
C[1][1] = A[1][0] * B[0][1] + A[1][1] * B[1][1] = 3*2 + 2*1 =  8
*/

/**
 * @autor ixodes
 * @since 1/13/22
 */

public class SquareMatrixUtils {

    public static int[][] matrixMultiplication(int[][] a, int[][] b) {

        var len = a.length;
        var c = new int[len][len];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                for (int k = 0; k < len; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return c;
    }
}
