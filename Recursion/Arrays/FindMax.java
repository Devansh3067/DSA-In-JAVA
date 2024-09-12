package Recursion.Arrays;

public class FindMax {
    public static int findMax(int[] num, int idx) {
        int max = num[idx];
        if (idx == num.length - 1) return max;
        return Math.max(max, findMax(num, idx + 1));
    }

    public static void main(String[] args) {
        int[] num = {63, 2, 5, 12, 1, 34};
        System.out.println("Max = " + findMax(num, 0));
    }
}
