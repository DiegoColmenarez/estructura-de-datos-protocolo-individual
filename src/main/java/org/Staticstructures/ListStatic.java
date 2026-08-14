package org.Staticstructures;

import java.util.Arrays;

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

    public static int[] changeOddNums(int[] intVector){
        var evenVector = new int[intVector.length];
        var index = 0;
        for (int nums : intVector) {
            if (nums % 2 == 0) {
                evenVector[index] = nums;
            }
            index++;
        }
        return evenVector;
    }

    public static int[] multiplyByIndex(int[] intVector){
        var indexVector = new int[intVector.length];
        for (int i = 0; i < intVector.length; i++) {
            int num = intVector[i] * i;
            indexVector[i] = num;
        }
        return indexVector;
    }
}
