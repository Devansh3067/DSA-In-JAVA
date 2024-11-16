package StackQueues.Questions;

import java.util.Arrays;
import java.util.Stack;

public class LargestRectangleInHistogram {
    public static int largestRectangleAreaI(int[] heights) {//? BruteForce Approach O(N^2)
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            int left = i;
            int right = i;
            while (left != -1 && heights[left] >= heights[i]) {
                left--;
            }
            while (right != heights.length && heights[right] >= heights[i]) {
                right++;
            }
            int area = (right - left - 1) * heights[i];
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }

    private static int[] nextSmallerElement(int[] arr, int n) {
        // Write your code here.
        int[] pos = new int[n];
        Stack<Integer> stack = new Stack<>();
        stack.add(-1);
        for (int i = n - 1; i >= 0; i--) {
            while (stack.peek() != -1 && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }
            pos[i] = stack.peek();
            stack.add(i);
        }
        return pos;
    }

    private static int[] prevSmallerElement(int[] arr, int n) {
        // Write your code here.
        int[] pos = new int[n];
        Stack<Integer> stack = new Stack<>();
        stack.add(-1);
        for (int i = 0; i < n; i++) {
            while (stack.peek() != -1 && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }
            pos[i] = stack.peek();
            stack.add(i);
        }
        return pos;
    }

    public static int largestRectangleArea(int[] heights) {//? Better Approach O(N)
        int maxArea = -1;
        int[] prev = prevSmallerElement(heights, heights.length);
        int[] next = nextSmallerElement(heights, heights.length);
        for (int i = 0; i < heights.length; i++) {
            int p = prev[i];
            int n = next[i];

            if (n == -1) {
                n = heights.length;
            }

            int area = (n - p - 1) * heights[i];
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = {2, 4};
        System.out.println("The largest area in the histogram = " + largestRectangleArea(heights));

        System.out.println("Prev =" + Arrays.toString(prevSmallerElement(heights, heights.length)));
        System.out.println("next =" + Arrays.toString(nextSmallerElement(heights, heights.length)));
    }
}
