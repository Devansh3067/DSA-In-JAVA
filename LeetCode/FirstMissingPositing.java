package LeetCode;
//! Hard

/*Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

*/

public class FirstMissingPositing {

    void quickSort(int[] nums){
        int i = 0 , temp;
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            //We have to ignore the negatives, zero and any number greater than nums.length if any.
            //because we have to return the least positive number...
            if((nums[i]<nums.length && nums[i]>0) && (nums[i] != nums[correctIndex])){
                temp = nums[correctIndex];
                nums[correctIndex] = nums[i];
                nums[i] = temp;
            } else i++;
        }
    }
    public static void main(String[] args) {
        FirstMissingPositing obj = new FirstMissingPositing();

        int[] nums = {1,-3,4,2,2,3,52,-4,2,34,-56,3,4,5,6,7,8,9,10,11,2};
        //Using cyclic sort
        obj.quickSort(nums);
        int answer = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != i+1) {
                answer = i+1;
                break;
            }
            else {
                answer = nums.length + 1;
            }
        }
        System.out.println(answer);
    }
}
