package Recursion;

public class Factorial {
    public static void main(String[] args) {
        //We know that factorial(n) = n * factorial of n - 1
        int n = 9;
        System.out.println("Factorial = " + factorial(n));
    }

    public static int factorial(int n) {
        if(n < 2) return 1;
        return n * factorial(n - 1);
    }
}
