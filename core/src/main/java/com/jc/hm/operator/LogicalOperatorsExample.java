package com.jc.hm.operator;

/**
 * Logical operators: Toán tử logic
 */
public class LogicalOperatorsExample {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;

        System.out.println("b1 && b2: " + (b1 && b2));
        System.out.println("b1 || b2: " + (b1 || b2));
        System.out.println("!(b1 && b2): " + !(b1 && b2));
        //b1 && b2: false
        //b1 || b2: true
        //! (b1 && b2): true
    }
}
