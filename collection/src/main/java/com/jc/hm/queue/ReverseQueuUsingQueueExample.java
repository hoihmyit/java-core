package com.jc.hm.queue;

import java.util.Queue;
import java.util.Stack;

class ReverseQueueUsingQueue {
    public static void reverseQueue(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            return;
        }

        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }
}

public class ReverseQueuUsingQueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new java.util.LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println("Queue before reversing: " + queue); // Queue before reversing: [1, 2, 3, 4, 5]

        ReverseQueueUsingQueue.reverseQueue(queue);

        System.out.println("Queue after reversing: " + queue); // Queue after reversing: [5, 4, 3, 2, 1]
    }
}
