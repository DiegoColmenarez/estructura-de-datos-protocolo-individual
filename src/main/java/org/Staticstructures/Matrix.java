package org.Staticstructures;

import java.util.Arrays;

public class Matrix {
    private int[][] matrix;

    public Matrix(int[][] matrix){
        this.matrix = matrix;
    }

    public static void printMatrix(int[][] matrix){
        System.out.println("Matrix: " + Arrays.deepToString(matrix));
    }

    private static int[][] transformMatrix(int[][] matrix, MatrixOperator operator){
        int[][] result = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[i][j] = operator.apply(matrix[i][j], i, j);
            }
        }
        return result;
    }

    public static int[][] tramposeMatrix(int[][] matrix){
       return transformMatrix(matrix, (value, row, column) -> matrix[matrix.length - 1 - row][column]);
    }
}
