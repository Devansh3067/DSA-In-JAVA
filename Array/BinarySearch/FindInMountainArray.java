package Array.BinarySearch;
//! Hard

public class FindInMountainArray {

    int binarySearch(int[] arr, int target, int start, int end, boolean ascending) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target > arr[mid]) {
                if (ascending) start = mid + 1;
                else end = mid - 1;
            } else if (target < arr[mid]) {
                if (ascending) end = mid - 1;
                else start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

//    public int peakIndexInMountainArray(int[] arr, int target) {
//        int start = 0;
//        int end = arr.length - 1;
//        while (start < end) {
//            int mid = start + (end - start) / 2;
//            if (arr[mid] > arr[mid + 1]) end = mid;
//            else start = mid + 1;
//        }
////        System.out.println(start);
//        int asc = binarySearch(arr, target, 0, start, true);
//        return (asc != -1) ? asc : binarySearch(arr, target, start, arr.length - 1, false);
//    }

    public static void main(String[] args) {
        FindInMountainArray obj = new FindInMountainArray();
        PeakInMountainArray obj1 = new PeakInMountainArray();

        int[] nums = {1,2,3,4,5,3,1};
        int target = 3;

        int peak = obj1.peakIndexInMountainArray(nums); // calling this function from another class.
        int asc = obj.binarySearch(nums, target, 0, peak, true);
        int result = (asc != -1) ? asc : obj.binarySearch(nums, target, peak, nums.length - 1, false);
        System.out.println("Index of the target no : " + result);
    }
}
