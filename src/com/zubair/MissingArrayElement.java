package com.zubair;

import java.util.ArrayList;
import java.util.List;

public class MissingArrayElement {

//contains coe for array sort
    public int solution(int[] A) {
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
        for (int i = 0; i < A.length; i++) {
            int j=i;
             if(++j< A.length && A[j]-A[i]>1 )
                return A[i]+1;

        }
        if(A.length==0){
            return 1;
        }else{
            return A[A.length-1]-1<=0 ? A[A.length-1]+1 : A[A.length-1]-1;
        }
 }

    public static void main(String[] args) {
        MissingArrayElement missingArrayElement= new MissingArrayElement();
                int[] A={3,4,5};
        System.out.println(missingArrayElement.solution(A));
    }
}
