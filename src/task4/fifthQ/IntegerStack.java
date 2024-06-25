package task4.fifthQ;

import java.util.Stack;

public class IntegerStack {
    // Stack to store integers
    private Stack<Integer> stack;

    // Constructor to initialize the stack
    public IntegerStack() {
        stack = new Stack<>();
    }

    // Method to push an element onto the stack
    public void pushElement(int element) {
        stack.push(element);
        System.out.println("Pushed element: " + element);
    }

    // Method to pop an element from the stack
    public int popElement() {
        if (!stack.isEmpty()) {
            int poppedElement = stack.pop();
            System.out.println("Popped element: " + poppedElement);
            return poppedElement;
        } else {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1; // Returning a sentinel value to indicate an error
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        boolean empty = stack.isEmpty();
        if(empty) {
        System.out.println("Stack is empty");
        }
        if(!empty) {
        System.out.println("Stack is not empty");
        }
        return empty;
    }

    public static void main(String[] args) {
        // Create an instance of IntegerStack
        IntegerStack intStack = new IntegerStack();
        
        // Pushing elements onto the stack
        intStack.pushElement(10);
        intStack.pushElement(20);
        intStack.pushElement(30);

        // Checking if the stack is empty
        intStack.isEmpty();

        // Popping elements from the stack
        intStack.popElement();
        intStack.popElement();
        intStack.popElement();

        // Checking if the stack is empty after popping all elements
        intStack.isEmpty();
        
      
    }
}
