package Array.BinarySearch;
//! Hard LC - 04.
/*Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).*/

public class MedianOfTwoSortedArray {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //we have to ensure that the nums1 array is always the smaller one ie with lesser length...
        int m = nums1.length;
        int n = nums2.length;

        if(m > n){
            return findMedianSortedArrays(nums2 , nums1);
        }
        int start = 0;
        int end = m;

        while(start <= end){
            int mid1 = start + (end-start)/2;
            int mid2 = (m+n+1)/2 - mid1;
            int l1 = Integer.MIN_VALUE;
            int l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE;
            int r2 = Integer.MAX_VALUE;
            if(mid1 - 1 >= 0) l1 = nums1[mid1-1];
            if(mid2 - 1 >= 0) l2 = nums2[mid2-1];
            if(mid1 < m) r1 = nums1[mid1];
            if(mid2 < n) r2 = nums2[mid2];

            if(l1 > r2) end = mid1 - 1;
            else if(l2 > r1) start = mid1 + 1;
            else {
                return ((m+n)%2 == 0)? ((Math.max(l1,l2) + Math.min(r1,r2)) / 2.0) : (Math.max(l1,l2));
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        MedianOfTwoSortedArray obj = new MedianOfTwoSortedArray();
        int[] nums1 = {7,12,14,15,16};
        int[] nums2 = {1,2,3,4,9,11};
        double median = obj.findMedianSortedArrays(nums1 , nums2);
        System.out.println("The median = " + median);
    }
}
