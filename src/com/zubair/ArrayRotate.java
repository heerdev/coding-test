package com.zubair;

import java.util.Arrays;

public class ArrayRotate {

    public int[] solution(int[] A, int K) {
        int aLen=A.length;
        while(K>0){
            int[]  R= new int[A.length];
           for (int i = 1; i < aLen ; i++) {
               int j=i;
               R[0]=A[aLen-1];
               R[i]=A[j-1];
           }
            A=R;
          K--;
       }
       return A;
    }

    public static void main(String[] args) {
        ArrayRotate arrayRotate= new ArrayRotate();
        int[] A={};
        System.out.println(arrayRotate.solution(A,3));
    }
}
