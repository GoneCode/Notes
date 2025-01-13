package TOPIC_6_DSA_problems.Stack;

public class StackImpl {

    private int[] stack;
    private int top;
    private final int maxSize;
    // implement push method using stack

    public StackImpl(int maxSize) {
        stack  = new int[maxSize];
        this.maxSize = maxSize;
        this.top = -1;
    }

    public boolean push(int value) {
        if(top < maxSize - 1) {
            top++;
            stack[top] = value;
            return true;
        }
        return false;
    }

    // implement pop method using stack

    public int pop() {
        if(top >= 0) {
            int value = stack[top];
            top--;
            return value;
        }
        return -1;
    }

    public int peek(){
        if(top >= 0) {
            return stack[top];
        }
        return -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public static void main(String[] args) {
        StackImpl stack = new StackImpl(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.peek()); // should print 5
        System.out.println(stack.pop()); // should print 5
        System.out.println(stack.peek()); // should print 4
        System.out.println(stack.isEmpty()); // should print false
        System.out.println(stack.isFull()); // should print false
    }
}
