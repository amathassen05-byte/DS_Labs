package Assignment_2;

import java.util.LinkedList;
import java.util.Queue;

public class Ques5 {

    public static Queue<Integer> mergeSortedQueues(Queue<Integer> q1, Queue<Integer> q2) {
        Queue<Integer> merged = new LinkedList<>();

        while (!q1.isEmpty() && !q2.isEmpty()) {
            if (q1.peek() <= q2.peek()) {
                merged.offer(q1.poll());
            } else {
                merged.offer(q2.poll());
            }
        }

        while (!q1.isEmpty()) {
            merged.offer(q1.poll());
        }
        while (!q2.isEmpty()) {
            merged.offer(q2.poll());
        }

        return merged;
    }

    public static void printQueue(Queue<Integer> queue) {
        for (Integer i : queue) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
