package com.zubair;

public class SortArray {

    private int[] sortedArray(int[] A) {
        int size=A.length;
        for (int i = 0; i < size; i++) {
            for (int k = i+1; k < size ; k++) {
                if( A[i]>A[k]){
                    int temp=A[k];
                    A[k]=A[i];
                    A[i]=temp;
                }
            }
        }
        return A;
    }
}
