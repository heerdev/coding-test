package com.zubair;

import java.util.ArrayList;
import java.util.List;

public class SortString {

    public String solution(String S){
        List<String> getChr= new ArrayList<>();

        for (int i = 0; i <S.length() ; i++) {
            int j=i;
            getChr.add(S.substring(i,++j));

        }
        getChr.sort(null);
        StringBuilder sorted= new StringBuilder();

        for (int i = 0;i< getChr.size() ; i++) {
            sorted.append(getChr.get(i)).toString();
        }
       return sorted.toString();

    }

    public static void main(String[] args) {
        SortString sortString= new SortString();
        System.out.println(sortString.solution("ASDFGHH"));
    }
}
