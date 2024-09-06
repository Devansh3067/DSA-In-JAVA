package Array.BinarySearch;

/*Problem statement
You are given an array 'arr' consisting of 'n' integers which denote the position of a stall.

You are also given an integer 'k' which denotes the number of aggressive cows.

You are given the task of assigning stalls to 'k' cows such that the minimum distance between any two of them is the maximum possible.

Print the maximum possible minimum distance.

Example:
Input: 'n' = 3, 'k' = 2 and 'arr' = {1, 2, 3}*/

import java.util.Arrays;

public class AggressiveCows {

    public int aggressiveCows(int[] stalls, int k) {
        //    Write your code here.
        int ans = 0;
        int start = 2; // Minimum possible distance between any two cows (as said in the question).
        int end = stalls[stalls.length - 1] - stalls[0]; //Maximum possible distance between any two cows.

        //We are going to apply the binary search on possible distances ... starting from start and ending on end.
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPossibleAnswer(mid, k, stalls)) { //if we get true that means the answer is valid,
                ans = mid; //might be a possible answer.
                start = mid + 1; // but we have to check if any other answer(maximum) is possible or not.
            } else end = mid - 1;
        }
        return ans;
    }

    private boolean isPossibleAnswer(int distance, int k, int[] stalls) {
        int prevCow = stalls[0]; // the position of the previous cow... The first cow will be at stall 1.
        k--; //k is the no of cows left to be places. The first cow will be placed at stall 1 thus k--;
        for (int stall : stalls) {
            if ((stall - prevCow) >= distance) { //If both cows have a minimum distance of "distance" then place a cow at that stall index.
                prevCow = stall; // Placing a cow in the stall.
                k--; //No of cows left to be placed is reduced by 1.
            }
            if (k == 0)
                return true; //of none of the cows are left to placed... that means the distance we got may be a valid answer.
        }
        return false;
    }

    public static void main(String[] args) {
        AggressiveCows obj = new AggressiveCows();

        int[] stalls = {0, 3, 4, 7, 10, 9};
        int k = 4; // No of cows
        Arrays.sort(stalls); // Sorted
        System.out.println("The stalls are at position : " + Arrays.toString(stalls));
        int answer = obj.aggressiveCows(stalls, k);
        System.out.println("The maximum possible minimum distance : " + answer);
    }
}