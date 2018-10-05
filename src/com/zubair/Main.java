package com.zubair;

import java.util.*;

public class Main {

   public static void addList(List l){
        l.add(123);
    }

    public static void main(String[] args) {

        List<String> list= new ArrayList<>();
        list.add("jim");
        list.add("b");
        list.add("jim");
        list.add("t");

        list.add("jim");
        list.add(1,"t");
        list.set(0,"z");
        list.remove(1);
        System.out.println(list);
        System.out.println(list.indexOf("jim"));
        System.out.println(list.subList(1,2));
        System.out.println(list.lastIndexOf("jim"));
    }
}
