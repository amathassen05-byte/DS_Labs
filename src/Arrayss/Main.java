package Arrayss;


public class Main {

    public static void main(String[] args) {
        Arrayss arr=new Arrayss();
        int []numbers=new int[5];
        arr.input(numbers);
        //arr.ReverseTraversal(numbers);
       // arr.Traversal(numbers);
        //arr.Traversal2(numbers);
       // arr.update(numbers, 2, 4);
        //arr.delete(numbers,1);
        arr.ShiftLeft_delete(numbers,2);
    }
}
