package com.jc.hm.set;

import java.util.TreeSet;

/**
 * TreeSet class implements the Set interface that uses a tree for storage.
 * It inherits AbstractSet class and implements the NavigableSet interface.
 * The objects in a TreeSet are stored in a sorted and ascending order.
 * It contains unique elements only like HashSet.
 * TreeSet does not allow null elements and maintains ascending order.
 * It's access and retrieval times are quite fast.
 * TreeSet is being implemented using a binary search tree, which is self-balancing just like a Red-Black Tree.
 * Therefore, operations such as search, remove and add consume O(log(n)) time.
 */
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("John");
        treeSet.add("Jane");
        treeSet.add("John");

        System.out.println(treeSet); //[Jane, John]

        System.out.println(treeSet.contains("Jane")); //true
        System.out.println(treeSet.first()); //Jane
        System.out.println(treeSet.last()); //John

    }
}
