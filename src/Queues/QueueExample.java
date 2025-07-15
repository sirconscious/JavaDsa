package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10); // enqueue
        queue.add(20);
        queue.add(30);

        System.out.println(queue);      // [10, 20, 30]
        System.out.println(queue.poll()); // 10 (dequeue)
        System.out.println(queue.peek()); // 20
        System.out.println(queue.isEmpty()); // false
    }
}
