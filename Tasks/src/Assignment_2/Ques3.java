package Assignment_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ques3 {

    public static <T> Queue<T> reverseQueue(Queue<T> queue) {
        Stack<T> stack = new Stack<>();

        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }

        return queue;
    }

    public static <T> void printQueue(Queue<T> queue) {
        for (T item : queue) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
