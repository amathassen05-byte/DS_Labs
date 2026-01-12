package Assignment_1;

public class Ques14 {
    public static boolean search(DNode head, int value) {
        DNode curr = head;
        while (curr != null) {
            if (curr.data == value) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
}