package Stacks;

import java.util.Stack;

public class StackExample {
    public static void  main(String[] args){
        Stack<Integer> stack = new Stack<>();
        // Pushing elements
        stack.push(1);
        stack.push(2);
        stack.push(30 );
        stack.push(4) ;
        // Peeking
        System.out.println("Top element: " + stack.peek()); // 30

        // Popping
        stack.pop(); // removes 30

        // Checking if empty
        System.out.println("Is stack empty? " + stack.isEmpty()); // false
    }
}
