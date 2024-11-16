package StackQueues.Stack;

// https://www.hackerrank.com/challenges/game-of-two-stacks/problem

import java.util.Arrays;

public class TwoStackGame {

    public static int twoStacks(int maxSum, int sum, int[] A, int[] B, int counter) {
        // Write your code here
        if (sum > maxSum) {
            return counter;
        }

        if (A.length == 0 || B.length == 0) {
            return counter;
        }

        int left = twoStacks(maxSum, sum + A[0], Arrays.copyOfRange(A, 1, A.length), B, counter + 1);
        int right = twoStacks(maxSum, sum + B[0], A, Arrays.copyOfRange(B, 1, B.length), counter + 1);
        return Math.max(left, right);
    }

    public static void main(String[] args) {
        int[] A = {4, 2, 4, 6, 1};
        int[] B = {2, 1, 8, 5};

        System.out.println(twoStacks(10, 0, A, B, 0) - 1);
    }
}
