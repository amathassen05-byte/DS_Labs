package Assignment_1;

public class Ques12 {
    public static DNode makeCircular(DNode head) {
        if (head == null) return null;

        DNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = head;
        head.prev = curr;

        return head;
    }
}