package com.zubair;


public class FrogLeap {

    public int solution(int X, int Y, int D) {
        double leap=(Y-X)/ D;
        int mod=(Y-X)%D;
        if(mod>0) {
            leap++;
        }
        return leap <0 ? 1 : (int) leap;
    }

    public static void main(String[] args) {
        FrogLeap frogLeap= new FrogLeap();
        System.out.println(frogLeap.solution(0,91,30));
    }
}

