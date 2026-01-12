package Assignment_1;

public class Ques8 {

    public static int findIndex(Node head, int dataValue) {
        Node curr = head;
        int index = 0;

        while (curr != null) {
            if (curr.data == dataValue) {
                return index;
            }
            curr = curr.next;
            index++;
        }

        return -1;
    }
}