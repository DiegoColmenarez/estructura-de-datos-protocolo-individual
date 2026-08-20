package org.Staticstructures;

import java.util.Arrays;

public class Matrix {
    private int[][] matrix;

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("Matrix: " + Arrays.deepToString(matrix));
    }

    private static int[][] transformMatrix(int[][] matrix, MatrixMap map) {
        int[][] result = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[i][j] = map.apply(matrix[i][j], i, j);
            }
        }
        return result;
    }

    public static int[][] flipVerticalMatrix(int[][] matrix) {
        return transformMatrix(matrix, (value, row, column) -> matrix[matrix.length - 1 - row][column]);
    }

    private static int reduceMatrix(int[][] matrix, int initValue, MatrixReduce reduce) {
        int result = initValue;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result = reduce.reduce(result, matrix[i][j]);
            }
        }
        return result;
    }

    public static int sumAllValues(int[][] matrix) {
        return reduceMatrix(matrix, 0, (accumulator, currentValue) -> currentValue + accumulator);
    }
}
