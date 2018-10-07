package com.zubair;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task2 {

    public int solution(int N, String S) {
        int availableSeats = N * 3;
        String reservedSeatTrimString=S.trim().replaceAll("\\s+", "");
        int reservedSeatVarLen=reservedSeatTrimString.length();

        if(reservedSeatVarLen<=1 || reservedSeatVarLen%2!=0)
            return 0; // In real situation i should throw exception of illegalArgs

        StringBuilder createSeats = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            createSeats
                    .append(i + "A")
                    .append(i + "B")
                    .append(i + "C")
                    .append(i + "D")
                    .append(i + "E")
                    .append(i + "F")
                    .append(i + "I")
                    .append(i + "J")
                    .append(i + "K");
        }

        List<String> reservedSeat = new ArrayList<>();
        for (int i = 0; i < reservedSeatVarLen - 1; i++) {
            int j = i + 2;
            String seat = reservedSeatTrimString.substring(i++, j);
            reservedSeat.add(seat);

        }


        for (int roowNum = 1; roowNum <= N; roowNum++) {
            // to make sure if any of the seat reserved in this row, then if another seat is booked as another argument, the count does not impact
            int ABC = 1;
            int DFFG = 1;
            int HJK = 1;
            Iterator<String> reservedSeatIterator = reservedSeat.iterator();
            while (reservedSeatIterator.hasNext()) {
                String currentIteratorVal = reservedSeatIterator.next();
                if (currentIteratorVal.equalsIgnoreCase(roowNum + "A") || currentIteratorVal.equalsIgnoreCase(roowNum + "B") | currentIteratorVal.equalsIgnoreCase(roowNum + "C")) {

                    if (ABC == 1) {
                        availableSeats--;
                        ABC++;
                    }

                } else if (currentIteratorVal.equalsIgnoreCase(roowNum + "E") || currentIteratorVal.equalsIgnoreCase(roowNum + "F")) {
                    if (DFFG == 1) {
                        availableSeats--;
                        DFFG++;
                    }
                } else if (currentIteratorVal.equalsIgnoreCase(roowNum + "H") || currentIteratorVal.equalsIgnoreCase(roowNum + "J") | currentIteratorVal.equalsIgnoreCase(roowNum + "K")) {
                    if (HJK == 1) {
                        availableSeats--;
                        HJK++;
                    }
                }

            }

        }
        return availableSeats;
    }

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        System.out.println(task2.solution(2, "11H  2H 2A "));
        System.out.println("AB".contains("A"));
    }
}
