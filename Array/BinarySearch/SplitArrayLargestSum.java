package Array.BinarySearch;
//! Hard LC 410.
/*Given an integer array nums and an integer k, split nums into k non-empty sub arrays such that the largest sum of any sub-array is minimized.

Return the minimized largest sum of the split.

A sub-array is a contiguous part of the array.*/

public class SplitArrayLargestSum {
    public int splitArray(int[] nums, int k) {
        int start = 0; // this will be the max number in the array.
        int end = 0; // this will be the sum of the array.
        for (int element : nums) {
            start = Math.max(element, start);
            end += element;
        } // We got the range ...

        int sum = 0, counter = 1; // counter is taken 1 initially because the minimun sub-arrays that can be formed in 1 which is equal to the original array.

        while (start <= end) {
            int mid = start + (end - start) / 2;
            for (int element : nums) {
                if (sum + element <= mid) {
                    sum += element;
                } else {
                    sum = element;
                    counter++; //This gives us the number of subarrays that are formed for a particular mid.
                }
            }
            if (counter > k) start = mid + 1;
            else end = mid - 1;
            counter = 1;
            sum = 0;
        }
        return start; //at this point start = our answer
    }

    public static void main(String[] args) {
        SplitArrayLargestSum obj = new SplitArrayLargestSum();
        int[] nums = {7,2,5,10,8};
        int maxSum = obj.splitArray(nums,2);
        System.out.println("The minimized largest sum of the split : " + maxSum);
    }
}
