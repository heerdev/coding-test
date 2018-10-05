package com.zubair;

    import com.sun.tools.corba.se.idl.InvalidArgument;

    import java.util.*;

public class OddElementArray {

    public int solution(int[] A) {
        if ((A.length) % 2 != 0) {
            List<Integer> listA = new ArrayList<>();
            Set<Integer> setA = new TreeSet<>();
            for (int i = 0; i < A.length; i++) {
                listA.add(A[i]);
                setA.add(A[i]);
            }
            Iterator<Integer> setIterator = setA.iterator();


            while (setIterator.hasNext()) {
                Integer currentset = setIterator.next();
                int occurance = Collections.frequency(listA, currentset);
                if (occurance == 1)
                    return currentset;
            }
            throw new IllegalArgumentException("pair does not exist");
        } else {
            throw new IllegalArgumentException("Input should be odd");
        }
    }
    public static void main(String[] args){
        OddElementArray oddElementArray= new OddElementArray();
        int[] A={4,2,4,5,4,5};
        System.out.println(oddElementArray.solution(A));
    }


}
