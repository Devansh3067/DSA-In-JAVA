package StackQueues.Queue.CustomQueue;

public class SQueue {
    protected int[] stack;
    private static final int DEFAULT_SIZE = 10;

    int front = -1;
    int rear = -1;

    SQueue(){
//        this.Que = new int[DEFAULT_SIZE];
        this(DEFAULT_SIZE);
    }
    SQueue(int size){
        this.stack = new int[size];
    }

    public boolean insert(int val){
        if (isFull()) {
            System.out.println("The StackQueues.Stack is Full");
            return false;
        }
        if(front == -1) front = 0;
        stack[++rear] = val;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot remove from empty queue");
        }
        return stack[front++];
    }

    public boolean isFull() {
        return rear == stack.length -1;
    }

    private boolean isEmpty() {
        return front == -1;
    }
}

