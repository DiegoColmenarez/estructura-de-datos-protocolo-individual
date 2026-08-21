package org.Staticstructures;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;

public class ListStatic {
    private int[] listNums;

    public ListStatic(int[] listnums){
        this.listNums = listnums;
    }

    public int[] getListNums() {
        return listNums;
    }

//    public static void printWithFor(int[] intVector){
//        for (int i = 0; i < intVector.length; i++) {
//            System.out.println("Vector:" + intVector[i]);
//        }
//    }

    public static void printVectorForEach(int[] intVector){
        for (int nums : intVector) {
            System.out.println("Vector:" + nums);
        }
    }

    public static void printVector(int[] intVector){
        System.out.println("Vector: " + Arrays.toString(intVector));
    }

    private static int[] transformArray(int[] array, IntBinaryOperator operation) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = operation.applyAsInt(array[i], i);
        }
        return result;
    }
    public static int[] changeOddNums(int[] intVector){
        return transformArray(intVector, (num, index) -> num % 2 == 0 ? num : 0);
    }

    public static int[] multiplyByIndex(int[] intVector){
      return transformArray(intVector, (num, index) -> num * index);
    }
}
