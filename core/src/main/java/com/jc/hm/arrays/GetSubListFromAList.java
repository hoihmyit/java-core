package com.jc.hm.arrays;

import java.util.ArrayList;
import java.util.List;

public class GetSubListFromAList {
    public static void main(String[] args) {
        final List<String> originList = new ArrayList<>();
        originList.add("A");
        originList.add("B");
        originList.add("C");
        originList.add("D");
        originList.add("E");

//        int fromIndex = 0, toIndex = 0;
//        for (int i = 0; i < originList.size(); i++) {
//            if (secondList.getProperties().equals(originList.get(i).getProperties())) {
//                fromIndex = i;
//            }
//            if (secondList.getProperties().equals(originList.get(i).getProperties())) {
//                toIndex = i;
//                break;
//            }
//        }
//
//        List<String> arr = originList.subList(fromIndex, toIndex + 1);

        System.out.println("Original arraylist: " + originList); // Original arraylist: [A, B, C, D, E]

        List<String> arr = originList.subList(1, 4);

        System.out.println("Sublist of arraylist: " + arr); // Sublist of arraylist: [B, C, D]
    }
}
