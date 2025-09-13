package mystack;

public class MyStack {
    private final int maxSize;
    private int[] mArray;
    private int top;

    public MyStack(int size) {
        this.maxSize = size;
        this.mArray = new int[maxSize];
        this.top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        mArray[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Indicating stack is empty
        }
        return mArray[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // Indicating stack is empty
        }
        return mArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public int length() {
        return top + 1;
    }
}
