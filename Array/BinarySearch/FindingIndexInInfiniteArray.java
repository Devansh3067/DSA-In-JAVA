package Array.BinarySearch;

//The infinite array means that we cannot know the length of the array...

public class FindingIndexInInfiniteArray {

    int[] findRange(int[] nums, int target) {
        int start = 0;
        int end = 1;
        while (nums[end] < target) {
            int tempStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = tempStart;
        }
        return searchRange(start, end, nums, target);
    }

    int[] searchRange(int start, int end, int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        int[] result = {-1, -1};
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] >= target) end = mid - 1;
            else start = mid + 1;
        }
        result[0] = (start != nums.length && nums[start] == target) ? start : -1;
        if (result[0] != -1) { // if the start index is -1 that means the target is not present, and thus we don't need to check for the last index...
            start = 0;
            end = nums.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (nums[mid] <= target) start = mid + 1;
                else end = mid - 1;
            }
            result[1] = (end != -1 && nums[end] == target) ? end : -1;
        }

        return result;
    }

    public static void main(String[] args) {
        FindingIndexInInfiniteArray obj = new FindingIndexInInfiniteArray();

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = obj.findRange(nums, target);
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }
}
