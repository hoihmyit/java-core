package com.jc.hm.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Set is an interface, we cannot create an object from it.
 * In order to use the functionalities of Set, we can use EnumSet, HashSet, LinkedHashSet, or TreeSet.
 */
public class SetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        System.out.println(set.size()); //4
        System.out.println(set); //[1, 2, 3, 4]

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            //1
            //2
            //3
            //4
        }
    }
}
