package com.zubair;

public class StringReveral {

    public String solution(String S){

        int strLen= S.length();
       StringBuilder R= new StringBuilder();
        int j=0;
        for (int i = strLen; i >0  ; i--) {
            int k=i;
            R.append(S.substring(--k,i));
            j++;
        }

        return R.toString();
    }

    public String neatSolution(String S){
        StringBuilder sorted= new StringBuilder();
        return sorted.append(S).reverse().toString();
    }

    public static void main(String[] args) {
        StringReveral stringReveral= new StringReveral();
        System.out.println(stringReveral.solution("ASDFGH"));
    }
}
