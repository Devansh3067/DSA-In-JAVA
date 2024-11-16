package StackQueues.Queue.CustomQueue;

public class SCircularQueue {
    protected int[] Que;
    private static final int DEFAULT_SIZE = 10;

    int front = -1;
    int rear = -1;

    SCircularQueue() {
//        this.Que = new int[DEFAULT_SIZE];
        this(DEFAULT_SIZE);
    }

    SCircularQueue(int size) {
        this.Que = new int[size];
    }

    public boolean isFull() {
        return (front == (rear + 1) % Que.length);
    }

    private boolean isEmpty() {
        return front == -1;
    }

    boolean insert(int val) throws Exception {
        if (isFull()) {
            throw new Exception("Overflow");
        }
        if (front == -1) front = 0;
        rear = (rear + 1) % Que.length;
        Que[rear] = val;
        return true;
    }

    int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Underflow");
        }
        int val = Que[front];
        if (front == rear) {
            front = -1;
            rear = -1;
            return val;
        }
        front = (front + 1) % Que.length;
        return val;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        for (int i = front; ;i = (i + 1) % Que.length) {
            System.out.print(Que[i] + " --> ");
            if(i == rear){
                break;
            }
        }
        System.out.println("END");
    }
}
