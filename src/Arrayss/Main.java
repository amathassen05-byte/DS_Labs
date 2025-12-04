package Arrayss;


public class Main {

    public static void main(String[] args) {
        Arrayss arr=new Arrayss();
        int []numbers=new int[5];
        //int []numbers ={10,20,30,40,50};
        arr.input(numbers);
        //arr.ReverseTraversal(numbers);
       // arr.Traversal(numbers);
        //arr.Traversal2(numbers);
       // arr.update(numbers, 2, 4);
        //arr.delete(numbers,1);
        //arr.ShiftLeft_delete(numbers,2);
        arr.ShitRight_delete(numbers,1);
        /*int result=arr.linearSearch(numbers,4);
        if (result!= -1)
            System.out.println("The index is found :"+result);
        else
            System.out.println("Nut found :");*/


    }
}
