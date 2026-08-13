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

    public static void printWithFor(int[] intVector){
        for (int i = 0; i < intVector.length; i++) {
            System.out.println("Vector:" + intVector[i]);
        }
    }

    public static void printVector(int[] intVector){
        System.out.println("Vector: " + Arrays.toString(intVector));
    }
}
