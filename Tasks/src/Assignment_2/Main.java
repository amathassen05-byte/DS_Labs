package Assignment_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        // =======================
        System.out.println("حل السؤال الأول");
        String input = "Hello, World!";
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + Ques1.reverseString(input));
        System.out.println();

        // =======================
        System.out.println("حل السؤال الثاني");
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);

        System.out.println("Original Stack:");
        Ques2.printStack(stack);

        Stack<Integer> sortedStack = Ques2.sortStack(stack);

        System.out.println("Sorted Stack:");
        Ques2.printStack(sortedStack);
        System.out.println();

        // =======================
        System.out.println("حل السؤال الثالث");
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        System.out.println("Original Queue:");
        Ques3.printQueue(queue);

        Queue<Integer> reversedQueue = Ques3.reverseQueue(queue);

        System.out.println("Reversed Queue:");
        Ques3.printQueue(reversedQueue);
        System.out.println();

        // =======================
        System.out.println("حل السؤال الرابع");
        int[] elements = {50, 20, 15, 5, 30, 10};
        PriorityQueue<Integer> pq = Ques4.createPriorityQueue(elements);

        System.out.println("Priority Queue (smallest dequeued first):");
        Ques4.printPriorityQueue(pq);
        System.out.println();

        // =======================
        System.out.println("حل السؤال الخامس");
        Queue<Integer> q1 = new LinkedList<>();
        q1.offer(5);
        q1.offer(10);
        q1.offer(15);

        Queue<Integer> q2 = new LinkedList<>();
        q2.offer(3);
        q2.offer(8);
        q2.offer(12);

        System.out.println("Queue 1:");
        Ques5.printQueue(q1);
        System.out.println("Queue 2:");
        Ques5.printQueue(q2);

        Queue<Integer> mergedQueue = Ques5.mergeSortedQueues(q1, q2);

        System.out.println("Merged Sorted Queue:");
        Ques5.printQueue(mergedQueue);
        System.out.println();
    }
}
