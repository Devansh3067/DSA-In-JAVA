package Recursion;

public class OneToN {
    public static void printRev(int num){
        if(num==0) return;
        System.out.println(num);
        printRev(num-1);
    }
    public static void printTill(int n){
        if(n==0) return;
        printTill(n-1);
         System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 5;
        printTill(n);
        printRev(n);
    }
}
