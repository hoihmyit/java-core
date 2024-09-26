package com.jc.hm.stack;

import java.util.Stack;

class StringReverser {
    public String reverse(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null.");
        }

        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        StringBuilder reversed = new StringBuilder();

        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }
}

public class ReverseStringUsingStackExample {
    public static void main(String[] args) {
        String originalStr = "hello";
        StringReverser stringReverser = new StringReverser();
        String reversed = stringReverser.reverse(originalStr);

        System.out.println("Original string: " + originalStr);
        System.out.println("Reversed string: " + reversed);
        //Original string: hello
        //Reversed string: olleh
    }
}
