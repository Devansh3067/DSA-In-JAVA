package Recursion;

public class LearnRecursion {
    //Recursion means calling a function by itself...
    //Ques : make a function that takes a number as arg and then prints it... and then print first five natural numbers.
    public static void main(String[] args) {
        number(1); //if we don't use the recursion then we have to call the function 5 times.
    }

    public static void number(int n) {
        if (n > 5)
            return; // base condition. If we don't provide this condition then the Que keeps on getting filled and a time comes when the Que overflows (StackQueues.Stack overflow error).
        System.out.println(n);
        number(++n);
    }

}
