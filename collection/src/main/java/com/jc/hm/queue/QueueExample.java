package com.jc.hm.queue;

import java.util.PriorityQueue;

public class QueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        System.out.println("Initial size of queue: " + queue.size());

        queue.add(10);
        queue.add(20);

        System.out.println("Size of queue after adding elements: " + queue.size()); // 2
        System.out.println(queue); // [10, 20]

        queue.peek(); // Returns the elements at the front of the queue wihout removing it
        System.out.println(queue.peek()); // 10
        System.out.println("Size of queue after peeking: " + queue.size()); // 2
        System.out.println(queue); // [10, 20]

        queue.poll(); // Removes the element
        System.out.println("Size of queue after polling: " + queue.size()); // 1
        System.out.println(queue); // [20]

        queue.isEmpty(); // Returns true if the queue is empty
        System.out.println("Is queue empty: " + queue.isEmpty()); // false
    }
}
