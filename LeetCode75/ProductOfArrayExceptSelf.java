package LeetCode75;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int p = 1;
        for(int i = 0 ; i < n ; i++){
            res[i] = p;
            p *= nums[i];
        }
        p = 1;
        for(int i = n-1 ; i >= 0 ; i--){
            res[i] *= p;
            p *= nums[i];
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1,1,0,-3,3})));
    }
}
