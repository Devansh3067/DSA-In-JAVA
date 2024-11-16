package LeetCode75;

import java.util.Arrays;

public class MoveZeros {
    public static int[] moveZeroes(int[] nums) {
        int idx = nums.length-1;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
                idx--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeroes(new int[]{0, 1, 0, 3, 12})));
    }
}
