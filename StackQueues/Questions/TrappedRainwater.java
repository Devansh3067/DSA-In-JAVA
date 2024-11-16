package StackQueues.Questions;

//? https://leetcode.com/problems/trapping-rain-water/description/?envType=problem-list-v2&envId=stack

import java.util.ArrayList;
import java.util.List;

/**
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
 */

public class TrappedRainwater {
    public static int trap(int[] height) {
        int[] left_max = leftMax(height);
        int[] right_max = rightMax(height);
        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            sum += Math.min(left_max[i], right_max[i]) - height[i];
        }
        return sum;
    }

    private static int[] rightMax(int[] height) {
        int[] right = new int[height.length];
        int n = height.length;
        right[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }
        return right;
    }

    private static int[] leftMax(int[] height) {
        int[] left = new int[height.length];
        left[0] = height[0];
        for (int i = 1; i < left.length; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }
        return left;
    }

    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] height2 = {4, 2, 0, 3, 2, 5};
        System.out.println(trap(height));
        System.out.println(trap(height2));

        List<Boolean> ans = new ArrayList<>();
        ans.add(true);
        ans.add(false);
        System.out.println(ans);
    }
}
