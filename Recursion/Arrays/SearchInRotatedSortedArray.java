package Recursion.Arrays;

public class SearchInRotatedSortedArray {
    public static int binary(int[] num, int target, int start, int end) {
        if (start > end) return -1;
        int mid = start + (end - start) / 2;
        if (num[mid] == target) return mid;
        if (num[start] <= num[mid]) {
            if (target >= num[start] && target <= num[mid]) {
                return binary(num, target, start, mid - 1);
            } else return binary(num, target, mid + 1, end);
        }
        if (target >= num[mid] && target <= num[end]) {
            return binary(num, target, mid + 1, end);
        }
        return binary(num, target, start, mid - 1);
    }

    public static void main(String[] args) {
        int[] num = {5, 6, 7, 8, 9, 1, 2, 3};
        int target = 2;
        System.out.println(binary(num, target, 0, num.length - 1));
    }
}
