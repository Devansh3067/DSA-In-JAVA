package Array.BinarySearch;

/*Given an array arr[] of size N having distinct numbers sorted in increasing order and the array has been right rotated (i.e, the last element will be cyclically shifted to the starting position of the array) k number of times, the task is to find the value of k.*/

public class FindRotationCount {
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


    public static void main(String[] args) {
        SearchInRotatedArray obj = new SearchInRotatedArray();
        int[] nums = {1,3,5};
        int pivotIndex = obj.findPivot(nums); // Calling from another class
        System.out.println("Lowest Number in the array = " + nums[pivotIndex]);
        System.out.println("The pivot is at : " + pivotIndex);
        System.out.println("Thus the rotation count :" + ((pivotIndex == nums.length - 1) ? 0 : pivotIndex + 1));
    }
}
