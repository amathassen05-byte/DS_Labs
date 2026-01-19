package Assignment_2;

import java.util.Stack;

public class Ques2 {


    public static Stack<Integer> sortStack(Stack<Integer> input) {
        Stack<Integer> tempStack = new Stack<>();

        while (!input.isEmpty()) {
            int current = input.pop();


            while (!tempStack.isEmpty() && tempStack.peek() > current) {
                input.push(tempStack.pop());
            }

            tempStack.push(current);
        }

        return tempStack;
    }

    public static void printStack(Stack<Integer> stack) {
        for (Integer i : stack) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

