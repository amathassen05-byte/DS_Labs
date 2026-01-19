package Assignment_2;

import java.util.PriorityQueue;

public class Ques4 {

    public static PriorityQueue<Integer> createPriorityQueue(int[] elements) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // أصغر عنصر في الأمام تلقائيًا
        for (int elem : elements) {
            pq.offer(elem);
        }
        return pq;
    }

    public static void printPriorityQueue(PriorityQueue<Integer> pq) {
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
        System.out.println();
    }
}
