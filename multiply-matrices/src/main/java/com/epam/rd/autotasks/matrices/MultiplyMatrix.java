package com.epam.rd.autotasks.matrices;

import java.util.Arrays;

public class MultiplyMatrix {
//    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
//
//        int[][] resultMatrix = new int[matrix2[0].length][matrix1.length];
//
//        for (int i = 0; i < resultMatrix.length; i++) {
//            for (int j = 0; j < resultMatrix[0].length; j++) {
//                int sum = 0;
//
//
//                for (int l = 0; l < matrix1.length; l++) {
//                    for (int d = j; d < matrix1.length; d++) {
//                        sum += matrix1[l][d] * matrix2[j][d];
//                    }
//                }
//
//
//                resultMatrix[i][j] = sum;
//
//
//            }
//        }
//
//        return null;
//    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length < matrix2.length) {
            int[][] temp = matrix1;
            matrix1 = matrix2;
            matrix2 = temp;
        }

        int[][] resultMatrix = new int[matrix1[0].length][matrix2.length];

        int sum = 0;
        for (int p = 0; p < matrix1.length; p++) {
            int count = 0;
            for (int i = 0; i < matrix2.length; i++) {
                sum += matrix1[p][i] * matrix2[i][p];
            }
        }
//        resultMatrix[m][n] = sum;


        return null;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] b = {
                {0, 12345},
                {4509, 0},
                {3, 567}};

        int[][] a = {
                {653, 0, 25353},
                {0, 61, 6}};

        int[][] result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}
