package com.zubair;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1 {

    public int solution(String A, String B) {
        List<String> alecDec = new ArrayList<>();
        List<String> bobDec = new ArrayList<>();
        int N = 0;

        for (int i = 0; i < A.length(); i++) {
            int j = i;
            alecDec.add(A.substring(i, ++j));
        }

        for (int i = 0; i < B.length(); i++) {
            int j = i;
            bobDec.add(B.substring(i, ++j));
        }
        if(alecDec.size()==0 && bobDec.size()==0)
            return 0;


        Iterator<String> alecIterator = alecDec.iterator();
        Iterator<String> bobIterator = bobDec.iterator();

        while (alecIterator.hasNext()) {
            String alecCurrentCard = alecIterator.next();

                String bobCurrentCard = bobIterator.next();
                if (alecCurrentCard.equalsIgnoreCase("A")) {
                    N++;
                } else if (alecCurrentCard.equalsIgnoreCase("K") && (!bobCurrentCard.equalsIgnoreCase("A")
                        && !bobCurrentCard.equalsIgnoreCase("k"))) {
                    N++;
                }else if (alecCurrentCard.equalsIgnoreCase("Q") && (!bobCurrentCard.equalsIgnoreCase("A")
                        && !bobCurrentCard.equalsIgnoreCase("K")
                        && !bobCurrentCard.equalsIgnoreCase("Q"))) {
                    N++;
                }else if (alecCurrentCard.equalsIgnoreCase("J") && (!bobCurrentCard.equalsIgnoreCase("A")
                        && !bobCurrentCard.equalsIgnoreCase("K")
                        && !bobCurrentCard.equalsIgnoreCase("Q")
                        && !bobCurrentCard.equalsIgnoreCase("J"))) {
                    N++;
                }else if (alecCurrentCard.equalsIgnoreCase("T") && (!bobCurrentCard.equalsIgnoreCase("A")
                        && !bobCurrentCard.equalsIgnoreCase("K")
                        && !bobCurrentCard.equalsIgnoreCase("Q")
                        && !bobCurrentCard.equalsIgnoreCase("J")
                        && !bobCurrentCard.equalsIgnoreCase("T"))) {
                    N++;
                }
                else if (alecCurrentCard.equalsIgnoreCase(String.valueOf(9)) && (!bobCurrentCard.equalsIgnoreCase("A")
                        && !bobCurrentCard.equalsIgnoreCase("K")
                        && !bobCurrentCard.equalsIgnoreCase("Q")
                        && !bobCurrentCard.equalsIgnoreCase("J")
                        && !bobCurrentCard.equalsIgnoreCase("T")
                        && !bobCurrentCard.equalsIgnoreCase(String.valueOf(9)))) {
                    N++;
                }else if (alecCurrentCard.equalsIgnoreCase(String.valueOf(8)) && (!bobCurrentCard.equalsIgnoreCase("A")
                        && !bobCurrentCard.equalsIgnoreCase("K")
                        && !bobCurrentCard.equalsIgnoreCase("Q")
                        && !bobCurrentCard.equalsIgnoreCase("J")
                        && !bobCurrentCard.equalsIgnoreCase("T")
                        && !bobCurrentCard.equalsIgnoreCase(String.valueOf(9))
                        && !bobCurrentCard.equalsIgnoreCase(String.valueOf(8)))) {
                    N++;
                }else if (alecCurrentCard.equalsIgnoreCase(String.valueOf(7)) && (!bobCurrentCard.equalsIgnoreCase("A")
                        && !bobCurrentCard.equalsIgnoreCase("K")
                        && !bobCurrentCard.equalsIgnoreCase("Q")
                        && !bobCurrentCard.equalsIgnoreCase("J")
                        && !bobCurrentCard.equalsIgnoreCase("T")
                        && !bobCurrentCard.equalsIgnoreCase(String.valueOf(9))
                        && !bobCurrentCard.equalsIgnoreCase(String.valueOf(8))
                        && !bobCurrentCard.equalsIgnoreCase(String.valueOf(7)))) {
                    N++;
                }else if (alecCurrentCard.equalsIgnoreCase(String.valueOf(6)) && (!bobCurrentCard.equalsIgnoreCase("A")
                        && !bobCurrentCard.equalsIgnoreCase("K")
                        && !bobCurrentCard.equalsIgnoreCase("Q")
                        && !bobCurrentCard.equalsIgnoreCase("J")
                        && !bobCurrentCard.equalsIgnoreCase("T")
                        && !bobCurrentCard.equalsIgnoreCase(String.valueOf(9))
                        && !bobCurrentCard.equalsIgnoreCase(String.valueOf(8))
                        && !bobCurrentCard.equalsIgnoreCase(String.valueOf(7))
                        && !bobCurrentCard.equalsIgnoreCase(String.valueOf(6)))) {
                    N++;
                }else if (alecCurrentCard.equalsIgnoreCase(String.valueOf(5)) && (!bobCurrentCard.equalsIgnoreCase("A")
                        && !bobCurrentCard.equalsIgnoreCase("K")
                        && !bobCurrentCard.equalsIgnoreCase("Q")
                        && !bobCurrentCard.equalsIgnoreCase("J")
                        && !bobCurrentCard.equalsIgnoreCase("T")
                        && !bobCurrentCard.equalsIgnoreCase(String.valueOf(9))
                        && !bobCurrentCard.equalsIgnoreCase(String.valueOf(8))
                        && !bobCurrentCard.equalsIgnoreCase(String.valueOf(7))
                        && !bobCurrentCard.equalsIgnoreCase(String.valueOf(6))
                        && !bobCurrentCard.equalsIgnoreCase(String.valueOf(5)))) {
                    N++;
                }else if (alecCurrentCard.equalsIgnoreCase(String.valueOf(4)) &&(
                        !bobCurrentCard.equalsIgnoreCase("A")
                        && !bobCurrentCard.equalsIgnoreCase("K")
                        && !bobCurrentCard.equalsIgnoreCase("Q")
                        && !bobCurrentCard.equalsIgnoreCase("J")
                        && !bobCurrentCard.equalsIgnoreCase("T")
                        && !bobCurrentCard.equalsIgnoreCase(String.valueOf(9))
                        && !bobCurrentCard.equalsIgnoreCase(String.valueOf(8))
                        && !bobCurrentCard.equalsIgnoreCase(String.valueOf(7))
                        && !bobCurrentCard.equalsIgnoreCase(String.valueOf(6))
                        && !bobCurrentCard.equalsIgnoreCase(String.valueOf(5))
                        && !bobCurrentCard.equalsIgnoreCase(String.valueOf(4)))) {
                    N++;
                } else if (alecCurrentCard.equalsIgnoreCase(String.valueOf(3)) && (
                        !bobCurrentCard.equalsIgnoreCase("A")
                        && !bobCurrentCard.equalsIgnoreCase("K")
                        && !bobCurrentCard.equalsIgnoreCase("Q")
                        && !bobCurrentCard.equalsIgnoreCase("J")
                        && !bobCurrentCard.equalsIgnoreCase("T")
                                && !bobCurrentCard.equalsIgnoreCase(String.valueOf(9))
                                && !bobCurrentCard.equalsIgnoreCase(String.valueOf(8))
                                && !bobCurrentCard.equalsIgnoreCase(String.valueOf(7))
                                && !bobCurrentCard.equalsIgnoreCase(String.valueOf(6))
                                && !bobCurrentCard.equalsIgnoreCase(String.valueOf(5))
                                && !bobCurrentCard.equalsIgnoreCase(String.valueOf(4))
                        && !bobCurrentCard.equalsIgnoreCase(String.valueOf(3)))) {
                    N++;
                }



        }

            return N;

    }


    public static void main(String[] args) {
        Task1 task1 = new Task1();
        String A="";
        String B="";
        System.out.println(task1.solution(A,B));
    }

}
