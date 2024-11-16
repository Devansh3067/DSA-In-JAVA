package LeetCode75;

public class IncreasingTripletSubsequence {
    public static boolean increasingTripletII(int[] nums) {
        int n = nums.length;
        int[] small = new int[n];
        int[] large = new int[n];
        small[0] = nums[0];
        for(int i = 1 ; i < n ; i++){
            small[i] = Math.min(small[i-1],nums[i]);
        }
        large[n-1] = nums[n-1];
        for(int i = n-2 ; i >= 0 ; i--){
            large[i] = Math.max(large[i+1],nums[i]);
        }
        for(int i = 0 ; i < n ; i++){
            if(nums[i] != small[i] && nums[i] != large[i]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(increasingTripletII(new int[]{1,2,3,4,5}));
        System.out.println(increasingTripletII(new int[]{5,4,3,2,1}));
        System.out.println(increasingTripletII(new int[]{2,1,5,0,4,6}));
    }
}
