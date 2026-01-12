package Assignment_1;

public class Ques6 {

    public static Node rotateRight(Node head, int k) {

        if (head == null || k == 0)
            return head;

        Node curr = head;
        int length = 1;

        while (curr.next != null) {
            curr = curr.next;
            length++;
        }

        curr.next = head;

        k = k % length;
        int steps = length - k;

        while (steps-- > 0) {
            curr = curr.next;
        }

        head = curr.next;
        curr.next = null;

        return head;
    }
}
