package Array.BinarySearch;

import java.util.Arrays;

public class AllocateBooks {

    public static boolean isPossibleAns(int[] time, long givenTime, int n) {
        long ans = 0;
        long reqDays = 1;
        for (int element : time) {

            if (element + ans <= givenTime) {
                ans = element + ans;
            } else {
                reqDays++;
                ans = element;
            }
        }
        return reqDays <= n && ans <= givenTime;
    }

    public static long ayushGivesNinjatest(int n, int m, int[] time) {
        // Write your code here.
        long start = time[0];
        long end = time[0];
        for (int element : time) {
            start = Math.max(start, element);
            end += element;
        }
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (isPossibleAns(time, mid, n)) {
                end = mid - 1;
            } else start = mid + 1;
        }
        return start;
    }

    public static void main(String[] args) {

        int[] stalls = {1,2,2,3,1};
        int n = 3; // No of days
        System.out.println("The time taken to complete each chapter : " + Arrays.toString(stalls));
        long answer = ayushGivesNinjatest(n, stalls.length, stalls);
        System.out.println("The minimum possible maximum time : " + answer);
    }
}
