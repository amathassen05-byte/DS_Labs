package Assignment_1;

import java.util.Arrays;

import static Assignment_1.Ques2.removeRandom;
import static Assignment_1.Ques4.reverseArray;
import static Assignment_1.Ques6.rotateRight;


public class MainApp {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("حل السؤال الثاني");
        arr = removeRandom(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println();


        System.out.println("حل السؤال الرابع");
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println();


        System.out.println("حل السؤال السادس");
        Node head6 = new Node(1);
        head6.next = new Node(2);
        head6.next.next = new Node(3);
        head6.next.next.next = new Node(4);

        head6 = rotateRight(head6, 1);

        Node temp6 = head6;
        while (temp6 != null) {
            System.out.print(temp6.data + " ");
            temp6 = temp6.next;
        }
        System.out.println();
        System.out.println();

        System.out.println("حل السؤال الثامن");
        Node head8 = new Node(10);
        head8.next = new Node(20);
        head8.next.next = new Node(30);

        int result = Ques8.findIndex(head8, 20);
        System.out.println(result);
        System.out.println();


        System.out.println("حل السؤال العاشر");
        DNode dh1 = new DNode(10);
        DNode n2 = new DNode(20);
        DNode n3 = new DNode(10);
        DNode n4 = new DNode(30);

        dh1.next = n2; n2.prev = dh1;
        n2.next = n3; n3.prev = n2;
        n3.next = n4; n4.prev = n3;

        Ques10.removeDuplicates(dh1);

        DNode dt1 = dh1;
        while (dt1 != null) {
            System.out.print(dt1.data + " ");
            dt1 = dt1.next;
        }
        System.out.println();
        System.out.println();


        System.out.println("حل السؤال الثاني عشر");
        DNode dh12 = new DNode(1);
        DNode n12_2 = new DNode(2);
        DNode n12_3 = new DNode(3);

        dh12.next = n12_2; n12_2.prev = dh12;
        n12_2.next = n12_3; n12_3.prev = n12_2;

        dh12 = Ques12.makeCircular(dh12);

        System.out.println("Head data: " + dh12.data);
        System.out.println("Tail to Head (Circular): " + dh12.prev.data);
        System.out.println();
        System.out.println();


        System.out.println("حل السؤال الرابع عشر");
        DNode dh14 = new DNode(50);
        dh14.next = new DNode(100);
        dh14.next.prev = dh14;
        dh14.next.next = new DNode(150);
        dh14.next.next.prev = dh14.next;

        boolean found = Ques14.search(dh14, 100);
        System.out.println("Is 100 found? " + found);

        boolean notFound = Ques14.search(dh14, 999);
        System.out.println("Is 999 found? " + notFound);
    }
}
