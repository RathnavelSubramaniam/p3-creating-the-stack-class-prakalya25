class Stack1 {
    int stck[];
    int top;

    // Constructor to initialize the stack
    Stack1(int s) {
        stck = new int[s];
        top = -1;
    }

    // Method to push an element into the stack
    void push(int item) {
        if (top > stck.length - 1) {
            System.out.println("Stack is full");
        } else {
            stck[++top] = item;
        }
    }

    // Method to pop an element from the stack
    int pop() {
        if (top < 0) {
            System.out.println("Stack is empty!");
            return -1; // Choose an appropriate return value
        } else {
            return stck[top--];
        }
    }

    // Method to peek at the top element of the stack
    int peek() {
        if (top < 0) {
            System.out.println("Stack is empty!");
            return -1; // Choose an appropriate return value
        } else {
            return stck[top];
        }
    }
}

public class Practical3 {
    public static void main(String[] args) {
        Stack1 s1 = new Stack1(4);

        // Push elements into the stack
        for (int i = 1; i <= 4; i++) {
            s1.push(i * 5);
        }

        System.out.println("Stack Contents:");
        
        // Pop elements from the stack and display them
        for (int i = 0; i < 4; i++) {
            System.out.println(s1.pop());
        }
        
        // Peek at the top element of the stack
        System.out.println("Top element: " + s1.peek());
    }
}
