package com.jc.hm.set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * The LinkedHashSet is an ordered version of HashSet that maintains a doubly-linked List across all elements.
 * When the iteration order is needed to be maintained this class is used.
 * When iterating through a HashSet the order is unpredictable.
 * while a LinkedHashSet the order will be the order in which the elements were inserted.
 */
public class LinkedHashSetExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("John");
        arrayList.add("Jane");
        arrayList.add("Doe");
        System.out.println(arrayList); //[John, Jane, Doe]

//        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(arrayList);
//        System.out.println(linkedHashSet); //[John, Jane, Doe]

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(arrayList);
        linkedHashSet.add("Alan");
        System.out.println(linkedHashSet); //[John, Jane, Doe, Alan]

        Iterator<String> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            //John
            //Jane
            //Doe
            //Alan
        }

        linkedHashSet.remove(2);
        System.out.println(linkedHashSet); //[John, Jane, Alan]
        linkedHashSet.removeAll(linkedHashSet);
        System.out.println(linkedHashSet); //[]


        LinkedHashSet<String> linkedHashSet1 = new LinkedHashSet<>();
        linkedHashSet1.add("A");
        linkedHashSet1.add("B");

        LinkedHashSet<String> linkedHashSet2 = new LinkedHashSet<>();
        linkedHashSet2.add("B");
        linkedHashSet2.add("C");
        linkedHashSet2.add("D");

        linkedHashSet2.addAll(linkedHashSet1);
        System.out.println(linkedHashSet2); //[B, C, D, A]
    }
}
