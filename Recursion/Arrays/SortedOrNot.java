package Recursion.Arrays;

public class SortedOrNot {
    public static boolean isSorted(int[] nums, int idx) {
        if (idx == nums.length - 1) return true;
//        if (nums[idx] < nums[idx + 1]) return isSorted(nums, idx + 1);
//        return false;
        return nums[idx] < nums[idx + 1] && isSorted(nums, idx + 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 6, 8, 9};
        System.out.println(isSorted(nums, 0) ? "Sorted" : "Not Sorted");
    }
}