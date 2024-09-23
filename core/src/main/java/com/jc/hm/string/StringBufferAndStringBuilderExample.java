package com.jc.hm.string;

public class StringBufferAndStringBuilderExample {
    public static void main(String[] args) {
        long stringBufferStartTime = System.currentTimeMillis();
        // StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello");
//        stringBuffer.append(" World");
        System.out.println(stringBuffer.capacity());
//        System.out.println(stringBuffer); // Hello World
        for (int i = 0; i < 100000; i++) {
            stringBuffer.append(" World");
        }
        System.out.println("Time taken for StringBuffer: " + (System.currentTimeMillis() - stringBufferStartTime) + "ms");
        // Time taken for StringBuffer: 5ms

        // StringBuilder
        long stringBuilderStartTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder("Hello");
//        stringBuilder.append(" World");
        System.out.println(stringBuilder.capacity());
//        System.out.println(stringBuilder); // Hello World
        for (int i = 0; i < 100000; i++) {
            stringBuilder.append(" World");
        }
        System.out.println("Time taken for StringBuilder: " + (System.currentTimeMillis() - stringBuilderStartTime) + "ms");
        // Time taken for StringBuilder: 2ms

        System.out.println("------");
        // StringBuffer is synchronized, meaning its methods are thread-safe and can be safely used in a multithreaded environment.
        // StringBuilder is not synchronized, which makes it faster than StringBuffer, but it is not thread-safe and should not be used in a multithreaded environment.
    }
}
