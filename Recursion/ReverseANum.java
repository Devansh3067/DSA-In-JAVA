package Recursion;

public class ReverseANum {
    public static int rev(int n) {
        int digits = (int)(Math.log10(n))+1;
        if (n < 10) return n;
        return n % 10 * (int) Math.pow(10, digits-1) + rev(n / 10);
    }

    public static void main(String[] args) {
        int num = 4567;
        System.out.println("Reverse = " + rev(num));
    }
}
