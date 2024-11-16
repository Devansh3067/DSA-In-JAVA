package StackQueues.Stack.CustomStack;

public class Main {
    public static void main(String[] args) throws Exception{
        StaticStack stack = new StaticStack(5); // If we give a size then Que is formed of that size else the Que is formed of size 10 by default...
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.print();
        System.out.println(stack.print());

        stack.pop();
        System.out.println(stack.print());

        System.out.println(stack.peek());

        DStack stack1 = new DStack();
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);
        stack1.push(50);
        stack1.push(60);
        stack1.push(60);
        System.out.println(stack1.print());

        stack1.pop();
        System.out.println(stack1.print());

    }
}
