package Array.BinarySearch;

/*Given an array/list of length ‘n’, where the array/list represents the boards and each element of the given array/list represents the length of each board. Some ‘k’ numbers of painters are available to paint these boards. Consider that each unit of a board takes 1 unit of time to paint.

You are supposed to return the area of the minimum time to get this job done of painting all the ‘n’ boards under a constraint that any painter will only paint the continuous sections of boards.

Example :
Input: arr = [2, 1, 5, 6, 2, 3], k = 2

Output: 11*/

import java.util.ArrayList;
import java.util.Arrays;

public class PaintersPartitionProblem {

    private static boolean isPossibleAns(ArrayList<Integer> boards, int k, int givenTime) {
        int time = 0; // time required x amount of boards. The idea is that if the time exceeds the mid then we will assign that task to another painter.
        int reqPainters = 1; //no of painters required to paint the boards in the given time.
        for (Integer board : boards) {
            if(board > givenTime) return false;
            if (time + board <= givenTime) {
                time = time + board;
            } else {
                reqPainters++;
                time = board;
            }
        }
        return reqPainters <= k && time <= givenTime; //if the required no of painters is equal to k then return true.
    }

    public static int findLargestMinDistance(ArrayList<Integer> boards, int k) {
        //    Write your code here.
        int ans = 0;
        int start = boards.getFirst();
        int end = 0;
        for (int elem : boards) {
            start = Math.min(start, elem); //start will be equal to the minimum of the boards.
            end += elem;//and end will be the sum of all elements.
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPossibleAns(boards, k, mid)) {
                ans = mid;
                end = mid - 1;
            } else start = mid + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> boards = new ArrayList<>(Arrays.asList(2,3,2,8,2,7,6,6,10,8));
        int k = 7; // No of Painters
        int answer = findLargestMinDistance(boards, k);
        System.out.println("The length of boards = " + boards);
        System.out.println("The maximum possible minimum distance : " + answer);
    }
}
