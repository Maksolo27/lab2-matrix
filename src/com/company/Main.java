package com.company;

public class Main {
    public static void main(String[] args) {
        //508
        final long[][] A = {
                {12, 500, 2, 0}, {4, 5, 6, 7, 1}, {8, 12, 65, 6}
        };
        final long[][] B = {
                {2, 8}, {7, 2,1}
        };
        final int matrixALength = A.length;
        final int matrixBLength = B.length;

        int rowsA = A[0].length;
        int rowsB = B[0].length;
        int tempRows;

        int l = 0;
        while (l < matrixALength) {
            tempRows = A[l].length;
            if (tempRows > rowsA) {
                rowsA = tempRows;
            }
            l++;
        }

        int k = 0;
        while (k < matrixBLength) {
            tempRows = B[k].length;
            if (tempRows > rowsB) {
                rowsB = tempRows;
            }
            k++;
        }
        int n = matrixALength + matrixBLength;
        int m = rowsA + rowsB;

        long[][] c = new long[n][m];
        for (int i = 0; i < matrixALength; i++) {
            System.arraycopy (A[ i ], 0, c[ i ], 0, A[ i ].length);
        }
        for (int i = 0; i < matrixBLength; i++) {
            System.arraycopy (B[ i ], 0, c[ i + matrixALength ], rowsA, B[ i ].length);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(c[i][j]  + "\t");
            }
            System.out.println("\n");
        }

        int rows = c.length;
        int cols = c[0].length;
        long sumCol;
        for(int i = 0; i < cols; i++){
            sumCol = 0;
            for (long[] longs : c) {
                sumCol = sumCol + longs[ i ];
            }
            System.out.println("Sum of " + (i+1) +" column: " + sumCol);
        }

    }
}
