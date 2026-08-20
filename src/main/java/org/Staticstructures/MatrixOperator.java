package org.Staticstructures;

@FunctionalInterface
public interface MatrixOperator {
    int apply(int value, int row, int column);
}
