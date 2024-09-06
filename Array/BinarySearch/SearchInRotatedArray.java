package Array.BinarySearch;
// * Medium

//There is an integer array nums sorted in ascending order (with distinct values).
//
//Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

import java.sql.SQLOutput;

public class SearchInRotatedArray {

    int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else return mid;
        }
        return -1;
    }

    public int findPivot(int[] arr) {
//        System.out.println("called");
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[end]) {
                start = mid + 1;
            }
            else if (arr[mid] < arr[end]) {
                end = mid;
            } else {
                end--;
            }
        }
        return start;
    }

    public int search(int[] nums, int target) {
        //finding peak index
        int pivot = findPivot(nums);
        System.out.println(pivot);
        int index = binarySearch(nums, target, 0, pivot);
        return (index != -1) ? index : binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    public static void main(String[] args) {
        SearchInRotatedArray obj = new SearchInRotatedArray();
        int[] nums = {1,0,1,1,1};
        int target = 0;
        System.out.println("The index of target number is: " + obj.search(nums,target));
    }
}
