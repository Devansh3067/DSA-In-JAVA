package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 .... up to nth . Find nth
        int n = 3;
        int number = series(n);//this will not work n=50
        long fibo = fibonacciFormula(50);//but this will work for any number
        System.out.println("The nth fibonacci number = " + number) ;
        System.out.println("The nth fibonacci number = " + fibo) ;
    }
    public static long fibonacciFormula(int n){
        double root_5 = Math.sqrt(5);
        return (long) Math.pow((1+root_5)/2,n);
    }
    public static int series(int n) {
        //This has exponential time complexity thus for numbers like 50 this will not run...
        if(n == 1) return 1;
        if(n == 0) return 0;
        return series(n - 1) + series(n - 2);
    }
}
