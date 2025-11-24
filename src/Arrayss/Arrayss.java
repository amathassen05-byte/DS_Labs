package Arrayss;

import java.util.Scanner;

public class Arrayss {
    Scanner scanner = new Scanner(System.in);

    public void input(int[] a) {
        System.out.println("please enter " + a.length + " elements");

        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
    }
    public void ReverseTraversal(int[] a){
        System.out.println("The element in reverse are : ");
        for(int i=a.length-1; i>=0; i--){
            System.out.println("index["+i+"]="+a[i]);
        }
    }
    public void Traversal(int[] a) {
        System.out.println("The elements are : ");

        for (int i = 0; i < a.length; i++) {
            System.out.println("Index[" + i + "] = " + a[i]);
        }
    }
    public void Traversal2(int[] a){
        for(int e :a){
            System.out.println(e);
        }
    }
    public void update(int[] a, int index, int nvalue){
        if(index<0 || index>=length)
            System.out.println("Index not found");
        else
            a[index]=nvalue;
    }

}
