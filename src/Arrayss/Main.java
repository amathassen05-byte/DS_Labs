package Arrayss;


public class Main {

    public static void main(String[] args) {
        Arrayss arr=new Arrayss();
        int []numbers=new int[5];
        arr.input(numbers);
        arr.Traversal(numbers);
        arr.Traversal2(numbers);
        arr.update(numbers, 9, 4);
    }
}
