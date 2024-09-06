package Array.BinarySearch;
//* Medium
//You may recall that an array arr is a mountain array if and only if:
//
//arr.length >= 3
//There exists some i with 0 < i < arr.length - 1 such that:
//arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
//arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
//Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.

public class PeakInMountainArray {

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid == 0){
                return 1;
            }
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
            else if(arr[mid] > arr[mid-1]) start = mid+1;
            else end = mid-1;
        }
        return -1;
    }

    public int peakIndexInMountainArrayBetterWay(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]) end = mid;
            else start = mid+1;
        }
        return start;
    }

    public static void main(String[] args) {
        PeakInMountainArray obj = new PeakInMountainArray();

        int[] nums = {0,5,3,1};
        int result = obj.peakIndexInMountainArray(nums);
        int resultBetterWay = obj.peakIndexInMountainArrayBetterWay(nums);
        System.out.println("The peak index is found at : " + result);
        System.out.println("The peak index is found at : " + resultBetterWay);
    }
}
