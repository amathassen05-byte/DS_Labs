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

    /* public void ReverseTraversal(int[] a){
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
          if(index<0 || index>=a.length)
              System.out.println("Index not found");
          else
              a[index]=nvalue;
          for (int i = 0; i < a.length; i++) {
              System.out.println("Index[" + i + "] = " + a[i]);
          }
      }
    public void delete(int[] a, int index){
        if(index<0 || index>=a.length)
            System.out.println("Index not found");
        else
            a[index]=0;
        for (int i = 0; i < a.length; i++) {
            System.out.println("Index[" + i + "] = " + a[i]);
        }
    }*/
    public void ShiftLeft_delete(int[] a, int index) {
        for (int i = index; i < a.length - 1; i++)
            a[i] = a[i + 1];
        a[a.length - 1] = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            System.out.println("Index[" + i + "] = " + a[i]);
        }
    }

    public int linearSearch(int[] a, int svalue) {
        for (int i = 0; i < a.length; i++) {
            if (svalue == a[i])
                return i;
        }
        return -1;
    }
    public void ShitRight_delete(int[] a, int index) {
        for (int i = a.length-2; i >=index ; i--)
          a[i + 1] = a[i]  ;
        a[index] = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            System.out.println("Index[" + i + "] = " + a[i]);
        }
    }
}

