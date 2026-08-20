package org.Staticstructures;

public class Matrix {
    private int[][] matrix;

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void printByColumn(int[][] matrix){
        for (int j = 0; j < matrix[0].length; j++) {
            System.out.print("Columna " + j + ": ");
            for (int i = 0; i < matrix.length; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
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
