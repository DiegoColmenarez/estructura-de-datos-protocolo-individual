package org.Staticstructures;

@FunctionalInterface
public interface MatrixReduce {
    int reduce(int accumulator, int currentValue);
}
