package com.jc.hm.stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        System.out.println("Initial size of stack: " + stack.size()); // 0

        // Insert items onto the top of this stack.
        stack.push("Java");
        stack.push("JavaScript");

        System.out.println("Size of stack after adding elements: " + stack.size()); // 2
        System.out.println(stack); // [Java, JavaScript]

        stack.pop(); // Removes the top element
        System.out.println("Size of stack after removing element: " + stack.size()); // 1
        System.out.println(stack); // [Java]
    }
}
