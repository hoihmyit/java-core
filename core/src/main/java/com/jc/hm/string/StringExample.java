package com.jc.hm.string;

import java.util.Arrays;
import java.util.HashMap;

public class StringExample {

    public static void main(String[] args) {

        /**
         * String is an object that represents a sequence of characters.
         * String are immutable which means once a string object is created and its value cannot be changed.
         * However, we can create a new strings by  performing various operations on the original (existing) string.
         *
         * strings are thread-safe because they are immutable.
         * Remember that all immutable instances are thread-safe, by design.
         *
         * Immutable String - cannot be changed - String class
         * Mutable String - can be changed - StringBuilder, StringBuffer class
         *
         * StringBuilder class is used to perform string concatenation operations in a more memory-efficient way.
         * It internally maintains char[] and manipulates the content in this array only.
         * When we need to get the complete concatenated string after performing all operations, it creates a new String with the stored character array.
         *
         * StringBuffer is very much same as StringBuilder class. The only difference is that it is thread-safe. It’s all methods are synchronized.
         */

        String str = "Hello World";

        stringLowerCaseAndUpperCase(str);

        stringReplaceCharacters(str);

        stringSplit(str);

        concatenateMultipleString();

        // Count the Occurrences of Each Character in a String
        countOccurrencesOfEachCharacterInAString(str);

        // Reverse a String without StringBuilder or StringBuffer
        reverseAString(str);
    }

    private static void reverseAString(String str) {
        String reverseString = recursiveSwap(str);

        System.out.println(reverseString); // dlroW olleH
    }

    static String recursiveSwap(String str) {
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }

        return recursiveSwap(str.substring(1)) + str.charAt(0);
    }

    private static void countOccurrencesOfEachCharacterInAString(String str) {
        HashMap<Character, Integer> occurrencesMap = new HashMap<Character, Integer>();

        char[] strArray = str.toCharArray();

        for (char c : strArray) {
            if (occurrencesMap.containsKey(c)) {
                occurrencesMap.put(c, occurrencesMap.get(c) + 1);
            } else {
                occurrencesMap.put(c, 1);
            }
        }

        System.out.println(occurrencesMap); // { =1, r=1, d=1, e=1, W=1, H=1, l=3, o=2}
    }

    private static void concatenateMultipleString() {
        StringBuffer buffer = new StringBuffer();

        buffer.append("h")
                .append("e")
                .append("l")
                .append("l")
                .append("o")
                .append("w")
                .append("o")
                .append("r")
                .append("l")
                .append("d");

        String string = buffer.toString();

        System.out.println(string); // helloworld
    }

    private static void stringSplit(String str) {
        String[] splitString = str.split("");
        System.out.println(Arrays.toString(splitString)); // [H, e, l, l, o,  , W, o, r, l, d]
    }

    private static void stringReplaceCharacters(String originalString) {
        //Replace one character
        System.out.println(originalString.replace("H", "h")); // hello World

        //Replace all matching characters
        System.out.println(originalString.replaceAll("o", "O")); // HellO WOrld

        //Remove one character
        System.out.println(originalString.replace("H", "")); // ello World

        //Remove all matching characters
        System.out.println(originalString.replace("o", "")); // Hell Wrld
    }

    private static void stringLowerCaseAndUpperCase(String str) {
        System.out.println(str.toLowerCase()); //hello world

        System.out.println(str.toUpperCase()); //HELLO WORLD
    }
}
