package Recursion.Arrays;

import java.util.Arrays;

public class MergeSortII {
    private static void merger(int[] num, int start, int mid, int end) {
        int[] merged = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0;
        while (i < mid && j < end) {
            if (num[i] < num[j]) {
                merged[k++] = num[i++];
            } else {
                merged[k++] = num[j++];
            }
        }
        while (i < mid) {
            merged[k++] = num[i++];
        }
        while (j < end) {
            merged[k++] = num[j++];
        }

        System.arraycopy(merged, 0, num, start, merged.length);
    }

    public static void mergeSortII(int[] num, int start, int end) {
        if (end - start == 1) return;
        int mid = (start + end) / 2;
        mergeSortII(num, start, mid);
        mergeSortII(num, mid, end);
        merger(num, start, mid, end);
    }

    public static void main(String[] args) {
        int[] array1 = {879, 201, 302, 552, 318, 530, 898};
        mergeSortII(array1, 0, array1.length);
        System.out.println(Arrays.toString(array1));

        int[] array2 = {65, 896, 513, 264, 92, 78, 563, 116, 494, 321, 524, 232, 182, 251, 588, 454, 513, 334, 919};
        mergeSortII(array2, 0, array2.length);
        System.out.println(Arrays.toString(array2));
    }
}
