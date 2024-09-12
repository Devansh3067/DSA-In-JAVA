package Recursion.Arrays;

import java.util.Arrays;

public class SelectionSort {


    public static void selection(int[] num, int len, int idx, int maxIdx) {
        if (len == 0) return;
        if (idx <= len) {
            if (num[maxIdx] < num[idx]) {
                selection(num, len, idx + 1, idx);
            } else{
                selection(num, len, idx+1, maxIdx);
            }
        } else {
            int temp = num[len];
            num[len] = num[maxIdx];
            num[maxIdx] = temp;
            selection(num, len - 1, 0, 0);
        }
    }

    public static void main(String[] args) {
        int[] num = {5, 4, 3, 2, 1};
        selection(num, num.length - 1, 0, 0);
        System.out.println(Arrays.toString(num));
    }
}
