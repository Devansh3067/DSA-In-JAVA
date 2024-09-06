package Recursion;

public class SumOfDigits {
    public static int sum(int num){
        if(num == 0) return 0;
        return num%10 + sum(num/10);
    }
    public static void main(String[] args) {
        int num = 4650;
        System.out.println(sum(num));
    }
}
