package Array.BinarySearch;
//* Medium

/*Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.

Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return the minimum integer k such that she can eat all the bananas within h hours.*/

import java.util.Arrays;

public class KokoEatingBanana {

    static boolean isPossibleAns(int[] piles,int h,int givenSpeed){
        double reqHours = 0.0;
        for(int pile : piles){
            reqHours += Math.ceil((double) pile / givenSpeed);
        }
        return reqHours <= h;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = piles[0];
        for (int i = 1; i < piles.length; i++) {
            if (piles[i] > end) end = piles[i]; //end = max element of the array...
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPossibleAns(piles, h, mid)) {
                end = mid - 1;
            } else start = mid + 1;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] piles = {30,11,23,4,20};
        int h = 6; // No of hours.
        System.out.println("The no of bananas in each piles : " + Arrays.toString(piles));
        int answer = minEatingSpeed(piles, h);
        System.out.println("The minimum possible speed (bananas per hour) : " + answer);
    }
}
