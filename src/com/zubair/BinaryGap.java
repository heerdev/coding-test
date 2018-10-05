package com.zubair;


import java.util.*;

public class BinaryGap {


    public int getBinary(int N) {

        String strBinary = Integer.toBinaryString(N);
        int strBinaryLen = strBinary.length();
        int count = 0;
        List<Integer> countLen = new LinkedList<>();
        for (int i = 0; i < strBinaryLen; i++) {
            int j=i;
            if (strBinary.substring(i,++j).equalsIgnoreCase("1")) {
                countLen.add(count);
                count = 0;
            } else {
                count++;
            }


        }
        return Collections.max(countLen);
    }

    public static void main(String[] args) {
        BinaryGap binaryGap = new BinaryGap();
        System.out.println(binaryGap.getBinary(567));
    }



}
