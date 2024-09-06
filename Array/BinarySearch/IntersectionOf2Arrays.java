package Array.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOf2Arrays {
    public static boolean isPresent(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return true;
            else if (nums[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return false;
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>(1);
        if (nums1.length > nums2.length) return intersection(nums2, nums1);
        Arrays.sort(nums2);
        for (int elem : nums1) {
            if (isPresent(nums2, elem) && !list.contains(elem)) {
                list.add(elem);
            }
        }
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i); // Unboxing Integer to int
        }
        return array;
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 3, 4, 7, 10, 9};
        int[] nums2 = {0, 3, 4, 7, 10, 9};
        int[] answer = intersection(nums1,nums2);
        System.out.println(Arrays.toString(answer));
    }
}
