package Recursion.Arrays;

import java.util.Arrays;

public class BubbleSort {
    public static void bubble(int[] num, int length, int idx) {
        if (length == 0) return;
        if (idx < length) {
            if (num[idx] > num[idx + 1]) {
                int temp = num[idx];
                num[idx] = num[idx + 1];
                num[idx + 1] = temp;
            }
            bubble(num, length, idx+1);
        } else {
            bubble(num, length - 1, 0);
        }
    }

    public static void main(String[] args) {
        int[] num = {3, 2, 5, 1, 12};
        bubble(num, num.length - 1, 0);
        System.out.println(Arrays.toString(num));
    }
}
