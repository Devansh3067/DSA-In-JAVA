package Recursion.Arrays;

public class LinearSearch {
    public static boolean linear(int[] num, int idx, int target) {
        if (idx == num.length - 1) return false;
        if (num[idx] == target) return true;
        return linear(num, idx + 1, target);
    }

    public static void main(String[] args) {
        int[] num = {2, 4, 12, 1, 14, 3, 24, 5};
        int target = 12;
        System.out.println(linear(num, 0, target) ? "Present" : "Not Present");
    }
}
