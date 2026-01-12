package Assignment_1;

public class Ques10 {

    public static void removeDuplicates(DNode head) {
        if (head == null) return;
        DNode current = head;
        while (current != null) {
            DNode runner = current.next;
            while (runner != null) {
                if (runner.data == current.data) {
                    DNode nextNode = runner.next;
                    DNode prevNode = runner.prev;
                    if (prevNode != null) prevNode.next = nextNode;
                    if (nextNode != null) nextNode.prev = prevNode;
                    runner = nextNode;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }
}