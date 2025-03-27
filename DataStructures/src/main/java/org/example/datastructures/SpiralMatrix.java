package org.example.datastructures;

public class SpiralMatrix {
    public static void printSpiralMatrix(int[][] matrix) {
        int i=0, j=0, k=0;
        int N = matrix.length;
        while(N > 0) {
            for (k = 1; k <= N-1; k++) {
                System.out.print(matrix[i][j] + " ");
                j += 1;
            }
            for (k = 1; k <= N-1; k++) {
                System.out.print(matrix[i][j] + " ");
                i += 1;
            }
            for (k = 1; k <= N-1; k++) {
                System.out.print(matrix[i][j] + " ");
                j -= 1;
            }
            for (k = 1; k <= N-1; k++) {
                System.out.print(matrix[i][j] + " ");
                i -= 1;
            }
            i += 1;
            j += 1;
            N -= 2;
        }
    }
}
