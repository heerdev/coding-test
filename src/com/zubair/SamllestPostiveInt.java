package com.zubair;

public class SamllestPostiveInt {

    public int solution(int[] A) {

        int[] sortedA=sortedArray(A);

        for (int i = 0; i < sortedA.length; i++) {
            int j=i+1;
            if(j<sortedA.length && A[j]-A[i]>1 && A[j]>0 && A[i]>0){
                return A[i]+1;
            }else if(j == sortedA.length){
                return A[j]+1;
            } else if(j == sortedA.length-1 && A[i]<0){
                return 1;
            } else if(j == sortedA.length-1 && A[i]>0){
                return A[j]+1;
            }else if(j == sortedA.length-1 && A[j]>0 && A[i]<0 && A[j] +A[i] >1){
                return A[j]-1;
            }
        }

        return 0;
    }

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

    public static void main(String[] args) {
        SamllestPostiveInt samllestPostiveInt= new SamllestPostiveInt();
        int[] A={-3,2,1};
        System.out.println(samllestPostiveInt.solution(A));
    }

}
