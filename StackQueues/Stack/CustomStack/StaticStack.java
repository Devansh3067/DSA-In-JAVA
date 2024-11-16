package StackQueues.Stack.CustomStack;

public class StaticStack {
    protected int[] stack;
    private static final int DEFAULT_SIZE = 10;
    int top = -1;

    StaticStack(){
//        this.Que = new int[DEFAULT_SIZE];
        this(DEFAULT_SIZE);
    }
    StaticStack(int size){
        this.stack = new int[size];
    }

    public boolean push(int val){
        if (isFull()) {
            System.out.println("The StackQueues.Stack is Full");
            return false;
        }
        stack[++top] = val;
        return true;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot pop from empty Que");
        }
        return stack[top--];
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot peek from empty Que");
        }
        return stack[top];
    }

    public String print(){
        if (top == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(stack[i]);
            if (i == top)
                return b.append(']').toString();
            b.append(", ");
        }
    }

    public boolean isFull() {
        return top == stack.length -1;
    }

    private boolean isEmpty() {
        return top == -1;
    }
}
