package Recursion;

public class CountZeros {
    public static int count1(int num, int counter) {
        if (num == 0) return counter;
        if (num % 10 == 0) return count1(num / 10, ++counter);
        return count1(num / 10, counter);
    }
    public static int count2(int num){
        if(num == 0) return 0;
        if(num%10==0) return 1 + count2(num/10);
        return count2(num/10);
    }

    public static void main(String[] args) {
        int num = 300400005;
        System.out.println("No of zeroes = " + count1(num, 0));
        System.out.println("No of zeroes = " + count2(num));
    }
}
