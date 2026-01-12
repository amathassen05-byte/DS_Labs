package Assignment_1;

public class DNode {

    public int data;
    public DNode next;
    public DNode prev;

    public DNode(int d) {
        data = d;
        next = prev = null;
    }
}