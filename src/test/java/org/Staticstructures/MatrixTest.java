package org.Staticstructures;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    @Test
    void testPrintMatrix() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        //Matrix.printMatrix(matrix);
    }
    @Test
    void flipVerticalMatrixTest() {
        int[][] originalMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Matrix.printMatrix(originalMatrix);
        System.out.println("-------------------------");
        int[][] expectedMatrix = {
                {7, 8, 9},
                {4, 5, 6},
                {1, 2, 3}
        };
        int[][] result = Matrix.flipVerticalMatrix(originalMatrix);
        Matrix.printMatrix(result);
        System.out.println("-------------------------");
        assertArrayEquals(expectedMatrix, result, "La matriz debería estar invertida verticalmente (la primera fila pasa a ser la última).");

        int[][] originalMatrix1 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        Matrix.printMatrix(originalMatrix1);
        System.out.println("-------------------------");
        int[][] expectedMatrix1 = {
                {4, 5, 6},
                {1, 2, 3}
        };
        int[][] result1 = Matrix.flipVerticalMatrix(originalMatrix1);
        Matrix.printMatrix(result1);
        System.out.println("-------------------------");
        assertArrayEquals(expectedMatrix1, result1, "Debería invertir correctamente matrices rectangulares.");
    }

    @Test
    void testSumAllValues() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int expectedSum = 45;
        int result = Matrix.sumAllValues(matrix);
        System.out.println("result = " + result);
        System.out.println("-------------------------");
        assertEquals(expectedSum, result, "La suma de todos los valores de la matriz debería ser 45.");
        matrix[0][0] = -1;
        expectedSum = 43;
        result = Matrix.sumAllValues(matrix);
        System.out.println("result = " + result);
        System.out.println("-------------------------");
        assertEquals(expectedSum, result, "La suma de todos los valores debe ser 43, pues esta acepta negativos");
    }
}